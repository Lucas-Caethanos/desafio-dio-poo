package br.com.dio.desafio.dominio;

public class Curso {
    private String title;
    private String description;
    private int workload;


    public Curso(String title, String description, int workload) {
        this.title = title;
        this.description = description;
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", workload=" + workload +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }
}
