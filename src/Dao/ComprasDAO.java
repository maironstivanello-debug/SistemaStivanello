/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Bean.Compras;
import Dao.ConexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ComprasDAO {

    public void cadastrar(Compras compra) throws SQLException {

        String sql = "INSERT INTO compras (mms_idCompra, mms_status, mms_idFornecedor, mms_dataCompra, mms_valorTotal) VALUES (?, ?, ?, ?, ?)";

        Connection conn = ConexaoDAO.cnt();
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, compra.getMms_idCompra());
        stmt.setString(2, compra.getMms_status());
        stmt.setInt(3, compra.getMms_idFornecedor());
        stmt.setString(4, compra.getMms_dataCompra());
        stmt.setDouble(5, compra.getMms_valorTotal());

        stmt.executeUpdate();

        stmt.close();
        conn.close();
    }
}
