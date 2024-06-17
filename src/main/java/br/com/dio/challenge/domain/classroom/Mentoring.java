package br.com.dio.challenge.domain.classroom;

import java.time.LocalDate;

public class Mentoring {
    private String title;
    private String description;
    private LocalDate date;

    public Mentoring() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return  "Titulo='" + title + '\n' +
                "Descricao='" + description + '\n' +
                "Data=" + date;
    }
}
