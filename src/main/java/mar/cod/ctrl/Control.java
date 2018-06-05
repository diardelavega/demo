package mar.cod.ctrl;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {

    @RequestMapping("/hello")
    public String hello(){
        return "HELLO";
    }


}
