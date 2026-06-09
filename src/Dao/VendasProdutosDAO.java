/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Bean.VendasProdutos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendasProdutosDAO {

    public void cadastrar(VendasProdutos vendaProduto) throws SQLException {

        String sql = "INSERT INTO vendas_produtos (mms_idVendaProduto, mms_idVenda, mms_idProduto, mms_quantidade, mms_valorUnitario, mms_subtotal) VALUES (?, ?, ?, ?, ?, ?)";

        Connection conn = ConexaoDAO.cnt();

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, vendaProduto.getMms_idVendaProduto());
        stmt.setInt(2, vendaProduto.getMms_idVenda());
        stmt.setInt(3, vendaProduto.getMms_idProduto());
        stmt.setInt(4, vendaProduto.getMms_quantidade());
        stmt.setDouble(5, vendaProduto.getMms_valorUnitario());
        stmt.setDouble(6, vendaProduto.getMms_subtotal());

        stmt.executeUpdate();

        stmt.close();
        conn.close();
    }
}