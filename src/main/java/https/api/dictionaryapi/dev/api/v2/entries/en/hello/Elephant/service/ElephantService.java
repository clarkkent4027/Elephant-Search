package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.service;

import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.repository.ElephantRepository;
import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.repository.dto.Definition;
import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.repository.dto.ElephantResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElephantService {
    ElephantRepository eRepository = new ElephantRepository();


    public List<Definition> getDefinition(String query){
     ElephantResponse elephantResponse = new ElephantResponse();
        List<Definition> definition = eRepository.getDefinition(query);
        elephantResponse.setDefinitions(definition);
        return definition;
    }


}
