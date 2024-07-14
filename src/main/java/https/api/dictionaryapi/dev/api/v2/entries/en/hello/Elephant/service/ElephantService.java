package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.service;

import org.springframework.stereotype.Service;

@Service
public class ElephantService {

    public String getResults(String query){
        return "Searching for definiton of " + query;
    }

}
