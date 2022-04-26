package oslomet.web.springpojo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KundeController {

    @GetMapping("/")
    public Kunde regKunde(Kunde innkunde){
        return innkunde;
    }

}
