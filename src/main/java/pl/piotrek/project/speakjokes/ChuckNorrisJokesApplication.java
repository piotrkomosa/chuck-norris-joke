package pl.piotrek.project.speakjokes;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.piotrek.project.speakjokes.controller.ChuckNorrisJokesController;
import pl.piotrek.project.speakjokes.api.chucknorrisjokes.ChuckNorrisJokesApiResponse;
import pl.piotrek.project.speakjokes.service.ChuckNorrisJokesService;

@SpringBootApplication
public class ChuckNorrisJokesApplication {


    public static void main(String[] args) {
        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService(null);
        ChuckNorrisJokesController chuckNorrisJokesController = new ChuckNorrisJokesController(chuckNorrisJokesService);
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesController.randomJoke();
        String value = chuckNorrisJokesApiResponse.getValue();
    }


}