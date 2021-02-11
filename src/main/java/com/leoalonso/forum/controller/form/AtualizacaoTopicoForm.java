package com.leoalonso.forum.controller.form;

import com.leoalonso.forum.model.Topico;
import com.leoalonso.forum.repository.TopicoRepository;
import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;

public class AtualizacaoTopicoForm {

        @NotNull @NotEmpty
        private String titulo;

        @NotNull @NotEmpty
        private String mensagem;

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

        public Topico atualizar(Long id, TopicoRepository topicoRepository) {
            Topico topico = topicoRepository.getOne(id);

            topico.setTitulo(this.titulo);
            topico.setMensagem(this.mensagem);

            return topico;
        }

    }
