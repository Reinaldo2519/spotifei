/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.spotifei.model;

public class Musica {
    private int id; // obrigatorio
    private String nomeMusica; // obrigatorio
    private String autor; // obrigatorio
    private String genero; // obrigatorio
    private Integer duracao; // opcional
    private String lancamento; // opcional
    private int curtidas;
    private int descurtidas;


    public Musica() {}

    public Musica(String nomeMusica, String autor, String genero, Integer duracao, String lancamento) {
        this.nomeMusica = nomeMusica;
        this.autor = autor;
        this.genero = genero;
        this.duracao = duracao;
        this.lancamento = lancamento;
    }
    
    public int getCurtidas() {
    return curtidas;
}

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getDescurtidas() {
        return descurtidas;
    }

    public void setDescurtidas(int descurtidas) {
        this.descurtidas = descurtidas;
    }

    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNomeMusica() { return nomeMusica; }
    public void setNomeMusica(String nomeMusica) { this.nomeMusica = nomeMusica; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public Integer getDuracao() { return duracao; }
    public void setDuracao(Integer duracao) { this.duracao = duracao; }

    public String getLancamento() { return lancamento; }
    public void setLancamento(String lancamento) { this.lancamento = lancamento; }
}
