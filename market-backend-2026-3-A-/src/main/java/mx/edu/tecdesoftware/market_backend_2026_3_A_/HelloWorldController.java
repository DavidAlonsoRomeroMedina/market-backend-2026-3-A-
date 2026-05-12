package mx.edu.tecdesoftware.market_backend_2026_3_A_;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class HelloWorldController {

    @GetMapping("/Hola")
    public String saludar(){
        return "Hello World";
    }
}
