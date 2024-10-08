package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.presentationTest;

import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.presentation.ElephantController;
import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.repository.dto.Definition;
import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.repository.dto.ElephantResponse;
import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.service.ElephantService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClientResponseException.NotFound;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ControllerTest {
    private ElephantController elephantController;


    private ElephantService elephantService;

    @BeforeEach
    void setUp() {
        elephantService= new ElephantService();
        elephantController = new ElephantController(elephantService);
    }

    @Test
    void givenGoodQuery_whenGetDefinition_thenReturnDefinition() {
        //given
        String query = "computer";
        String expectedResult = "A person employed to perform computations; one who computes.";

        //when
        List<Definition> actualResult = elephantController.getDefinition(query);
        //then
        assertEquals(expectedResult, actualResult.get(0).getDefinition());
    }

    @Test
    void givenBadQuery_whenGetDefinition_thenThrowsException() {
        //given
        String query = "qwertyui11jf6";

        //when
        //then
        Throwable exceptionThrown = assertThrows(NotFound.class, () -> elephantController.getDefinition(query));

    }


}