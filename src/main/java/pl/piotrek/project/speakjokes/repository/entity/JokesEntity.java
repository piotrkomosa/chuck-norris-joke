package pl.piotrek.project.speakjokes.repository.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "JOKES")
public class JokesEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String joke;



    public JokesEntity() {

    }
}
