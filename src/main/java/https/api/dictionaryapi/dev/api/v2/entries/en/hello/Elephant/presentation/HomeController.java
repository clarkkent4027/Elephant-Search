package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.presentation;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@Controller
public class HomeController {
    @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
    @GetMapping("/")
    public String home(){
        return "redirect:swagger-ui.html";

    }



}