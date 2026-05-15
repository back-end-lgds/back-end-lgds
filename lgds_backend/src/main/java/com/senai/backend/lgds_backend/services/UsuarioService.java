package com.senai.backend.lgds_backend.services;

import com.senai.backend.lgds_backend.models.Usuario;
import com.senai.backend.lgds_backend.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Optional<Usuario> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Usuario salvar(Usuario obj) {
        return repository.save(obj);
    }

    public Usuario atualizar(Integer id, Usuario obj) {
        if (repository.existsById(id)) {
            return repository.save(obj);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

}
