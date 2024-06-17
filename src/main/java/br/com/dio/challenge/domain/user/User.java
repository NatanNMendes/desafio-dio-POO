package br.com.dio.challenge.domain.user;

import br.com.dio.challenge.domain.classroom.Content;
import br.com.dio.challenge.domain.matter.Matter;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public abstract class User implements UserInterface {
    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> contentCompleted = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Content> getContentCompleted() {
        return contentCompleted;
    }

    public void setContentCompleted(Set<Content> contentCompleted) {
        this.contentCompleted = contentCompleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User developer = (User) o;
        return Objects.equals(name, developer.name) && Objects.equals(subscribedContent, developer.subscribedContent) && Objects.equals(contentCompleted, developer.contentCompleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, contentCompleted);
    }

    @Override
    public void registerBootcamp(Matter bootcamp) {
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getRegisteredDevelopers().add(this);
    }

    @Override
    public void progress() {
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        if (content.isPresent()){
            this.contentCompleted.add(content.get());
            this.contentCompleted.remove(content.get());
        }else {
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }

    @Override
    public double calculateTotalXP() {
        return this.contentCompleted.stream().mapToDouble(Content::calculateXP).sum();
    }
}
