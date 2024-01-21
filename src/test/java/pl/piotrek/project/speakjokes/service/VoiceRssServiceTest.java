package pl.piotrek.project.speakjokes.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

import java.io.IOException;

class VoiceRssServiceTest {

    @Test
    void speakJoke() throws IOException {

        //g

        AudioPlayService audioPlayService = new AudioPlayService();
        VoiceRssService voiceRssService = new VoiceRssService(audioPlayService);

        //w

        boolean spoken = voiceRssService.speakJoke("Hello java");

        //t

        Assertions.assertTrue(spoken,"not spoken");

    }
}