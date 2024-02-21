/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import java.util.List;
import java.util.ArrayList;
import model.Usuario;
import dao.UsuarioDAO;

/**
 *
 * @author cleberlira
 */
public class UsuarioBO {
    private UsuarioDAO usuarioDAO;
    
    public UsuarioBO () {
        usuarioDAO = new UsuarioDAO();
    }
    
    public void incluirUsuario (Usuario usuario) {
        usuarioDAO.incluir(usuario);
    }
    
    public void excluirUsuario (Usuario usuario) {
        usuarioDAO.excluir(usuario);
    }
    
    public void alterarUsuario (Usuario usuario) {
        usuarioDAO.alterar(usuario);
    }
    
    public List<Usuario> consultarUsuarios () {
        return usuarioDAO.consulta();
    }
}
