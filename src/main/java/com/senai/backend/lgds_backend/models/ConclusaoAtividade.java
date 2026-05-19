package com.senai.backend.lgds_backend.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "conclusao_atividades")
public class ConclusaoAtividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "conclusao_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Usuario aluno;

    @ManyToOne
    @JoinColumn(name = "atividades_id")
    private Atividade atividade;

    @Column(name = "data_entrega")
    private LocalDateTime dataEntrega;

    @Column(name = "status", length = 25, nullable = false)
    private String status = "Pendente";

    @Column(name = "pontos_obtidos", nullable = false)
    private Short pontosObtidos = 0;

    public ConclusaoAtividade() {
    }

    public ConclusaoAtividade(Integer id, Usuario aluno, Atividade atividade, LocalDateTime dataEntrega, String status,
            Short pontosObtidos) {
        this.id = id;
        this.aluno = aluno;
        this.atividade = atividade;
        this.dataEntrega = dataEntrega;
        this.status = status;
        this.pontosObtidos = pontosObtidos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getAluno() {
        return aluno;
    }

    public void setAluno(Usuario aluno) {
        this.aluno = aluno;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Short getPontosObtidos() {
        return pontosObtidos;
    }

    public void setPontosObtidos(Short pontosObtidos) {
        this.pontosObtidos = pontosObtidos;
    }

}
