import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        Curso cursoJava = new Curso ();
        cursoJava.setTitulo ("Java");
        cursoJava.setDescricao ("Curso de desenvolvimento Java");
        cursoJava.setCargaHoraria (98);

        Curso cursoKotlin = new Curso ();
        cursoKotlin.setTitulo ("Kotlin");
        cursoKotlin.setDescricao ("Curso de desenvolvimento android com Kotlin");
        cursoKotlin.setCargaHoraria (108);

        Mentoria mentoria = new Mentoria ();
        mentoria.setTitulo ("Mentoria Java e Kotlin");
        mentoria.setDescricao ("Mentoria para turmas de Java e Kotlin");
        mentoria.setData (LocalDate.now ());

        Bootcamp bootcampJavaDeveloper = new Bootcamp ();
        bootcampJavaDeveloper.setNome ("Bootcamp Java Developer");
        bootcampJavaDeveloper.setDescricao ("Descrição do Bootcamp");
        bootcampJavaDeveloper.getConteudos ().add (cursoJava);
        bootcampJavaDeveloper.getConteudos ().add (mentoria);

        Bootcamp bootcampKotlinDeveloper = new Bootcamp ();
        bootcampKotlinDeveloper.setNome ("Bootcamp Kotlin Developer");
        bootcampKotlinDeveloper.setDescricao ("Descrição do Bootcamp");
        bootcampKotlinDeveloper.getConteudos ().add (cursoKotlin);
        bootcampKotlinDeveloper.getConteudos ().add (mentoria);

        Dev devLuis = new Dev ();
        devLuis.setNome ("Luís");
        devLuis.inscreverBootcamp (bootcampJavaDeveloper);

        System.out.println ("Cursos inscritos: " + devLuis.getConteudosInscritos ());
        devLuis.progredir ();
        System.out.println ("Cursos inscritos: " + devLuis.getConteudosInscritos ());
        System.out.println ("Conteúdos concluídos: " + devLuis.getConteudosConcluidos ());
        System.out.println ("XP: " + devLuis.calcularXp ());

        Dev devJoao = new Dev ();
        devJoao.setNome ("João");
        devJoao.inscreverBootcamp (bootcampKotlinDeveloper);

        System.out.println ("Cursos inscritos: " + devJoao.getConteudosInscritos ());
        devJoao.progredir ();
        System.out.println ("Cursos inscritos: " + devJoao.getConteudosInscritos ());
        System.out.println ("Conteúdos concluídos: " + devJoao.getConteudosConcluidos ());
        System.out.println ("XP: " + devJoao.calcularXp ());
    }
}
