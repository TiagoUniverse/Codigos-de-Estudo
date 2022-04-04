
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Usuario;

/**
 *
 * @author Humberto
 */
public class UsuarioDAO {
    
     //Método de leitura na JTable dos dados
    public boolean checkLogin(String login, String senha) {
        //Aqui chamamos a conexão
        Connection con = ConnectionFactory.getConnection();
        //Inicializou
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT * FROM Usuario WHERE Nick = ? and  senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            
            //Responsável por fazer as consultas no banco
            rs = stmt.executeQuery();

            if (rs.next()) {

                check = true;
                 

            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);

        }

        return check;
    }

    
    public void create(Usuario u){
          //Aqui chamamos a conexão
        Connection con = ConnectionFactory.getConnection();
        //Inicializou
        PreparedStatement stmt = null;

          try {
            //Vamos inserir dados
            stmt = con.prepareStatement("INSERT INTO Usuario(Nick, Nome, senha)VALUE(?,?,?)");
            //   posição, valor a ser inserido
            stmt.setString(1, u.getNick());
            stmt.setString(2, u.getNome());
            stmt.setString(3, u.getSenha());
           

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            //Independente se ele salvar ou cair numa exceção
            //nos vamos fechar a conexao
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
   
    }

