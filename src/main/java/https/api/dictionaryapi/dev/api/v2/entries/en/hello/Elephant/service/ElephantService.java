package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.service;

import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.repository.ElephantRepository;
import org.springframework.stereotype.Service;

@Service
public class ElephantService {
    ElephantRepository eRepository = new ElephantRepository();


    public String getDefinition(String query){
     return eRepository.getDefinition(query);
    }


}
