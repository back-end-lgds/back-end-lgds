package com.senai.backend.lgds_backend.services;

import com.senai.backend.lgds_backend.models.Atividade;
import com.senai.backend.lgds_backend.repositories.AtividadeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AtividadeService {

    @Autowired
    private AtividadeRepository repository;

    public List<Atividade> listarTodos() {
        return repository.findAll();
    }

    public Optional<Atividade> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Atividade salvar(Atividade obj) {
        return repository.save(obj);
    }

    public Atividade atualizar(Integer id, Atividade obj) {
        if (repository.existsById(id)) {
            return repository.save(obj);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

}
