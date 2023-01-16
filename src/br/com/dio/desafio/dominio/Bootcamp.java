package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatterBuilder;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;

    private String descricao;

    private final LocalDate dataInicial = LocalDate.now();

    private final LocalDate dataFinal = dataInicial.plusDays(45);

    private Set<Dev> devsInscritos = new HashSet<>();

    private Set<Conteudo> conteudos;

    public Bootcamp(String nome, String descricao, Set<Conteudo> conteudos) {
        this.nome = nome;
        this.descricao = descricao;
        this.conteudos = conteudos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome)
         && Objects.equals(descricao, bootcamp.descricao)
         && Objects.equals(dataInicial, bootcamp.dataInicial)
         && Objects.equals(dataFinal, bootcamp.dataFinal)
         && Objects.equals(devsInscritos, bootcamp.devsInscritos)
         && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }

    @Override
    public String toString() {
        return "Dados referente ao Bootcamp: " + nome + "\n" +
                "Descricao do Bootcamp= " + descricao + "\n" +
                "Data de Inicio= " + dataInicial + "\n" +
                "Data do Término= " + dataFinal;
    }
}
