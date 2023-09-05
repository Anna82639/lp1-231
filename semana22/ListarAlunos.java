package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ListarAlunos {

    public static void main(String[] args)  throws SQLException {

            // 1. abrir a conexão 
    String url = "jdbc:mysql://localhost/estudante?user=estudante&password=esudante&useSSL=true";
    Connection connection = DriverManager.getConnection(url);

            // 2. buscar todos os alunos
    String sql = "SELECT * FROM alunos;";

     ResultSet rs = statement.executeQuery(sql);



            // 3. fechar conexão
    
    connection.close();

        
    }
    
}
