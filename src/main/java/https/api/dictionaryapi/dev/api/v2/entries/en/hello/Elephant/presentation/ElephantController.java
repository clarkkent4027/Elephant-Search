package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.presentation;

import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.repository.dto.Definition;
import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.repository.dto.ElephantResponse;
import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.service.ElephantService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;


@RestController
@CrossOrigin
public class ElephantController {
    private final ElephantService elephantService;

    public ElephantController(ElephantService elephantService) {
        this.elephantService = elephantService;

    }

    @GetMapping("/searchElephantResults")
    public List<Definition> getDefinition(@RequestParam(value="q") String query){
       List<Definition> results = elephantService.getDefinition(query);
        if(results == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "404 NOT_FOUND");
        }
        return results;
    }

}
