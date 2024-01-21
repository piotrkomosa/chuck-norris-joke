package pl.piotrek.project.speakjokes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.piotrek.project.speakjokes.repository.entity.JokesEntity;


@Repository
public interface JokesRepository extends JpaRepository<JokesEntity, Long> {




}
