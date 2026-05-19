package com.senai.backend.lgds_backend.services;

import com.senai.backend.lgds_backend.models.ConclusaoAtividade;
import com.senai.backend.lgds_backend.repositories.ConclusaoAtividadeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConclusaoAtividadeService {

    @Autowired
    private ConclusaoAtividadeRepository repository;

    public List<ConclusaoAtividade> listarTodos() {
        return repository.findAll();
    }

    public Optional<ConclusaoAtividade> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public ConclusaoAtividade salvar(ConclusaoAtividade obj) {
        return repository.save(obj);
    }

    public ConclusaoAtividade atualizar(Integer id, ConclusaoAtividade obj) {
        if (repository.existsById(id)) {
            return repository.save(obj);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

}
