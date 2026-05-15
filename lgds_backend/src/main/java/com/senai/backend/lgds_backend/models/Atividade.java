package com.senai.backend.lgds_backend.models;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "atividades")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "atividades_id")
    private Integer id;

    @Column(name = "titulo", length = 100)
    private String titulo;

    @Column(name = "descricao", columnDefinition = "text")
    private String descricao;

    @Column(name = "data_entrega")
    private LocalDateTime dataEntrega;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Usuario professor;

    @ManyToOne
    @JoinColumn(name = "turmas_id")
    private Turma turma;

    @ManyToOne
    @JoinColumn(name = "calendario_id")
    private Calendario calendario;

    public Atividade() {
    }

    public Atividade(Integer id, String titulo, String descricao, LocalDateTime dataEntrega, Usuario professor,
            Turma turma, Calendario calendario) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataEntrega = dataEntrega;
        this.professor = professor;
        this.turma = turma;
        this.calendario = calendario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Usuario getProfessor() {
        return professor;
    }

    public void setProfessor(Usuario professor) {
        this.professor = professor;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

}
