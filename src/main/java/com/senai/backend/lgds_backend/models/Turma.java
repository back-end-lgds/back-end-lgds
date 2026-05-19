package com.senai.backend.lgds_backend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "turmas")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "turmas_id")
    private Integer id;

    @Column(name = "codigo_turma", length = 50, unique = true)
    private String codigoTurma;

    @Column(name = "ano")
    private Short ano;

    @Column(name = "turno", length = 20)
    private String turno;

    @ManyToOne
    @JoinColumn(name = "cursos_id")
    private Curso curso;

    public Turma() {
    }

    public Turma(Integer id, String codigoTurma, Short ano, String turno, Curso curso) {
        this.id = id;
        this.codigoTurma = codigoTurma;
        this.ano = ano;
        this.turno = turno;
        this.curso = curso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public Short getAno() {
        return ano;
    }

    public void setAno(Short ano) {
        this.ano = ano;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
