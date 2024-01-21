package pl.piotrek.project.speakjokes.service;

import pl.piotrek.project.speakjokes.api.chucknorrisjokes.ChuckNorrisJokesApiResponse;

import java.util.logging.Logger;

public class SpeakJokeService {

    private static final Logger LOGGER = Logger.getLogger(SpeakJokeService.class.getName());


    private final ChuckNorrisJokesService chuckNorrisJokesService ;
    private final VoiceRssService voiceRssService;


    public SpeakJokeService(ChuckNorrisJokesService chuckNorrisJokesService, VoiceRssService voiceRssService) {
        this.chuckNorrisJokesService = chuckNorrisJokesService;
        this.voiceRssService = voiceRssService;
    }

    public boolean speakJoke()  {
        LOGGER.info("speakJoke");
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = new ChuckNorrisJokesService(jokesRepository).randomJoke();
        String joke = chuckNorrisJokesApiResponse.getValue();
        boolean spoken = voiceRssService.speakJoke(joke);
        return spoken;

    }

}
