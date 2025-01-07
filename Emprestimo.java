//João Victor de Jesus Augusto
import java.util.Date;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private Date dataRetirada;
    private Date dataDevolucao;

    public Emprestimo(Livro livro, Usuario usuario, Date dataRetirada, Date dataDevolucao) {
        if (!livro.isDisponivel()) {
            throw new IllegalStateException("O livro não está disponível.");
        }
        this.livro = livro;
        this.usuario = usuario;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        livro.setDisponivel(false);
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    @Override
    public String toString() {
        return "Livro: " + livro.getTitulo() + "\n" +
                "Autor: " + livro.getAutor().getNome() + "\n" +
                "Genero: " + livro.getGenero() + "\n" +
                "Usuario: " + usuario.getNome() + "\n" +
                "Idade: " + usuario.getIdade() + "\n" +
                "Data de Retirada: " + dataRetirada + "\n" +
                "Data de Devolucao: " + dataDevolucao;
    }
}

