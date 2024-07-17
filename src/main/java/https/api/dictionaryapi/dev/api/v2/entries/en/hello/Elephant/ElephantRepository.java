package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant;

import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

@Repository
public class ElephantRepository {
    private final WebClient webClient;
    private static final String baseURL = "https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.service";

public ElephantRepository (){
    webClient = WebClient
            .builder()
            .baseUrl(baseURL)
                .build();
}

    public String getResults(String query) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("fo", "json")
                        .queryParam("at", "results")
                        .queryParam("q", query)
                        .build()
                )
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

}