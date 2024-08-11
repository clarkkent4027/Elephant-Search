package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant;

import dto.ElephantDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Repository
public class ElephantRepository {
    private final WebClient webClient;
    private static final String baseURL = "https://api.dictionaryapi.dev/api/v2/entries/en/";

public ElephantRepository (){
    webClient = WebClient
            .builder()
            .baseUrl(baseURL)
                .build();
}

    public String getDefinition(String query) throws WebClientResponseException.NotFound {
        ParameterizedTypeReference<List<ElephantDTO>> tr = new ParameterizedTypeReference<List<ElephantDTO>>() {};
        List<ElephantDTO> i = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path(query)
                        .build()
                )
                .retrieve()
                .bodyToMono(tr)
                .block();
        return i.get(0).getMeanings().get(0).getDefinitions().get(0).getDefinition();
    }
      /*
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path(query)
                        .build()
                )
                .retrieve()
                .bodyToMono(ElephantDTO.class)
                .block()
                .getDefinition();

         */
}