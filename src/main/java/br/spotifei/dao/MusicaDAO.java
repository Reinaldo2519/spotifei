/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.spotifei.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.spotifei.model.Musica;

public class MusicaDAO {

    public void cadastrar(Musica musica) {
        String sql = "INSERT INTO music (nomemusica, autor, genero, duracao, lancamento) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, musica.getNomeMusica());
            stmt.setString(2, musica.getAutor());
            stmt.setString(3, musica.getGenero());

            // Se a duração for nula, insere null
            if (musica.getDuracao() != null) {
                stmt.setInt(4, musica.getDuracao());
            } else {
                stmt.setNull(4, java.sql.Types.INTEGER);
            }

            // Se o lançamento for nulo, insere null
            if (musica.getLancamento() != null) {
                stmt.setString(5, musica.getLancamento());
            } else {
                stmt.setNull(5, java.sql.Types.VARCHAR);
            }

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao cadastrar música: " + e.getMessage(), e);
        }
    }
}
