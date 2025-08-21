
import java.sql.*;
import java.util.*;

public class CategoriaDAO {
    public void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS Categorias (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                     "nome TEXT NOT NULL, " +
                     "ativo INTEGER NOT NULL)";
        try (Connection conn = Conexao.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void inserir(Categoria categoria) {
        String sql = "INSERT INTO Categorias(nome, ativo) VALUES(?, ?)";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, categoria.getNome());
            pstmt.setInt(2, categoria.isAtivo() ? 1 : 0);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Categoria> listar() {
        List<Categoria> lista = new ArrayList<>();
        String sql = "SELECT * FROM Categorias";
        try (Connection conn = Conexao.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Categoria(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getInt("ativo") == 1
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
