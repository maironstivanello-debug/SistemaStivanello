/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Bean.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendasDAO {

    public void cadastrar(Vendas venda) throws SQLException {

        String sql = "INSERT INTO vendas (mms_idVenda, mms_idCliente, mms_dataVenda, mms_status, mms_valorTotal) VALUES (?, ?, ?, ?, ?)";

        Connection conn = ConexaoDAO.cnt();

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, venda.getMms_idVenda());
        stmt.setInt(2, venda.getMms_idCliente());
        stmt.setString(3, venda.getMms_dataVenda());
        stmt.setString(4, venda.getMms_status());
        stmt.setDouble(5, venda.getMms_valorTotal());

        stmt.executeUpdate();

        stmt.close();
        conn.close();
    }
}
