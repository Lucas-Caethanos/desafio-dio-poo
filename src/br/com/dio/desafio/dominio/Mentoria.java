package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String title;
    private String description;
    private LocalDate date;


    @Override
    public String toString() {
        return "Mentoria{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
