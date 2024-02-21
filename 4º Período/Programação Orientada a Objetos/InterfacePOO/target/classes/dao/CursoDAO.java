package dao;

import conexao.Conexao;
import model.Curso;

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
 * @author cleberlira
 */
public class CursoDAO {

    public void incluir(Curso curso) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO CURSO (nome) VALUES (?)");
           
            stmt.setString(1, curso.getNome());

            stmt.executeUpdate();
            
            System.out.println("Curso " + curso.getNome() + " inserido com sucesso");

        } catch (SQLException ex) {
            ex.printStackTrace();

              throw new RuntimeException("Erro ao inserir informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    
    public void alterar(Curso curso) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE CURSO SET nome = ? where id = ? ");
           
            stmt.setString(1, curso.getNome());

            stmt.setInt(2, curso.getId());
            
            
            stmt.executeUpdate();
            
            System.out.println("Curso " + curso.getNome() + " alterado com sucesso");


        } catch (SQLException ex) {
            ex.printStackTrace();

             throw new RuntimeException("Erro ao inserir informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    
    
    
    public void excluir(Curso curso) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE from CURSO WHERE id = ?");
           
            stmt.setInt(1, curso.getId());
            
            
            stmt.executeUpdate();
            
            System.out.println("Curso " + curso.getNome() + " excluído com sucesso");


        } catch (SQLException ex) {
            ex.printStackTrace();

             throw new RuntimeException("Erro ao inserir informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    
    
   public List<Curso> consulta(){
       Connection con = Conexao.getConexao();
       PreparedStatement stmt = null;
       
       ResultSet rs = null;
       
       
       List<Curso> cursos = new ArrayList<Curso>();
       
       
       try{
           
           stmt = con.prepareStatement("select id, nome from CURSO");
           rs = stmt.executeQuery();
           
           while (rs.next()){
               Curso curso =  new Curso();
              
               curso.setId(rs.getInt("id"));
               curso.setNome(rs.getString("nome"));
              
               cursos.add(curso);   
           }
       }catch (SQLException s){
           s.printStackTrace();  
       } finally {
            Conexao.fecharConexao(con, stmt);
        }
      return cursos;   
   }    
}
