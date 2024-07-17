package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant;

import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.service.ElephantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElephantController {
    private final ElephantService elephantService;

    public ElephantController(ElephantService elephantService) {
        this.elephantService = elephantService;
    }

    @GetMapping("/searchLocResults")
    public String getResults(@RequestParam(value="q") String query){
        return elephantService.getResults(query);
    }

}
