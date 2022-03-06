package be.technifutur.mastermind_ws.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import be.technifutur.mastermind_ws.model.entity.Classement;

@RepositoryRestResource()
public interface ClassementRepository extends JpaRepository<Classement, Long> {
    
}
