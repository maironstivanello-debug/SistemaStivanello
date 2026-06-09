package dao;

import bean.Clientes;
import Dao.ConexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientesDAO {

    public void cadastrar(Clientes cliente) throws SQLException {

        String sql = "INSERT INTO clientes "
                + "(nome, apelido, cpf, dataNascimento, cidade, uf, endereco, cep, bairro, complemento, numero, email, telefone, dataCadastro, horaCadastro, genero, estadoCivil, naturalidade) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = ConexaoDAO.cnt();
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getApelido());
        stmt.setString(3, cliente.getCpf());
        stmt.setDate(4, new java.sql.Date(cliente.getDataNascimento().getTime()));
        stmt.setString(5, cliente.getCidade());
        stmt.setString(6, cliente.getUf());
        stmt.setString(7, cliente.getEndereco());
        stmt.setString(8, cliente.getCep());
        stmt.setString(9, cliente.getBairro());
        stmt.setString(10, cliente.getComplemento());
        stmt.setString(11, cliente.getNumero());
        stmt.setString(12, cliente.getEmail());
        stmt.setString(13, cliente.getTelefone());
        stmt.setDate(14, new java.sql.Date(cliente.getDataCadastro().getTime()));
        stmt.setString(15, cliente.getHoraCadastro());
        stmt.setString(16, cliente.getGenero());
        stmt.setString(17, cliente.getEstadoCivil());
        stmt.setString(18, cliente.getNaturalidade());

        stmt.executeUpdate();

        stmt.close();
        conn.close();
    }
}