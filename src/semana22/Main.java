package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC - Java Database Connection
// - Conjunto de interface para acesso a SGBDs 
// Java app --> Driver (biblioteca que implementa JDBC) --> SGBC
// App Desktop   JDBC  -->       Driver Mysql  --> MySQL

public class Main {
     public static void main(String[] args)  throws SQLException{
        // 1. abrir a conexão 
    String url = "jdbc:mysql://localhost/estudante?user=estudante&password=esudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);


        // 2. executar a consulta e usar os resultados 

        String sql = "CREAT TABLE alunos( id INTPRIMARY KEY, nome VARCHAR(100), email VARCHAR (255), ativo BOOL )";
        Statement statement = connection.createStatement();
        statement.execute(sql);


        // 3. fechar conexão 
        
        statement.close();
        connection.close();

    }    
}
