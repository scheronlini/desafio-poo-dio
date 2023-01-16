import br.com.dio.desafio.dominio.*;
import com.sun.source.tree.IfTree;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        //Instanciando Objetos utilizando polimorfismo (Instanciado Cursos e mentorias)
        Conteudo github = new Curso("GitHub", "Aprendendo sobre o GitHub", 5);
        Conteudo estruturaWhile = new Curso("Estrutura While", "Aprendendo sobre a Estrutura While", 20);
        Conteudo ide = new Curso("IDEs", "Aprendendo sobre as IDEs Eclipse e Intellij", 2);
        Conteudo poo = new Curso("Programação Orientada a Objetos", "Imerção a Programação Orientada a Objetos em JAVA", 12);
        Conteudo boasVindas = new Mentoria("Boas Vindas a DIO", "Ingressando no Bootcamp da DIO", "2022-02-02");

        //instanciando um novo objeto Bootcamp e já adcionado os conteúdos em uma collection do tipo
        // linkedHashSet podendo imprimir por ordem de inserção.
        Bootcamp orangeTech = new Bootcamp("Orange Tech+", "O primeiro bootcamp do programa será uma trilha gratuita lançada pelo Inter, em parceria com a DIO, que vai abordar desde o princípio as tecnologias JavaScript, HTML, CSS, Typescript e React. ", new LinkedHashSet<>() {{
            add(github);
            add(estruturaWhile);
            add(ide);
            add(poo);
            add(boasVindas);
        }}
        );

        //Instanciada nova Materia
        Materia java = new Materia("Java");

        //Adcionando Conteudos a Materia Java
        java.adcionaConteudo(poo);
        java.adcionaConteudo(estruturaWhile);

        //Instanciado novo Professor
        Professor mariano = new Professor("Mariano de Assis", "1990-09-09", "marianoprof@gmail.com", "https://github.com/profMariano", "https://www.linkedin.com/mariano/", "Brasil", "SC", "araquari", 89224222, "Rua Aracatuba", 4094);

        //Adcionando uma Materia para o professor
        mariano.adcionaMateria(java);

        //Instanciado novos Devs, a partir de um construtor com as informações importantes
        Dev dev1 = new Dev("Antonio da silva Martins", "1988-06-30", "antonio@gmail.com", "https://github.com/antonio", "https://www.linkedin.com/antonio/", "Brasil", "SC", "joinville", 89224545, "Rua Guaratingueta", 444);
        Dev dev2 = new Dev("Carlos Alberto", "1950-07-20", "carlos@gmail.com", "https://github.com/carlos", "https://www.linkedin.com/carlos", "Brasil", "PR", "Clevelandia", 78000666, "Rua Tarcisio", 908);
        Dev dev3 = new Dev("Juarez Marques", "1976-06-10", "juarez@gmail.com", "https://github.com/juarez", "https://www.linkedin.com/Juarez", "Brasil", "DF", "Brasilia", 89999000, "Rua Espetaculo", 3);

        //Utilizado o metodo inscrever Dev em bootcamp, neste método já são inscritos todos os conteudos a serem estudados
        dev1.inscreverBootcamp(orangeTech);
        dev2.inscreverBootcamp(orangeTech);
        dev3.inscreverBootcamp(orangeTech);

        //Progredindo devs nos conteudos do bootcamp
        dev1.progredir();
        dev1.progredir();
        dev2.progredir();
        dev3.progredir();

        //Dados do Bootcamp
        System.out.println(orangeTech.toString());
        System.out.println();
        System.out.println();

        // Laço foreach para impressão do Conteudo do Bootcamp
        System.out.println("Conteudos do Bootcamp: " + orangeTech.getNome());
        System.out.println();

        for (Conteudo conteudo : orangeTech.getConteudos()) {
            System.out.println(conteudo.getTitulo());
        }

        System.out.println();
        System.out.println();

        //Laço foreach para impressão dos devs inscritos no Bootcamp e seus respectivos XP
        System.out.println("Devs inscritos no Bootcamp: " + orangeTech.getNome());
        System.out.println();
        for (Dev dev : orangeTech.getDevsInscritos()) {
            System.out.println(dev.getNome() + " Total XP= " + dev.calcularTotalXp());
        }
    }
}
