public class CadastroDeLivros {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.nome = "Juliana Andrade";
        autor.email = "juliana.andrade@curso.com";
        autor.cpf = "123.456.789-10";

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";

        livro.autor = autor;
        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.nome = "Juliana Andrade";
        outroAutor.email = "juliana.andrade@curso.com";
        outroAutor.cpf = "123.456.789-10";

        Livro outroLivro = new Livro();
        outroLivro.nome = "Lógica de Programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";

        outroLivro.autor = outroAutor;
        outroLivro.mostrarDetalhes();
    }
}
