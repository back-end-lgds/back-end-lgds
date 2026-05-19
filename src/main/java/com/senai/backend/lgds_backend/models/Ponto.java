package com.senai.backend.lgds_backend.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pontos")
public class Ponto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pontos_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Usuario aluno;

    @ManyToOne
    @JoinColumn(name = "atividades_id")
    private ConclusaoAtividade conclusaoAtividade;

    @Column(name = "quantidade", nullable = false)
    private Integer quantidade = 0;

    @Column(name = "motivo", columnDefinition = "text")
    private String motivo;

    @Column(name = "data_ganho", nullable = false)
    private LocalDateTime dataGanho = LocalDateTime.now();

    public Ponto() {
    }

    public Ponto(Integer id, Usuario aluno, ConclusaoAtividade conclusaoAtividade, Integer quantidade, String motivo,
            LocalDateTime dataGanho) {
        this.id = id;
        this.aluno = aluno;
        this.conclusaoAtividade = conclusaoAtividade;
        this.quantidade = quantidade;
        this.motivo = motivo;
        this.dataGanho = dataGanho;
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

    public ConclusaoAtividade getConclusaoAtividade() {
        return conclusaoAtividade;
    }

    public void setConclusaoAtividade(ConclusaoAtividade conclusaoAtividade) {
        this.conclusaoAtividade = conclusaoAtividade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public LocalDateTime getDataGanho() {
        return dataGanho;
    }

    public void setDataGanho(LocalDateTime dataGanho) {
        this.dataGanho = dataGanho;
    }

}
