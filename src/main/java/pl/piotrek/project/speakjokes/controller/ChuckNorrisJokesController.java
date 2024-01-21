package pl.piotrek.project.speakjokes.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.piotrek.project.speakjokes.api.chucknorrisjokes.ChuckNorrisJokesApiResponse;
import pl.piotrek.project.speakjokes.service.ChuckNorrisJokesService;

import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/jokes")
public class ChuckNorrisJokesController {
    private static final Logger LOGGER = Logger.getLogger(ChuckNorrisJokesService.class.getName());

    private final ChuckNorrisJokesService chuckNorrisJokesService;

    public ChuckNorrisJokesController(ChuckNorrisJokesService chuckNorrisJokesService) {
        this.chuckNorrisJokesService = chuckNorrisJokesService;
    }


    @GetMapping
    public String jokeView(){
        LOGGER.info("jokeView()");
        return "jokes.html";
    }

    @PostMapping
    public String joke(ModelMap modelMap){
        LOGGER.info("joke()");
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = randomJoke();
        modelMap.addAttribute("joke",chuckNorrisJokesApiResponse.getValue());
        return "jokes.html";
    }

    public ChuckNorrisJokesApiResponse randomJoke() {
        LOGGER.info("randomJoke()");
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesService.randomJoke();
        LOGGER.info("randomJoke(...) = ");
        return chuckNorrisJokesApiResponse;
    }

}
