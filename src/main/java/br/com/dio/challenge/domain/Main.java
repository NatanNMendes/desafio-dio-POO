package br.com.dio.challenge.domain;

import br.com.dio.challenge.domain.classroom.Content;
import br.com.dio.challenge.domain.classroom.Course;
import br.com.dio.challenge.domain.classroom.Mentoring;
import br.com.dio.challenge.domain.matter.Bootcamp;
import br.com.dio.challenge.domain.user.Developer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("Java");
        course1.setDescription("Descricao do curso de Java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("JavaScript");
        course2.setDescription("Descricao do curso de JavaScript");
        course2.setWorkload(4);

        Mentoring mentoring1 = new Mentoring();
        mentoring1.setTitle("Mentoria de Java");
        mentoring1.setDescription("Descricao da Mentoria de Java");
        mentoring1.setDate(LocalDate.now());

//        System.out.println(course1);
//        System.out.println(course2);
//        System.out.println(mentoring1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp de Java");
        bootcamp.setDescription("Descricao do Bootcamp de Java");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring1);

        Developer devNatan = new Developer();
        devNatan.setName("Natan");
        devNatan.registerBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Natan:" + devNatan.getSubscribedContent());
        devNatan.progress();
        System.out.println("Conteudos isncritos Natan:" + devNatan.getSubscribedContent());
        System.out.println("Conteudos concluidos Natan:" + devNatan.getContentCompleted());
        System.out.println("XP Natan:" + devNatan.calculateTotalXP());

        Developer devCamila = new Developer();
        devCamila.setName("Camila");
        devCamila.registerBootcamp(bootcamp);
        System.out.println("Conteudos incritos Camila:" + devCamila.getSubscribedContent());
        devCamila.progress();
        System.out.println("Conteudos isncritos Camila:" + devCamila.getSubscribedContent());
        System.out.println("Conteudos concluidos Camila:" + devCamila.getContentCompleted());
        System.out.println("XP Camila:" + devCamila.calculateTotalXP());
    }
}
