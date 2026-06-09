/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import bean.Especificacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EspecificacaoDAO {

    public void cadastrar(Especificacao especificacao) throws SQLException {

        String sql = "INSERT INTO especificacao (mmsIdEspecificacao, mmsTamanho, mmsCor, mmsMarca, mmsMaterial, mmsTipo, mmsGenero, mmsTipoSolado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = ConexaoDAO.cnt();

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, especificacao.getMmsIdEspecificacao());
        stmt.setString(2, especificacao.getMmsTamanho());
        stmt.setString(3, especificacao.getMmsCor());
        stmt.setString(4, especificacao.getMmsMarca());
        stmt.setString(5, especificacao.getMmsMaterial());
        stmt.setString(6, especificacao.getMmsTipo());
        stmt.setString(7, especificacao.getMmsGenero());
        stmt.setString(8, especificacao.getMmsTipoSolado());

        stmt.executeUpdate();

        stmt.close();
        conn.close();
    }
}