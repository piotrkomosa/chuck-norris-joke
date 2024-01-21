package pl.piotrek.project.speakjokes.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.piotrek.project.speakjokes.api.chucknorrisjokes.ChuckNorrisJokesApiResponse;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ChuckNorrisJokesControllerSpringTest {

    @Autowired
    private ChuckNorrisJokesController chuckNorrisJokesController;


    @Test
    void randomJoke() {

        //g


        //w
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesController.randomJoke();

        //t
        Assertions.assertNotNull(chuckNorrisJokesApiResponse,"Null");

    }
}