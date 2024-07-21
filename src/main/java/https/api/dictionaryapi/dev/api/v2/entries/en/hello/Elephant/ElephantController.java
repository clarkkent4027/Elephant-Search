package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant;

import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.service.ElephantService;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;

@RestController
public class ElephantController {
    private final ElephantService elephantService;

    public ElephantController(ElephantService elephantService) {
        this.elephantService = elephantService;

    }

    @GetMapping("/searchLocResults")
    public String getDefinition(@RequestParam(value="q") String query){
   /*     String results = elephantService.getDefinition(query);
        if(results.equalsIgnoreCase("")){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Result(s) not found.");
        }
        return results;
        */
    return "hi";
    }

}
