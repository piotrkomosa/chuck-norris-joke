package pl.piotrek.project.speakjokes.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChuckNorrisJokesServiceSpringTest {

    @Autowired
    private ChuckNorrisJokesService chuckNorrisJokesService;

    @Test
    void randomJoke() throws IOException {

        //g
        // ... NOTE: injected  by Spring using @Autowired
        String url = "https://api.chucknorris.io/jokes/random";
        //w
        String response = chuckNorrisJokesService.getResponse(url);

        //t

        Assertions.assertNotNull(response,"response is NULL");

    }
}