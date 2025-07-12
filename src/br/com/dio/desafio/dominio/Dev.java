package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Conteudo> subscribedContent = new LinkedHashSet<>();
    private Set<Conteudo> completedContents = new LinkedHashSet<>();

    public void sighUpBootcamp(Bootcamp bootcamp){
        this.subscribedContent.addAll(bootcamp.getConteudos());
        bootcamp.getDevSet().add(this);
    }

    public void progress(){
        Optional<Conteudo> conteudo = this.subscribedContent.stream().findFirst();
        if(conteudo.isPresent()){
            this.completedContents.add(conteudo.get());
            this.subscribedContent.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public void calculateAllXP(){
        this.completedContents.
                stream().
                mapToDouble(Conteudo::calculateXP).
                sum();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContent, dev.subscribedContent) && Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, completedContents);
    }

    public Set<Conteudo> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Conteudo> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Conteudo> completedContents) {
        this.completedContents = completedContents;
    }
}
