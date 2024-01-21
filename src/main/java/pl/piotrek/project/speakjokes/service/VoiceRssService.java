package pl.piotrek.project.speakjokes.service;

import okhttp3.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class VoiceRssService {
    private static final Logger LOGGER = Logger.getLogger(VoiceRssService.class.getName());

    private OkHttpClient client;

    private final AudioPlayService audioPlayService;

    public VoiceRssService(AudioPlayService audioPlayService) {
        this.client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();

        this.audioPlayService = audioPlayService;
    }

    public boolean speakJoke(String textToVoice) {
        LOGGER.info("speakJoke(" + textToVoice + ")");
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("api.voicerss.org")
                .addQueryParameter("key", "de0e014549d5485fb1aab2ec8bf979f2")
                .addQueryParameter("hl", "en-us")
                .addQueryParameter("src", textToVoice)
                .build();
        Request request = new Request.Builder().url(httpUrl).build();

        LOGGER.info("speakJoke(...) = ");

        try (Response response = client.newCall(request).execute()) {
            LOGGER.info("response:" + response);
            if(response != null){
                ResponseBody responseBody = response.body();
                if(response != null){
                    InputStream inputStream = new ByteArrayInputStream(responseBody.bytes());
                   if(inputStream != null){
                       audioPlayService.play(inputStream);
                       LOGGER.info("speakJoke(...) = " + true);
                       return true;
                       }
                   }
                }
            } catch (IOException e) {
            throw new RuntimeException(e);
        }
        LOGGER.info("speakJoke(...) = " + false);
        return false;
    }
}
