/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import bean.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FornecedorDAO {

    public void cadastrar(Fornecedor fornecedor) throws SQLException {

        String sql = "INSERT INTO fornecedor (razaoSocial, nomeComercial, cnpj, site, cidade, endereco, cep, bairro, complemento, numero, email, telefone, contrato, uf) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = ConexaoDAO.cnt();

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, fornecedor.getRazaoSocial());
        stmt.setString(2, fornecedor.getNomeComercial());
        stmt.setString(3, fornecedor.getCnpj());
        stmt.setString(4, fornecedor.getSite());
        stmt.setString(5, fornecedor.getCidade());
        stmt.setString(6, fornecedor.getEndereco());
        stmt.setString(7, fornecedor.getCep());
        stmt.setString(8, fornecedor.getBairro());
        stmt.setString(9, fornecedor.getComplemento());
        stmt.setString(10, fornecedor.getNumero());
        stmt.setString(11, fornecedor.getEmail());
        stmt.setString(12, fornecedor.getTelefone());
        stmt.setString(13, fornecedor.getContrato());
        stmt.setString(14, fornecedor.getUf());

        stmt.executeUpdate();

        stmt.close();
        conn.close();
    }
}
