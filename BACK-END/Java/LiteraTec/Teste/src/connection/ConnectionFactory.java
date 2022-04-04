package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Humberto
 */
public class ConnectionFactory {

    //Para a conexão precisamos fundamentalmente de 3 caras:
    //O driver, o url e o usuario com a senha para acessar o banco de dados
    //Final é uma constante e por isso precisam está em MAIUSCULO
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bdliteratec";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        //Comando para fazer a conexão
        try {
            Class.forName(DRIVER);

            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException ex) {
            //EXCEÇÃO
            throw new RuntimeException("Erro na conexão: ", ex);
        }
    }

    //Fecha conexao
    public static void closeConnection(Connection con) {

        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //FAZ A 1ª SOBRECARGA
    public static void closeConnection(Connection con, PreparedStatement stmt) {
        //Outra verificação para fechar a conexao
        closeConnection(con);

        try {
            //Se o stmt não está nulo (está ligado), feche-o
            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//FAZ A 2 SOBRECARGA
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        //Outra verificação para fechar a conexao
        closeConnection(con, stmt);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
