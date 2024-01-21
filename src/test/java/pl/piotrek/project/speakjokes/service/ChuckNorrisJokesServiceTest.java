package pl.piotrek.project.speakjokes.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.piotrek.project.speakjokes.api.chucknorrisjokes.ChuckNorrisJokesApiResponse;

import java.io.IOException;



class ChuckNorrisJokesServiceTest {

    //given
    //when
    //then
    @Test
    void run() throws IOException {


       //given
        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService(jokesRepository);
        String url = "https://api.chucknorris.io/jokes/random";

        //when

        String response = chuckNorrisJokesService.getResponse(url);

        //then
        Assertions.assertNotNull(response,"Response is NULL");

    }

    @Test
    void convert() {

        //given
        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService(jokesRepository);


        //when
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesService.convert(" {\n" +
                "\"icon_url\" : \"https://assets.chucknorris.host/img/avatar/chuck-norris.png\",\n" +
                "\"id\" : \"8M2MppQuTGGKpoPOX0esUw\",\n" +
                "\"url\" : \"\",\n" +
                "\"value\" : \"Chuck Norris does not need hair dye, he scares it back to it's original color\"\n" +
                "} ");


        //then
        Assertions.assertNotNull(chuckNorrisJokesApiResponse,"response is NULL");


    }

    @Test
    void randomJoke() {

        //given
        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService(jokesRepository);

        //when
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesService.randomJoke();


        //then
        Assertions.assertNotNull(chuckNorrisJokesApiResponse,"Null");



    }
}