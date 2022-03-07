package be.technifutur.mastermind_ws.service;

import java.util.List;

import org.springframework.stereotype.*;

import be.technifutur.mastermind_ws.data.ClassementRepository;
import be.technifutur.mastermind_ws.model.entity.Classement;
import be.technifutur.mastermind_ws.service.mapper.ClassementMapper;

@Service
public class ClassementServiceImpl implements ClassementService {

    private final ClassementRepository repository;
    private final ClassementMapper mapper;

    public ClassementServiceImpl(ClassementRepository repository, ClassementMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<Classement> getAll() {
        return repository.findAll().stream().toList();//.map(mapper::toClassement).toList();
    }

    @Override
    public Classement insertClassement(Classement toInsert) {
        //return mapper.toClassement(repository.save(toInsert));
        return repository.save(toInsert);
    }
    
}
