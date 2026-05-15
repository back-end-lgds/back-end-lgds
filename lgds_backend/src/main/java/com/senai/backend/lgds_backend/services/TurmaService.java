package com.senai.backend.lgds_backend.services;

import com.senai.backend.lgds_backend.models.Turma;
import com.senai.backend.lgds_backend.repositories.TurmaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurmaService {

    @Autowired
    private TurmaRepository repository;

    public List<Turma> listarTodos() {
        return repository.findAll();
    }

    public Optional<Turma> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Turma salvar(Turma obj) {
        return repository.save(obj);
    }

    public Turma atualizar(Integer id, Turma obj) {
        if (repository.existsById(id)) {
            return repository.save(obj);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

}
