package com.challenge.literalura.model;

import jakarta.persistence.*;

import java.util.Arrays;

@Entity
@Table(name="autor")
public class AutorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String autor;
    private String anoNascimento;
    private String anoFalecimento;
    private String[] livros;

    public AutorEntity() {

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(String anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getAnoFalecimento() {
        return anoFalecimento;
    }

    public void setAnoFalecimento(String anoFalecimento) {
        this.anoFalecimento = anoFalecimento;
    }

    public String[] getLivros() {
        return livros;
    }

    public void setLivros(String[] livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "autor='" + autor + '\'' +
                ", anoNascimento='" + anoNascimento + '\'' +
                ", anoFalecimento='" + anoFalecimento + '\'' +
                ", livros=" + Arrays.toString(livros) +
                '}';
    }
}
