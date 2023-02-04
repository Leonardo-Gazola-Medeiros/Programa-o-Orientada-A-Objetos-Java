import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição do curso de javascript");
        curso2.setCargaHoraria(12);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição da mentoria java");
        mentoria.setData(LocalDate.now());

       /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();

            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev devLeo = new Dev();
            devLeo.setNome("Leo");
            devLeo.inscreverBootcamp(bootcamp);
            devLeo.progredir();
            System.out.println("Conteudos Inscritos" + devLeo.getConteudosInscritos());
            System.out.println("Conteudos Concluidos" + devLeo.getConteudosConcluidos());
            System.out.println("XP: " + devLeo.calcularTotalXp());

            Dev devTeste = new Dev();
            devTeste.setNome("Teste");
            System.out.println("Conteudos Inscritos" + devTeste.getConteudosInscritos());
            System.out.println("Conteudos Concluidos" + devTeste.getConteudosConcluidos());

        }

    }    

