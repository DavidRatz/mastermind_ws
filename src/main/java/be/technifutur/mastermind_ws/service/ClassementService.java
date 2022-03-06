package be.technifutur.mastermind_ws.service;

import java.util.List;

import org.springframework.stereotype.Service;

import be.technifutur.mastermind_ws.model.entity.Classement;

public interface ClassementService {
    List<Classement> getAll();
    Classement insertClassement(Classement toInsert);
}
