package prova2.com.example.prova2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prova2.com.example.prova2.entidade.Lutador;
import prova2.com.example.prova2.repository.LutadorRepository;

import javax.validation.Valid;

@RestController
@RequestMapping("/lutadores")
public class LutadorController {

    @Autowired
    private LutadorRepository repository;

    @PostMapping
    public ResponseEntity postLutador(@RequestBody @Valid Lutador fighter){
        repository.save(fighter);
        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public ResponseEntity getLutador(@RequestParam Double ForcaGolpe){

        return ResponseEntity.status(200).body(repository.findAllOrderByForcaGolpe(ForcaGolpe));

    }
}
