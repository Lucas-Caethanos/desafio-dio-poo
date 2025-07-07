import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso01 = new Curso("Curso Java", "Descrição do curso de Java", 8);
        Curso curso02 = new Curso("Curso C", "Descrição do curso de C", 10);

        Mentoria mentoria01 =  new Mentoria();
        mentoria01.setTitle("Mentoria Java");
        mentoria01.setDescription("Descrição da mentoria de Java");
        mentoria01.setDate(LocalDate.now());

        System.out.println(curso01);
        System.out.println(curso02);
        System.out.println(mentoria01);

    }
}