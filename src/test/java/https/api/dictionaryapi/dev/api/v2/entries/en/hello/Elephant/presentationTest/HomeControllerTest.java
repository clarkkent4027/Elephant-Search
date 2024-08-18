package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.presentationTest;

import https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.presentation.HomeController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeControllerTest {

    private HomeController homeController;
    @BeforeEach
    public void setUp() {
          homeController = new HomeController();
    }

    @Test
    void whenHome_thenReturnRedirect() {
        //given
        String expected = "redirect:swagger-ui.html";

        //when
        String actual = homeController.home();

        //then
        assertEquals(expected, actual);
    }
}
