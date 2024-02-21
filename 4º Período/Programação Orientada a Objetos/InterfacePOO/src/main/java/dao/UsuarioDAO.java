/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import model.Usuario;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author williamwhds
 */
public class UsuarioDAO {
    public void incluir(Usuario usuario) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO USUARIO (nome) VALUES (?)");
           
            stmt.setString(1, usuario.getNome());

            stmt.executeUpdate();
            
            System.out.println("Usuario " + usuario.getNome() + " inserido com sucesso");

        } catch (SQLException ex) {
            ex.printStackTrace();

              throw new RuntimeException("Erro ao inserir informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    
    public void alterar(Usuario usuario) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE USUARIO SET nome = ? where id = ? ");
           
            stmt.setString(1, usuario.getNome());

            stmt.setInt(2, usuario.getId());
            
            
            stmt.executeUpdate();
            
            System.out.println("Usuário " + usuario.getNome() + " alterado com sucesso");


        } catch (SQLException ex) {
            ex.printStackTrace();

             throw new RuntimeException("Erro ao inserir informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    
    
    
    public void excluir(Usuario usuario) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE from USUARIO WHERE id = ?");
           
            stmt.setInt(1, usuario.getId());
            
            
            stmt.executeUpdate();
            
            System.out.println("Usuario " + usuario.getNome() + " excluído com sucesso");


        } catch (SQLException ex) {
            ex.printStackTrace();

             throw new RuntimeException("Erro ao inserir informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    
    
   public List<Usuario> consulta(){
       Connection con = Conexao.getConexao();
       PreparedStatement stmt = null;
       
       ResultSet rs = null;
       
       
       List<Usuario> usuarios = new ArrayList<Usuario>();
       
       
       try{
           
           stmt = con.prepareStatement("select id, nome from USUARIO");
           rs = stmt.executeQuery();
           
           while (rs.next()){
               Usuario usuario =  new Usuario();
              
               usuario.setId(rs.getInt("id"));
               usuario.setNome(rs.getString("nome"));
              
               usuarios.add(usuario);   
           }
       }catch (SQLException s){
           s.printStackTrace();  
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
        return usuarios;   
    }
}
