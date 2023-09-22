package org.library.util;

import java.sql.*;

public class DBUtil {
    static Connection con = null;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";
    private static final String URL = "jdbc:mysql://localhost:3305/library";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        System.out.println("Connected to DB");
        return con;
    }

    public void disconnect() {
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
