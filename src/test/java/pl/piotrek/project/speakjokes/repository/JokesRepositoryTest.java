package pl.piotrek.project.speakjokes.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.piotrek.project.speakjokes.repository.entity.JokesEntity;

@SpringBootTest
class JokesRepositoryTest {

    @Autowired
    private JokesRepository jokesRepository;

    @Test
    void saveJoke(){


        //g
        // injected by autowired
        JokesEntity jokeEntity= new JokesEntity();
        //w

        JokesEntity save = jokesRepository.save(jokeEntity);


        //t
        Assertions.assertNotNull(save,"NULL");
    }
}