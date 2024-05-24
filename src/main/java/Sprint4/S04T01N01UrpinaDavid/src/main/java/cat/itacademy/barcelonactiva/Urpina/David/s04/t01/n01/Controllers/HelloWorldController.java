package Sprint4.S04T01N01UrpinaDavid.src.main.java.cat.itacademy.barcelonactiva.Urpina.David.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String greetings(@RequestParam(defaultValue =  "UKNOWN") String name){
        return "Hi, " + name + ". You're executing a Maven project.";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String greetings2(@PathVariable (required = false) String name ){
        if (name == null){
            name = "UKNOWN";
        }

        return "Hello, " + name + ". You're executing a Maven project.";
    }
}
