package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public  abstract class Pessoa {

    private String nome;

    private Endereco endereco;
    private LocalDate nascimento;
    private String email;
    private String github;
    private String linkedin;

    public Pessoa(String nome, String nascimento, String email, String github, String linkedin, String pais, String estado, String cidade, int cep, String rua, int numeroCasa ) {
        this.nome = nome;
        this.endereco =new Endereco(pais,estado,cidade,cep,rua,numeroCasa,this);
        this.nascimento = LocalDate.parse(nascimento);
        this.email = email;
        this.github = github;
        this.linkedin = linkedin;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    @Override
    public String toString() {
        return "InformacoesPessoais \n" +
                "Nome= " + nome + "\n" +
                "Data de nascimento= " + nascimento + "\n" +
                "email= " + email + "\n" +
                "github= " + github + "\n" +
                "linkedin= " + linkedin + "\n"+
                endereco.toString();
    }
}
