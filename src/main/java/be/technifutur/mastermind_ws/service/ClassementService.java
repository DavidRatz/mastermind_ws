package be.technifutur.mastermind_ws.service;

import java.util.List;

import be.technifutur.mastermind_ws.model.entity.Classement;

//@Component
public interface ClassementService {
    List<Classement> getAll();
    Classement insertClassement(Classement toInsert);
}
