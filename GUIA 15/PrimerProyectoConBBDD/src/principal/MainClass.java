/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;
import principal.dominio.usuario.UsuarioService;

/**
 *
 * @author chris
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        UsuarioService usuarioService = new UsuarioService();
        
        try {
            
            usuarioService.crearUsuario(2, "chris@chris", "123");
            
        } catch (Exception ex) {
            
            Logger.getLogger(MainClass.class).log(Level.SEVERE, null, ex);
            
        }
        
        
        
        
        
        
    }
    
}
