package pl.piotrek.project.speakjokes.controller;

import org.springframework.stereotype.Controller;
import pl.piotrek.project.speakjokes.service.VoiceRssService;

import java.io.IOException;
import java.util.logging.Logger;

@Controller
public class VoiceRssController {

    private static final Logger LOGGER = Logger.getLogger(VoiceRssController.class.getName());

    private VoiceRssService voiceRssService;

    public VoiceRssController(VoiceRssService voiceRssService) {
        this.voiceRssService = voiceRssService;
    }

    public VoiceRssController (){

    }

    public boolean play(String textToVoice) throws IOException {
        LOGGER.info("play + " + textToVoice + ")");

        boolean spoken = voiceRssService.speakJoke(textToVoice);

        LOGGER.info("play(...) = + " + spoken);
        return spoken;
    }
}
