package br.com.dio.challenge.domain.classroom;

import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate date;

    public Mentoring() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calculateXP() {
        return XP_STANDARD + 20d;
    }

    @Override
    public String toString() {
        return "Titulo= " + getTitle() + ',' +
                "Descricao= " + getDescription() + ',' +
                "Date= " + getDate();
    }
}
