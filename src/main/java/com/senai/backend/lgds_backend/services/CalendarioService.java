package com.senai.backend.lgds_backend.services;

import com.senai.backend.lgds_backend.models.Calendario;
import com.senai.backend.lgds_backend.repositories.CalendarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {

    @Autowired
    private CalendarioRepository repository;

    public List<Calendario> listarTodos() {
        return repository.findAll();
    }

    public Optional<Calendario> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Calendario salvar(Calendario obj) {
        return repository.save(obj);
    }

    public Calendario atualizar(Integer id, Calendario obj) {
        if (repository.existsById(id)) {
            return repository.save(obj);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

}
