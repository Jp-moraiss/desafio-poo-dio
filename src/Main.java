import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev jp = new Dev();
        jp.setNome("João Pedro");
        jp.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Jp: " + jp.getConteudosInscritos());

        jp.progredir();
        jp.progredir();
        System.out.println("==========");

        System.out.println("Conteúdos Incritos Jp: " + jp.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jp: " + jp.getConteudosConcluidos());
        System.out.println("XP: " + jp.calcularTotalXp());

        System.out.println("=======================");

        Dev jera = new Dev();
        jera.setNome("Jera Rossi");
        jera.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Jera: " + jera.getConteudosInscritos());

        jera.progredir();
        jera.progredir();
        jera.progredir();
        System.out.println("==========");

        System.out.println("Conteúdos Incritos Jera: " + jera.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jera: " + jera.getConteudosConcluidos());
        System.out.println("XP: " + jera.calcularTotalXp());


    }
}