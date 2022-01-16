package me.GageWillette.XenonEMPManager.Utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SQL
{
    public static Connection getConnection(String username, String password, String url, String port) throws SQLException
    {

        Connection conn = null;
        Properties connectionProps = new Properties();

        connectionProps.put("user" , username);
        connectionProps.put("password", password);

        conn = DriverManager.getConnection("jdbc:mysql://" + url + ":" + port + "/" , connectionProps);

        System.out.println("Connected to DB!");

        return conn;
    }
}
