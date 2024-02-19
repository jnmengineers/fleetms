package jnm.engineers.fleetms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String Home(){
        return "index";
    }
    @GetMapping("/widgets")
    public String Ho(){
        return "widgets";
    }
}
