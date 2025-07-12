import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Conteudo conteudo = new Curso("Curso Python", "Descrição do curso de Python", 8);

        Curso curso01 = new Curso("Curso Java", "Descrição do curso de Java", 8);
        Curso curso02 = new Curso("Curso C", "Descrição do curso de C", 10);

        Mentoria mentoria01 =  new Mentoria();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso01);
        bootcamp.getConteudos().add(curso02);
        bootcamp.getConteudos().add(mentoria01);

        Dev dev01 = new Dev();
        Dev dev02 = new Dev();

        dev01.setName("Lucas");
        dev02.setName("Gabriela");

        System.out.println("Conteúdos inscritos lucas: " + dev01.getSubscribedContent());
        System.out.println("Conteúdos inscritos gabriela: " + dev02.getSubscribedContent());

        dev01.sighUpBootcamp(bootcamp);
        dev02.sighUpBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos lucas: " + dev01.getSubscribedContent());
        System.out.println("Conteúdos inscritos gabriela: " + dev02.getSubscribedContent());

        System.out.println("Conteúdos concluídos lucas: " + dev01.getCompletedContents());
        System.out.println("Conteúdos concluídos gabriela: " + dev02.getCompletedContents());

        dev01.progress();
        dev02.progress();

        System.out.println("Conteúdos concluídos lucas: " + dev01.getCompletedContents());
        System.out.println("Conteúdos concluídos gabriela: " + dev02.getCompletedContents());

        System.out.println("Conteúdos inscritos lucas: " + dev01.getSubscribedContent());
        System.out.println("Conteúdos inscritos lucas: " + dev02.getSubscribedContent());

    }
}