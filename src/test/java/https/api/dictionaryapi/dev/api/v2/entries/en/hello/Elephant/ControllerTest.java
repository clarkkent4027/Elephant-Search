package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant;

import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.service.ElephantService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.server.ResponseStatusException;
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
        String actualResult = elephantController.getDefinition(query);
        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenBadQuery_whenGetDefinition_thenThrowsException() {
        //given
        String query = "qwertyuijf6";

        //when
        //then
        Throwable exceptionThrown = assertThrows(ResponseStatusException.class, () -> elephantController.getDefinition(query));
        assertEquals(exceptionThrown.getMessage(), "404 NOT_FOUND \"Result(s) not found.\"");
    }


}