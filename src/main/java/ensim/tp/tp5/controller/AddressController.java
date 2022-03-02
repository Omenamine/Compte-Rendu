package ensim.tp.tp5.controller;

import ensim.tp.tp5.Repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AddressController {

    private final AddressRepository addressRepository;

    @GetMapping("/address")
    public String address(){
        return  "address";
    }

    @GetMapping("/addresses")
    public String showAddresses(Model model){
        model.addAttribute("allAddresses", addressRepository.findAll());
        return "addresses";
    }
}
