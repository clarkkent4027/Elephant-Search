package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HomeController {
    @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
    @GetMapping("/")
    public String home(){
        return "redirect:swagger-ui.html";

    }



}