package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.repositoryTest;

import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.repository.dto.Definition;
import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.repository.dto.ElephantDTO;
import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.repository.dto.ElephantResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;
import reactor.core.publisher.Mono;
import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.repository.ElephantRepository;

import java.net.URI;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class ElephantRepositoryTest {

    private ElephantRepository elephantRepository;


   @Mock
    WebClient webClientMock;

   @Mock
    WebClient.RequestHeadersUriSpec requestHeadersUriSpecMock;

    @Mock
    WebClient.RequestHeadersSpec requestHeadersSpecMock;

    @Mock
    WebClient.ResponseSpec responseSpecMock;

    @Mock
    Mono<ElephantResponse> LocResponseMonoMock;

    @BeforeEach
    void setUp() {
       MockitoAnnotations.openMocks(this);
        elephantRepository = new ElephantRepository();
    }

    @Test
    void whenGetResults_thenReturnElephantResponse() {
        String query = "aglet";
        ElephantResponse elephantResponse = new ElephantResponse();
        ElephantDTO elephantDTO = new ElephantDTO();
        String expectedResult = "The cover at the tip of a shoelace, to prevent it from fraying.";
       Definition definition = new Definition();
      //  List<Definition> expectedResults = Collections.singletonList(definition);
       // elephantResponse.setDefinitions(expectedResults);

        when(webClientMock.get())
                .thenReturn(requestHeadersUriSpecMock);
        when(requestHeadersUriSpecMock.uri((Function<UriBuilder, URI>) any()))
                .thenReturn(requestHeadersSpecMock);
        when(requestHeadersSpecMock.retrieve())
                .thenReturn(responseSpecMock);
        when(responseSpecMock.bodyToMono(ElephantResponse.class))
                .thenReturn(LocResponseMonoMock);
        when(LocResponseMonoMock.block())
                .thenReturn(elephantResponse);

        //when
        String actualResult = elephantRepository.getDefinition(query);
       // List<String> actualResults = Collections.singletonList(actualResult);
        //then
        assertEquals(expectedResult, actualResult);
        //given
        //when
        //then
    }
}
