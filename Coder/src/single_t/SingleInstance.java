package single_t;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum SingleInstance {
    connectionFactory;
    private Connection connection;
    private SingleInstance(){
        try {
            System.out.println("construct singleinstance");
            String url = "jdbc:sqlserver://localhost:1079;databaseName=lyzdb";
            String username = "la";
            String passwd = "";
            String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(driverName);
            connection = DriverManager.getConnection(url,username,passwd);

        }catch (ClassNotFoundException e){e.printStackTrace();}
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public Connection getConnection(){
        return connection;
    }
}
