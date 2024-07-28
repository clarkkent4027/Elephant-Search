package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant;

import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.service.ElephantService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class ElephantController {
    private final ElephantService elephantService;

    public ElephantController(ElephantService elephantService) {
        this.elephantService = elephantService;

    }

    @GetMapping("/searchElephantResults")
    public String getDefinition(@RequestParam(value="q") String query){
       String results = elephantService.getDefinition(query);
       System.out.println(results);
        if(results.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Result(s) not found.");
        }
        return results;
    }

}
