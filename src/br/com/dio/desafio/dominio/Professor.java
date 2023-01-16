package br.com.dio.desafio.dominio;

public class Professor extends Pessoa {

    Materia materia;

    public Professor(String nome, String nascimento, String email, String github, String linkedin, String pais, String estado, String cidade, int cep, String rua, int numeroCasa) {
        super(nome, nascimento, email, github, linkedin, pais, estado, cidade, cep, rua, numeroCasa);
        }

    public void adcionaMateria (Materia materia){
        this.materia = materia;
        this.materia.setProfessor(this);
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Dados do Professor: " + "\n" +
                "Materia= " + materia.getNomeMateria() + "\n" +
               super.toString();
    }
}
