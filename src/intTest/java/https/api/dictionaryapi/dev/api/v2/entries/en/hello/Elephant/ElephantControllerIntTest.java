package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant;

import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.presentation.ElephantController;
import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.service.ElephantService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ElephantController.class)
 class ElephantControllerIntTest {

    @Autowired
    private MockMvc mockMvc;
    private ElephantController elephantController;
    @MockBean

    private ElephantService elephantService;


    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
         elephantController = new ElephantController(elephantService);
    }

    @Test
   public void givenGoodQuery_whenSearchForResults_thenIsOkAndReturnsResults() throws Exception {
        //given
        String query = "computer";
        String expectedResult = "A person employed to perform computations; one who computes.";

        //when
        String actualResult = elephantController.getDefinition(query);
        //then
        assertEquals(expectedResult, actualResult);
        MvcResult mvcResult = mockMvc.perform(get("/searchLocResults?q=" + query))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) jsonPath("$[0].title", is(expectedResult)))
                .andReturn();

        assertEquals(MediaType.APPLICATION_JSON_VALUE, mvcResult.getResponse().getContentType());
    }

    @Test
    public void givenBadQuery_whenSearchForResults_thenIsNotFound() throws Exception {
        //given
        String query = "Java";

        //when
        //then
        mockMvc.perform(get("/searchElephantResults?q=" + query))
                .andDo(print())
                .andExpect(status().isNotFound());
    }


}
