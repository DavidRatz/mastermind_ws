package be.technifutur.mastermind_ws.service.mapper;

import be.technifutur.mastermind_ws.model.entity.Classement;

public class ClassementMapper {
    public Classement toClassement(Classement entity){

        if(entity == null)
            return null;

        return Classement.builder().idClassement(entity.getIdClassement()).nom(entity.getNom()).score(entity.getScore()).nbEssais(entity.getNbEssais()).build();
    }
}
