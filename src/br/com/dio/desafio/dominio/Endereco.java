package br.com.dio.desafio.dominio;

public class Endereco {

    private String pais;
    private String estado;
    private String cidade;
    private int cep;
    private String rua;
    private int numeroCasa;

    private Pessoa pessoa;

    public Endereco(String pais, String estado, String cidade, int cep, String rua, int numeroCasa, Pessoa pessoa) {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.pessoa = pessoa;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    @Override
    public String toString() {
        return "Endereco: " + "\n" +
                "pais= " + pais + "\n" +
                "estado= " + estado + "\n" +
                "cidade= " + cidade + "\n" +
                "cep= " + cep + "\n" +
                "rua= " + rua + '\'' +
                ", numeroCasa= " + numeroCasa;
    }
}
