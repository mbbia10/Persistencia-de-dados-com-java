
import java.util.*;

public class Main {
    public static void main(String[] args) {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        ProdutoDAO produtoDAO = new ProdutoDAO();

        categoriaDAO.criarTabela();
        produtoDAO.criarTabela();

        // Inserir categorias
        categoriaDAO.inserir(new Categoria("Eletrônicos", true));
        categoriaDAO.inserir(new Categoria("Roupas", true));

        // Inserir produtos
        produtoDAO.inserir(new Produto("Notebook", 3500.0, 1));
        produtoDAO.inserir(new Produto("Camiseta", 79.90, 2));

        // Listar categorias
        System.out.println("Categorias:");
        for (Categoria c : categoriaDAO.listar()) {
            System.out.println(c);
        }

        // Listar produtos
        System.out.println("\nProdutos:");
        for (Produto p : produtoDAO.listar()) {
            System.out.println(p);
        }
    }
}
