package ensim.tp.tp5.controller;

import ensim.tp.tp5.domain.AddressResponse;
import ensim.tp.tp5.domain.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;


@Controller()
@RequiredArgsConstructor
public class MeteoController {
    private final RestTemplate client;

    @PostMapping("/meteo")
    public String receiveMeteo(@ModelAttribute("address") String address, Model model) {
        AddressResponse response = client.getForObject("https://api-adresse.data.gouv.fr/search/?q=" + address,
                AddressResponse.class);

        if(response.getFeatures().size() > 0) {
            float lon = response.getFeatures().get(0).getGeometry().getCoordinates().get(0);
            float lat = response.getFeatures().get(0).getGeometry().getCoordinates().get(1);

            WeatherResponse weatherResponse = client.getForObject(
                    "https://api.meteo-concept.com/api/forecast/daily?token=d9a5f570ae5bf3491d6140141540e1b40f07ef04a52f2c14f03c09f819b7110c&latlng="+lat+","+lon
                    ,WeatherResponse.class);
            model.addAttribute("min", weatherResponse.getForecast().get(0).getTmin());
            model.addAttribute("max", weatherResponse.getForecast().get(0).getTmax());
        }
        return "address";
    }
}
