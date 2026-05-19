package com.senai.backend.lgds_backend.services;

import com.senai.backend.lgds_backend.models.Curso;
import com.senai.backend.lgds_backend.repositories.CursoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repository;

    public List<Curso> listarTodos() {
        return repository.findAll();
    }

    public Optional<Curso> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Curso salvar(Curso obj) {
        return repository.save(obj);
    }

    public Curso atualizar(Integer id, Curso obj) {
        if (repository.existsById(id)) {
            return repository.save(obj);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

}
