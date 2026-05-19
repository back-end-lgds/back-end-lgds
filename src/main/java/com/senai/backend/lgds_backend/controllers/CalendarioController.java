package com.senai.backend.lgds_backend.controllers;

import com.senai.backend.lgds_backend.models.Calendario;
import com.senai.backend.lgds_backend.services.CalendarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/calendario")
public class CalendarioController {

    @Autowired
    private CalendarioService service;

    @GetMapping
    public ResponseEntity<List<Calendario>> listarTodos() {
        List<Calendario> lista = service.listarTodos();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calendario> buscarPorId(@PathVariable Integer id) {
        Optional<Calendario> obj = service.buscarPorId(id);
        if (obj.isPresent()) {
            return ResponseEntity.ok(obj.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Calendario> criar(@RequestBody Calendario obj) {
        Calendario salvo = service.salvar(obj);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Calendario> atualizar(@PathVariable Integer id, @RequestBody Calendario obj) {
        Calendario atualizado = service.atualizar(id, obj);
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
