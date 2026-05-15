package com.senai.backend.lgds_backend.services;

import com.senai.backend.lgds_backend.models.Unidade;
import com.senai.backend.lgds_backend.repositories.UnidadeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnidadeService {

    @Autowired
    private UnidadeRepository repository;

    public List<Unidade> listarTodos() {
        return repository.findAll();
    }

    public Optional<Unidade> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Unidade salvar(Unidade obj) {
        return repository.save(obj);
    }

    public Unidade atualizar(Integer id, Unidade obj) {
        if (repository.existsById(id)) {
            return repository.save(obj);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

}
