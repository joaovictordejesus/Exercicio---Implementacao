//João Victor de Jesus Augusto
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor("Jessica Felix", 35);

        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");

        Usuario usuario = new Usuario("Lucas Rafael", 25);

        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        System.out.println("O livro não está disponível");
        System.out.println(emprestimo);
    }
}
