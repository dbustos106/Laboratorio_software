package Control;

import DAO.UsuarioDAO;
import Entidad.Usuario;

public class ValidarLogin {
    private UsuarioDAO dao = new UsuarioDAO();

    public ValidarLogin() {
    }
    
    public String verificarLogin(Usuario usuario){
        if(!verificarLongitudNombre(usuario.getNombre())){
            return("Longitud nombre incorrecta");
        }
        if(!verificarLongitudPassword(usuario.getPassword())){
            return("Longitud contraseña incorrecta");
        }
        System.out.println("hola");
        if(dao.leer(usuario) == true){
            return("Bienvenido");
        }
        return("Datos incorrectos");
    }
    
    public boolean verificarLongitudNombre(String nombre){
        return (nombre.length() > 1 && nombre.length() <= 6);
    }
    
    public boolean verificarLongitudPassword(String password){
        return (password.length() >= 3 && password.length() < 6);
    }
    
}
