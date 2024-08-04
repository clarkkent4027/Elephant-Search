package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.service;

import dto.Phonetic;
import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.ElephantRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ElephantService {
    ElephantRepository eRepository = new ElephantRepository();


    public String getDefinition(String query){
     return eRepository.getDefinition(query);
    }


}
