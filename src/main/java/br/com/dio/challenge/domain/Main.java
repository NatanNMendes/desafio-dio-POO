package br.com.dio.challenge.domain;

import br.com.dio.challenge.domain.classroom.Course;
import br.com.dio.challenge.domain.classroom.Mentoring;

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

        Mentoring mentoring2 = new Mentoring();
        mentoring2.setTitle("Mentoria de JavaScript");
        mentoring2.setDescription("Descricao da Mentoria de JavaScript");
        mentoring2.setDate(LocalDate.now());

        System.out.println(course1);
        System.out.println(course2);

        System.out.println(mentoring1);
        System.out.println(mentoring2);
    }
}
