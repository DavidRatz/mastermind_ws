package be.technifutur.mastermind_ws.model.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.validation.annotation.Validated;

import lombok.*;


@Entity
@Data
@Validated
@Builder
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Classement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClassement;
    @Column
    private String nom;
    @Column
    private int score;
    @Column
    private int nbEssais;
}
