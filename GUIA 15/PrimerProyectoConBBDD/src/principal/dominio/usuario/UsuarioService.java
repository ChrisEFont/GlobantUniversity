/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.dominio.usuario;

import principal.persistencia.UsuarioDAO;

/**
 *
 * @author chris
 */
public class UsuarioService {
    
    private UsuarioDAO dao;
    
    public UsuarioService(){
        this.dao = new UsuarioDAO();
    }
    
    public void crearUsuario(int id, String email, String password) throws Exception{
        
        try {
            
            Usuario usuario = new Usuario();
            usuario.setId(id);
            usuario.setEmail(email);
            usuario.setPassword(password);
            dao.guardarUsuarios(usuario);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    
}
