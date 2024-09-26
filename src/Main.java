import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

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

        System.out.println (cursoJava);
        System.out.println (cursoKotlin);
        System.out.println (mentoria);
    }
}