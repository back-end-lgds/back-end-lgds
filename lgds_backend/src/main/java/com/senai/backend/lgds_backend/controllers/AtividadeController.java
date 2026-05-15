package com.senai.backend.lgds_backend.controllers;

import com.senai.backend.lgds_backend.models.Atividade;
import com.senai.backend.lgds_backend.services.AtividadeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/atividades")
public class AtividadeController {

    @Autowired
    private AtividadeService service;

    @GetMapping
    public ResponseEntity<List<Atividade>> listarTodos() {
        List<Atividade> lista = service.listarTodos();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Atividade> buscarPorId(@PathVariable Integer id) {
        Optional<Atividade> obj = service.buscarPorId(id);
        if (obj.isPresent()) {
            return ResponseEntity.ok(obj.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Atividade> criar(@RequestBody Atividade obj) {
        Atividade salvo = service.salvar(obj);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Atividade> atualizar(@PathVariable Integer id, @RequestBody Atividade obj) {
        Atividade atualizado = service.atualizar(id, obj);
        if (atualizado != null) {
            return ResponseEntity.ok(atualizado);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

}
