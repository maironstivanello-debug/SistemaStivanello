/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Bean.Usuarios;
import Dao.ConexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuariosDAO {

    public void cadastrar(Usuarios usuario) throws SQLException {

        String sql = "INSERT INTO usuarios (id, nome, apelido, cpf, dataNascimento, senha, nivel, email, telefone, ativo, dataCadastro, horaCadastro, cargo, acessos, genero) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = ConexaoDAO.cnt();
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, usuario.getId());
        stmt.setString(2, usuario.getNome());
        stmt.setString(3, usuario.getApelido());
        stmt.setString(4, usuario.getCpf());
        stmt.setDate(5, new java.sql.Date(usuario.getDataNascimento().getTime()));
        stmt.setString(6, usuario.getSenha());
        stmt.setString(7, usuario.getNivel());
        stmt.setString(8, usuario.getEmail());
        stmt.setString(9, usuario.getTelefone());
        stmt.setBoolean(10, usuario.isAtivo());
        stmt.setDate(11, new java.sql.Date(usuario.getDataCadastro().getTime()));
        stmt.setString(12, usuario.getHoraCadastro());
        stmt.setString(13, usuario.getCargo());
        stmt.setString(14, usuario.getAcessos());
        stmt.setString(15, usuario.getGenero());

        stmt.executeUpdate();

        stmt.close();
        conn.close();
    }
}
