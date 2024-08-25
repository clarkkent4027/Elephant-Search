//package java.https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.presentation;
//
//import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.presentation.ElephantController;
//import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.service.ElephantService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@WebMvcTest(ElephantController.class)
// class ElephantControllerIntTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    private ElephantService elephantService;
//
//    @BeforeEach
//    void setUp() {
//      //  MockitoAnnotations.openMocks(this);
//
//        ElephantController elephantController = new ElephantController(elephantService);
//    }
//
//    @Test
//    void givenGoodQuery_whenGetDefinition_thenReturnDefinition() {
//        //given
//        String query = "computer";
//        String expectedResult = "A person employed to perform computations; one who computes.";
//
//        //when
//        String actualResult = elephantController.getDefinition(query);
//        //then
//        assertEquals(expectedResult, actualResult);
//    }
//
//}
