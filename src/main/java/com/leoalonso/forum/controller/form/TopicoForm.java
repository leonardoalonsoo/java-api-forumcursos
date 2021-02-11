package com.leoalonso.forum.controller.form;

import com.leoalonso.forum.model.Curso;
import com.leoalonso.forum.model.Topico;
import com.leoalonso.forum.repository.CursoRepository;
import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;

public class TopicoForm {
    @NotNull @NotEmpty
    private String titulo;
    @NotNull @NotEmpty
    private String mensagem;
    @NotNull @NotEmpty
    private String nomeCurso;

    private CursoRepository cursoRepository;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return  new Topico(titulo, mensagem, curso);
    }

}
