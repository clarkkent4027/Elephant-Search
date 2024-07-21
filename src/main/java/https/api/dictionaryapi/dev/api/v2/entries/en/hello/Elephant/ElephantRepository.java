package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant;

import dto.ElephantDTO;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

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

    public String getDefinition(String query) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path(query)
                        .build()
                )
                .retrieve()
                .bodyToMono(ElephantDTO.class)
                .block()
                .getDefinition();
    }

}