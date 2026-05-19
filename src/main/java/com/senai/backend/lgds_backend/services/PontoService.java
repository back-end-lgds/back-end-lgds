package com.senai.backend.lgds_backend.services;

import com.senai.backend.lgds_backend.models.Ponto;
import com.senai.backend.lgds_backend.repositories.PontoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PontoService {

    @Autowired
    private PontoRepository repository;

    public List<Ponto> listarTodos() {
        return repository.findAll();
    }

    public Optional<Ponto> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Ponto salvar(Ponto obj) {
        return repository.save(obj);
    }

    public Ponto atualizar(Integer id, Ponto obj) {
        if (repository.existsById(id)) {
            return repository.save(obj);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

}
