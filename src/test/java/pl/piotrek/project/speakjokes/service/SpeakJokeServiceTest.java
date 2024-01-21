package pl.piotrek.project.speakjokes.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpeakJokeServiceTest {

    @Test
    void speakJoke() {
        //g
        AudioPlayService audioPlayService = new AudioPlayService();
        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService(jokesRepository);
        VoiceRssService voiceRssService = new VoiceRssService(audioPlayService);
        SpeakJokeService speakJokeService = new SpeakJokeService(chuckNorrisJokesService,voiceRssService);



        //w

        boolean spoken = speakJokeService.speakJoke();


        //t

        Assertions.assertTrue(spoken, "not spoken");


    }
}