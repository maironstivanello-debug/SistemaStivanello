/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Bean.ComprasProdutos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ComprasProdutosDAO {

    public void cadastrar(ComprasProdutos compraProduto) throws SQLException {

        String sql = "INSERT INTO compras_produtos (mms_idCompraProduto, mms_idCompra, mms_idProduto, mms_quantidade, mms_valorUnitario, mms_subtotal) VALUES (?, ?, ?, ?, ?, ?)";

        Connection conn = ConexaoDAO.cnt();

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, compraProduto.getMms_idCompraProduto());
        stmt.setInt(2, compraProduto.getMms_idCompra());
        stmt.setInt(3, compraProduto.getMms_idProduto());
        stmt.setInt(4, compraProduto.getMms_quantidade());
        stmt.setDouble(5, compraProduto.getMms_valorUnitario());
        stmt.setDouble(6, compraProduto.getMms_subtotal());

        stmt.executeUpdate();

        stmt.close();
        conn.close();
    }
}