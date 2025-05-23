/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.spotifei.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import br.spotifei.model.Musica;

public class MusicaDAO {

    
    
    // Cadastrar  musica nova 
    public void cadastrar(Musica musica) {
        String sql = "INSERT INTO musica (nomemusica, autor, genero, duracao, lancamento) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, musica.getNomeMusica());
            stmt.setString(2, musica.getAutor());
            stmt.setString(3, musica.getGenero());

            // Se for nulo, coloca null
            if (musica.getDuracao() != null) {
                stmt.setInt(4, musica.getDuracao());
            } else {
                stmt.setNull(4, java.sql.Types.INTEGER);
            }

            if (musica.getLancamento() != null) {
                stmt.setString(5, musica.getLancamento());
            } else {
                stmt.setNull(5, java.sql.Types.VARCHAR);
            }

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro em cadastrar música: " + e.getMessage(), e);
        }
    }
////////////////////////////////////////////////////////////////////////////////
    
    
    //buscar musicas
    
    public List<Musica> buscarMusicas(String filtro, String valor) {
    List<Musica> lista = new ArrayList<>();
    String sql = "SELECT * FROM musica WHERE LOWER(" + filtro + ") LIKE ?";

    try (Connection conn = Conexao.getConexao();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, "%" + valor.toLowerCase() + "%");

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Musica m = new Musica();
            m.setId(rs.getInt("id"));
            m.setNomeMusica(rs.getString("nomemusica"));
            m.setAutor(rs.getString("autor"));
            m.setGenero(rs.getString("genero"));
            lista.add(m);
        }
    } catch (SQLException e) {
        throw new RuntimeException("Erro ao buscar músicas: " + e.getMessage(), e);
    }

    return lista;
}
    ///////////////////////////////////////////////////////////////////////////
    
    //excluir musicas
    public void excluir(int id) {
    String sql = "DELETE FROM musica WHERE id = ?";

    try (Connection conn = Conexao.getConexao();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id);
        stmt.executeUpdate();

    } catch (SQLException e) {
        throw new RuntimeException("Erro ao excluir música: " + e.getMessage(), e);
    }
}

    
  //////////////////////////////////////////////////////////////////////////////  
    
    // Curtir musica
    public void curtirMusica(int id) {
        String sql = "UPDATE musica SET curtidas = curtidas + 1 WHERE id = ?";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao curtir música: " + e.getMessage(), e);
        }
    }

////////////////////////////////////////////////////////////////////////////////   
    
     
    // Descurtir música
    public void descurtirMusica(int id) {
        String sql = "UPDATE musica SET descurtidas = descurtidas + 1 WHERE id = ?";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao descurtir música: " + e.getMessage(), e);
        }
    }
}
