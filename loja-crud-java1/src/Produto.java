
public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int categoriaId;

    public Produto(int id, String nome, double preco, int categoriaId) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoriaId = categoriaId;
    }

    public Produto(String nome, double preco, int categoriaId) {
        this.nome = nome;
        this.preco = preco;
        this.categoriaId = categoriaId;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getCategoriaId() { return categoriaId; }

    public void setId(int id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setCategoriaId(int categoriaId) { this.categoriaId = categoriaId; }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", categoriaId=" + categoriaId + "]";
    }
}
