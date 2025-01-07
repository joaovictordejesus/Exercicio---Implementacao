import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando o autor
        Autor autor = new Autor("Jessica Felix", 35);

        // Criando o livro
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");

        // Criando o usuário
        Usuario usuario = new Usuario("Lucas Rafael", 25);

        // Criando as datas de retirada e devolução
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        // Criando o empréstimo
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        // Exibindo os detalhes do empréstimo
        System.out.println("O livro não está disponível");
        System.out.println(emprestimo);
    }
}
