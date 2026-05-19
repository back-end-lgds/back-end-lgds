package com.senai.backend.lgds_backend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuarios_id")
    private Integer id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "email", length = 150, nullable = false, unique = true)
    private String email;

    @Column(name = "senha", length = 255, nullable = false)
    private String senha;

    @Column(name = "tipo_usuario", length = 15, nullable = false)
    private String tipoUsuario;

    @ManyToOne
    @JoinColumn(name = "turmas_id")
    private Turma turma;

    @Column(name = "nickname_anonimo", length = 20, unique = true)
    private String nicknameAnonimo;

    @Column(name = "pontos_totais", nullable = false)
    private Integer pontosTotais = 0;

    @Column(name = "nivel", length = 30, nullable = false)
    private String nivel = "Iniciante";

    public Usuario() {
    }

    public Usuario(Integer id, String nome, String email, String senha, String tipoUsuario, Turma turma,
            String nicknameAnonimo, Integer pontosTotais, String nivel) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
        this.turma = turma;
        this.nicknameAnonimo = nicknameAnonimo;
        this.pontosTotais = pontosTotais;
        this.nivel = nivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getNicknameAnonimo() {
        return nicknameAnonimo;
    }

    public void setNicknameAnonimo(String nicknameAnonimo) {
        this.nicknameAnonimo = nicknameAnonimo;
    }

    public Integer getPontosTotais() {
        return pontosTotais;
    }

    public void setPontosTotais(Integer pontosTotais) {
        this.pontosTotais = pontosTotais;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

}
