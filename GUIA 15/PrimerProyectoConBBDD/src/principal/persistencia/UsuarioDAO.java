/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.persistencia;

import principal.dominio.usuario.Usuario;

/**
 *
 * @author chris
 */
public final class UsuarioDAO extends DAO{
    
    public void guardarUsuarios(Usuario usuario) throws Exception{
        
        try {
            if(usuario == null){
                throw new Exception("Usuario nulo");
            }
            
            String sql = "insert into usuarios (id, email, password)"
                    + "values('"+usuario.getId() + "','" + usuario.getEmail() + "','" + usuario.getPassword() + "');";
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }        
    }
    
    public void modificarUsuario(Usuario usuario) throws Exception{
        
        try {
            if(usuario == null) {
                throw new Exception("Usuario nulo");
            }
            
            String sql = "update usuarios set"
                    + "password = '" + usuario.getPassword() + "' where email = '" + usuario.getEmail() + "');";
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }        
    }
    
    public void eliminarUsuario(String email) throws Exception{
        
        try {
            
            String sql = "delete from usuarios where email = '" + email + "'";
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    
    
}
