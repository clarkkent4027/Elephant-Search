package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant;

import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.presentation.ElephantController;
import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.repository.dto.Definition;
import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.repository.dto.ElephantResponse;
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
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ElephantController.class)
 class ElephantControllerIntTest {

    @Autowired
    private MockMvc mockMvc;
  //  private ElephantController elephantController;
    @MockBean
    private ElephantService elephantService;


    @BeforeEach
     void setUp() {
        MockitoAnnotations.openMocks(this);
       // elephantController = new ElephantController(elephantService);
    }

    @Test
   public void givenGoodQuery_whenSearchForResults_thenIsOkAndReturnsResults() throws Exception {
        //given
        String query = "computer";
        Definition definition = new Definition();
        String expectedResult = "A person employed to perform computations; one who computes.";
        definition.setDefinition(expectedResult);
        ElephantResponse elephantResponse = new ElephantResponse();
        List <Definition> list = new ArrayList<Definition>();
        list.add(definition);

        elephantResponse.setDefinitions(list);
        //when
        when(elephantService.getDefinition(query)).thenReturn(elephantResponse);

        //then
        //  assertEquals(expectedResult, actualResult);
        MockHttpServletRequestBuilder requestBuilder = get("/searchElephantResults?q=" + query);
        requestBuilder.accept(MediaType.APPLICATION_JSON_VALUE);
        MvcResult mvcResult = mockMvc.perform(requestBuilder)
                 .andExpect(status().isOk())
                 .andExpect(MockMvcResultMatchers.jsonPath("@.definitions[0].definition", equalTo(expectedResult)))
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
                .andExpect(status().isNotFound());
    }


}
