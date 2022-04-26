package oslomet.web.springpojo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KundeController {

    @PostMapping("/regKunde")
    public Kunde regKunde(Kunde innkunde){
        return innkunde;
    }

}
