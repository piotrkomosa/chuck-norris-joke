package pl.piotrek.project.speakjokes;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.piotrek.project.speakjokes.controller.VoiceRssController;
import pl.piotrek.project.speakjokes.service.AudioPlayService;
import pl.piotrek.project.speakjokes.service.VoiceRssService;

import java.io.IOException;


public class VoiceRssApplication {
    public static void main(String[] args) throws IOException {

        AudioPlayService audioPlayService = new AudioPlayService();
        VoiceRssService voiceRssService = new VoiceRssService(audioPlayService);
        VoiceRssController voiceRssController = new VoiceRssController(voiceRssService);

        voiceRssController.play("Hello Jokie!");


    }
}
