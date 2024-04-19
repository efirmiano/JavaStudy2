package Dezenove;

import java.sql.*;

public class ConexaoJDBC {
    private final static String url = "jdbc:mysql://localhost:3306/impacta";
    private final static String myLogin = "root";
    private final static String myPassword = "123@senha";
    private Statement stmt;
    private ResultSet rs;

    //Construtor da classe
    public ConexaoJDBC() {


        //Realiza a conexão com o Banco de dados "JDBC"
        try {
            //Abrir conexão
            Connection con = DriverManager.getConnection(url,myLogin, myPassword);

            //Passar instruções ao Banco como o Select no caso
            stmt = con.createStatement();
            String query = "SELECT * FROM alunos";
            rs = stmt.executeQuery(query);

            con.commit();//dar um commit no banco.
            con.rollback();//Voltar as configurações anteriores do banco.
            con.setAutoCommit(true);//Realizar o commit automatico.
            con.close();//fechando a conexão com banco

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
