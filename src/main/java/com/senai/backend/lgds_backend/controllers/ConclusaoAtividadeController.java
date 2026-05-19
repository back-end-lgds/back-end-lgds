package com.senai.backend.lgds_backend.controllers;

import com.senai.backend.lgds_backend.models.ConclusaoAtividade;
import com.senai.backend.lgds_backend.services.ConclusaoAtividadeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/conclusao-atividades")
public class ConclusaoAtividadeController {

    @Autowired
    private ConclusaoAtividadeService service;

    @GetMapping
    public ResponseEntity<List<ConclusaoAtividade>> listarTodos() {
        List<ConclusaoAtividade> lista = service.listarTodos();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConclusaoAtividade> buscarPorId(@PathVariable Integer id) {
        Optional<ConclusaoAtividade> obj = service.buscarPorId(id);
        if (obj.isPresent()) {
            return ResponseEntity.ok(obj.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<ConclusaoAtividade> criar(@RequestBody ConclusaoAtividade obj) {
        ConclusaoAtividade salvo = service.salvar(obj);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ConclusaoAtividade> atualizar(@PathVariable Integer id, @RequestBody ConclusaoAtividade obj) {
        ConclusaoAtividade atualizado = service.atualizar(id, obj);
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
