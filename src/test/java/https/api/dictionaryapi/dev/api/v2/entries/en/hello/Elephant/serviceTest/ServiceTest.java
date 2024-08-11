package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.serviceTest;

import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.service.ElephantService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {
    private ElephantService elephantService;

    @BeforeEach
    void setUp() {
        elephantService = new ElephantService();
    }

    @Test
    void givenGoodQuery_whenGetDefinition_thenReturnDefinition() {
        //given
        String query = "computer";
        String expectedResult = "A person employed to perform computations; one who computes.";

        //when
        String actualResult = elephantService.getDefinition(query);
        //then
        assertEquals(expectedResult, actualResult);
    }
}