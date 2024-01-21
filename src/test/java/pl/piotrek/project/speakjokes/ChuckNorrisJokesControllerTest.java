package pl.piotrek.project.speakjokes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.piotrek.project.speakjokes.api.chucknorrisjokes.ChuckNorrisJokesApiResponse;
import pl.piotrek.project.speakjokes.controller.ChuckNorrisJokesController;
import pl.piotrek.project.speakjokes.service.ChuckNorrisJokesService;

class ChuckNorrisJokesControllerTest {

    @Test
    void randomJoke() {

        //given

        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService(jokesRepository);
        ChuckNorrisJokesController chuckNorrisJokesController = new ChuckNorrisJokesController(chuckNorrisJokesService);

        //when
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesController.randomJoke();

        //then
        Assertions.assertNotNull(chuckNorrisJokesApiResponse,"null");

    }
}