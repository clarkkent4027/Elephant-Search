package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.serviceTest;

import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.ElephantController;
import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.service.ElephantService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ServiceTest {


    private ElephantService elephantService;

    @BeforeEach
    void setUp() {

        elephantService = new ElephantService();
    }

    @Test
    void givenGoodQuery_whenGetDefinition_thenReturnDefinition() {
        //given
        String query = "test";
        String expectedResult = "Searching for definition of test";

        //when
        String actualResult = elephantService.getDefinition(query);
        //then
        assertEquals(expectedResult, actualResult);
    }
}