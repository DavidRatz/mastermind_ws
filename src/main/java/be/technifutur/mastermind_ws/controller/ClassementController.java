package be.technifutur.mastermind_ws.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import be.technifutur.mastermind_ws.model.entity.Classement;
import be.technifutur.mastermind_ws.service.ClassementService;
import be.technifutur.mastermind_ws.service.ClassementServiceImpl;

@RestController
@RequestMapping("/classement")
public class ClassementController {
    @Autowired
    //ClassementServiceImpl classementService;
    ClassementService classementService;

    // public ClassementController(ClassementServiceImpl classementService) {
    //     this.classementService = classementService;
    // }

    // @GetMapping("/")
    // public ResponseEntity<?> getAll(){
    //     List<Classement> listusers = classementService.getAll();
    //     // return ResponseEntity.ok(listusers);
    //     return ResponseEntity.ok().body(listusers);
    // }

    @GetMapping("/")
    public List<Classement> getAll(){
        return classementService.getAll();
    }
    
    @PostMapping("/add") 
    public Classement insert(@Valid @RequestBody Classement classement){
        return classementService.insertClassement(classement);
    }
}