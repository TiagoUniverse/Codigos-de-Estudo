package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Livro;

public class LivroDAO {

 public void create(Livro l) {
        //Aqui chamamos a conexão
        Connection con = ConnectionFactory.getConnection();
        //Inicializou
        PreparedStatement stmt = null;

        try {
            //Vamos inserir dados
            stmt = con.prepareStatement("INSERT INTO Livro(Nome,Autor,Editora,Pergunta, A, B, C, D ,E, RC)VALUE(?,?,?,?,?,?,?,?,?,?)");
            //   posição, valor a ser inserido
            stmt.setString(1, l.getNome());
            stmt.setString(2, l.getAutor());
            stmt.setString(3, l.getEditora());
            stmt.setString(4, l.getPergunta());
            stmt.setString(5, l.getA());
            stmt.setString(6, l.getB());
            stmt.setString(7, l.getC());
            stmt.setString(8, l.getD());
            stmt.setString(9, l.getE());
            stmt.setString(10, l.getRC());
   

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações salvas com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            //Independente se ele salvar ou cair numa exceção
            //nos vamos fechar a conexao
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    
 
}
