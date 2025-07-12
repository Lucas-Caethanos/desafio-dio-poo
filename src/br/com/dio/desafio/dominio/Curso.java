package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int workload;

    public Curso(String title, String description, int workload) {
        this.setTitle(title);
        this.setDescription(description);
        this.workload = workload;
    }

    @Override
    public double calculateXP() {
        return XP_STANDARD * workload;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

}
