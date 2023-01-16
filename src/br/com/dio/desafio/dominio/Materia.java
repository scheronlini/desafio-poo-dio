package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Materia {

    private String nomeMateria;
    private Professor professor;
    private Set<Conteudo> conteudosDaMateria = new LinkedHashSet<>();

    public Materia(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Set<Conteudo> getConteudosDaMateria() {
        return conteudosDaMateria;
    }

    public void setConteudosDaMateria(Set<Conteudo> conteudosDaMateria) {
        this.conteudosDaMateria = conteudosDaMateria;
    }

    public void adcionaConteudo(Conteudo conteudo) {
        conteudosDaMateria.add(conteudo);
        conteudo.setMateria(this);

    }

    public void removeConteudo(Conteudo conteudo) {
        conteudosDaMateria.remove(conteudo);
        conteudo.setMateria(null);
    }

    public Materia(String nomeMateria, Professor professor) {
        this.nomeMateria = nomeMateria;
        this.professor = professor;
        professor.materia = this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materia materia = (Materia) o;
        return Objects.equals(nomeMateria, materia.nomeMateria) && Objects.equals(professor, materia.professor) && Objects.equals(conteudosDaMateria, materia.conteudosDaMateria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeMateria, professor, conteudosDaMateria);
    }

    @Override
    public String toString() {
        return  "Nome da Materia= " + nomeMateria + "\n" +
                "Professor=" + professor.getNome();
    }
}
