package Control;

import Entidad.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestRegistro {
    
    private static ValidarRegistro validarRegistro = new ValidarRegistro();
    private boolean LONG_NOMBRE_INCORRECTA = false;
    private boolean LONG_PASSWORD_INCORRECTA = false;
    private boolean PASSWORD_DIFERENTE = false;
    private String USUARIO_AUTORIZADO = "Usuario registrado";
    
    public TestRegistro() {
    }
    
    @Test
    public void testNombre(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Gabriela");
        usuario.setPassword("12345");
        assertEquals(validarRegistro.verificarLongitudNombre(usuario.getNombre()), LONG_NOMBRE_INCORRECTA);
    }
    
    @Test
    public void testContraseña(){
        Usuario usuario = new Usuario();
        usuario.setNombre("maria");
        usuario.setPassword("1234567");
        assertEquals(validarRegistro.verificarLongitudPassword(usuario.getPassword()), LONG_PASSWORD_INCORRECTA);
    }
    
    @Test
    public void testPasswords(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Henry");
        usuario.setPassword("1234");
        String vPassword = "123";
        assertEquals(validarRegistro.verificarContraseñas(usuario.getPassword(), vPassword), PASSWORD_DIFERENTE);
    }
    
    @Test
    public void testTodoCorrecto(){
        Usuario usuario = new Usuario();
        String vPassword = "";
        usuario.setNombre("juan");
        usuario.setPassword("1234");
        vPassword = "1234";
        assertEquals(validarRegistro.verificarRegistro(usuario.getNombre(), usuario.getPassword(), vPassword), USUARIO_AUTORIZADO);
        usuario.setNombre("pedro");
        usuario.setPassword("123");
        vPassword = "123";
        assertEquals(validarRegistro.verificarRegistro(usuario.getNombre(), usuario.getPassword(), vPassword), USUARIO_AUTORIZADO);
        usuario.setNombre("maria");
        usuario.setPassword("12345");
        vPassword = "12345";
        assertEquals(validarRegistro.verificarRegistro(usuario.getNombre(), usuario.getPassword(), vPassword), USUARIO_AUTORIZADO);
    }
}
