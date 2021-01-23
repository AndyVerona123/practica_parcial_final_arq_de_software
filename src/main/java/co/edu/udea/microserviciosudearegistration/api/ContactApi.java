package co.edu.udea.microserviciosudearegistration.api;

import co.edu.udea.microserviciosudearegistration.dto.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ContactApi {

    @RequestMapping(value = "/contact")
    public Contact getContact() {
        return new Contact(10L, "Andres", "Elias",
                "+57 3104982948", "andres.carrascal@udea.edu.co");
    }

}
