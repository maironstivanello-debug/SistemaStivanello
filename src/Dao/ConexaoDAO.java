/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    private static final String url = "jdbc:mysql://localhost:33062:10.7.0.51/db_marcos_vilhanueva";
    private static final String usuario = "marcos_vilhanueva";
    private static final String senha = "marcos_vilhanueva";

    public static Connection cnt() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }
}
