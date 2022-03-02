*)Définitions:

Spring web java:
Un Spring MVC est un framework Java utilisé pour créer des applications Web. Il suit le modèle de conception Modèle-Vue-Contrôleur.

Spring Data JPA:
Spring Data JPA, qui fait partie de la grande famille Spring Data, facilite la mise en œuvre de répertoires basés sur JPA. Il facilite la création d'applications alimentées par Spring qui utilisent des technologies d'accès aux données et a pour objectif de simplifier l'interaction avec différents systèmes de stockage de données 


Spring Hibernate:
C'est l'une des implémentations populaires de JPA. Hibernate comprend les mappages que nous ajoutons entre les objets et les tables. Il garantit que les données sont stockées/récupérées de la base de données en fonction des mappages.

H2:
H2 est l'une des bases de données en mémoire les plus populaires écrites en Java. H2 peut être intégré dans des applications Java ou exécuté en mode client-serveur.Spring Boot fournit une excellente prise en charge de l'intégration pour H2 en utilisant une configuration simple des propriétés.

Spring DevTools:
L'objectif de ce module est d'essayer d'améliorer le temps de développement tout en travaillant avec l'application Spring Boot. (par exemple réexecution du code lors du changement du code).Spring Boot DevTools récupère les modifications et redémarre l'application.

Thymeleaf: 
Thymeleaf est une bibliothèque Java open source sous licence Apache License 2.0. Il s'agit d'un Java XML/XHTML/HTML5 Template Engine.
________________

Etape 13: 
./@GetMapping("/greeting")
./return "greeting"
./On ajoute le paramètre nomTemplate dans la méthode addAttribute de l'objet model, et on récupère cette valeur dans la partie html à l'aide de : ${nomTemplate}

Etape 17:
la table Address est créée avec les attributs id et creation et content

Etape 18:
La table Address est créée grâce à l'annotation @ComponnetScan qui fait un scan dans tous les packages du projet, lors de la création de la classe Address, on ajoute l'annotation @Entity , @ID pour désigner que l'id est la clé primaire et @GeneretedValue pour génerer les id, cette table est ajoutée dans la base de données H2 grâce à l'ajout de la dépendence et l'activation de h2 dans le fichier application.properties

Etape 20:
Oui les données sont bien insérées, mais il faut ajouter spring.jpa.defer-datasource-initialization=true pour que l'insertion passe qu'après la création de la table

Etape 23:
@Autowired sert instancier automatiquement l'attribut AddressRepository 



Etape 6
*)Faut-il une clé API pour appeler Meteo concept ? 
  Oui
*)L'URL à appeler : 
  https://api.meteo-concept.com/api/forecast/daily?token={MON_TOKEN}&latlng={lat},{lon}
*)La méthode qu'utilise HTTP ?
  GET 
*)Comment passer les paramètres d’appels ?
  A travers des request params dans l'url ou dans le header
*)Ou est l’information dont j’ai besoin dans la réponse :
  tmin	integer	Température minimale à 2 mètres en °C
  tmax	integer	Température maximale à 2 mètres en °C
  Pour afficher la prévision de météo du lieu visé par les coordonnées GPS: weather
  
     
