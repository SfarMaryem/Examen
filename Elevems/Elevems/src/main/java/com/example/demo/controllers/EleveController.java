package com.example.demo.controllers;


import com.example.demo.entities.Eleve;
import com.example.demo.services.EleveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@RestController
@RequestMapping("/eleves")
public class EleveController {
 
    @Autowired
    private EleveService eleveService;
 
    @PostMapping
    public ResponseEntity<Eleve> createEleve(@RequestBody Eleve eleve) {
        Eleve createdEleve = eleveService.createEleve(eleve);
        return ResponseEntity.ok(createdEleve);
    }
 
    @GetMapping
    public ResponseEntity<List<Eleve>> listEleves() {
        List<Eleve> eleves = eleveService.listEleves();
        return ResponseEntity.ok(eleves);
    }
}


