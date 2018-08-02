package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingWildFlyController {


    @RequestMapping("greeting")
    public String sayHello(){
        return ("{'hello': 'world'}");
    }
}
