package home.springboot.learning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${spring.application.name}")
    private String appname;

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("appName", appname);
        return "Hello World From " + appname + "!";

    }

}
