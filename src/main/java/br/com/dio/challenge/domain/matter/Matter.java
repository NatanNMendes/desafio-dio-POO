package br.com.dio.challenge.domain.matter;

import br.com.dio.challenge.domain.classroom.Content;
import br.com.dio.challenge.domain.user.User;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Matter {
    private String description;
    private String name;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = initialDate.plusDays(45);
    private Set<User> registeredDevelopers = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<User> getRegisteredDevelopers() {
        return registeredDevelopers;
    }

    public void setRegisteredDevelopers(Set<User> registeredDevelopers) {
        this.registeredDevelopers = registeredDevelopers;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matter matter = (Matter) o;
        return Objects.equals(description, matter.description) && Objects.equals(name, matter.name) && Objects.equals(initialDate, matter.initialDate) && Objects.equals(finalDate, matter.finalDate) && Objects.equals(registeredDevelopers, matter.registeredDevelopers) && Objects.equals(contents, matter.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, name, initialDate, finalDate, registeredDevelopers, contents);
    }
}
