package me.GageWillette.XenonEMPManager.Utils;


import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class SQL {

    private static Connection conn = null;

    public static Connection getConnection(String username, String password, String url, String port) throws SQLException {
        Properties connectionProps = new Properties();

        connectionProps.put("user", username);
        connectionProps.put("password", password);

        conn = DriverManager.getConnection("jdbc:mysql://" + url + ":" + port + "/", connectionProps);

        System.out.println("Connected to DB!");

        return conn;
    }

    public static void addEmployee(int employeeNumber)
    {
        String insertStmt = "INSERT INTO xenon.logins (emp_num, emp_type) VALUES (" +
                employeeNumber + ", \'EMPLOYEE\');";

        try{
            PreparedStatement pstmt = conn.prepareStatement(insertStmt);

            int affectedRows = pstmt.executeUpdate();
        } catch (Exception e) {e.printStackTrace();}
    }

    public static void addManager(int managerNumber)
    {


    }

}
