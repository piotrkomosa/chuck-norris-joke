package pl.piotrek.project.speakjokes.service;

import org.junit.jupiter.api.Test;

import java.io.InputStream;

class AudioPlayServiceTest {

    @Test
    void play() {
        //g
        AudioPlayService audioPlayService = new AudioPlayService();
        InputStream resourceAsStream = Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream("hello-joke.wav");



        //w
        audioPlayService.play(resourceAsStream);

        //t
    }
}