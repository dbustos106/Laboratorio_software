package Control;

import DAO.UsuarioDAO;
import Entidad.Usuario;

public class ValidarRegistro {
    
    private UsuarioDAO dao = new UsuarioDAO();
    Usuario usuario = new Usuario();
    
    public ValidarRegistro(){
    
    }
    
    public String verificarRegistro(String nombre, String password, String rePassword){
        if(!verificarLongitudNombre(nombre)){
            return("Longitud nombre incorrecta");
        }else if(!verificarLongitudPassword(password)){
            return("Longitud contraseña incorrecta");
        }else if(!verificarContraseñas(password, rePassword)){
            return("Las contraseñas no coinciden");
        }else{
            usuario.setNombre(nombre);
            usuario.setPassword(password);
            dao.crear(usuario);
            return "Usuario registrado";
        }
    }
    
    public boolean verificarContraseñas(String password, String rePassword){
        return password.equals(rePassword);
    }
    
    public boolean verificarLongitudNombre(String nombre){
        return (nombre.length() > 1 && nombre.length() <= 6);
    }
    
    public boolean verificarLongitudPassword(String password){
        return (password.length() >= 3 && password.length() < 6);
    }
}
