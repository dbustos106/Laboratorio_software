package Control;

import Entidad.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestLogin {
    
    private static ValidarLogin validarLogin = new ValidarLogin();
    private String LONG_NOMBRE_INCORRECTA = "Longitud nombre incorrecta";
    private String LONG_PASSWORD_INCORRECTA = "Longitud contraseña incorrecta";
    private String DATOS_INCORRECTOS = "Datos incorrectos";
    private String USUARIO_AUTORIZADO = "Bienvenido";
    
    public TestLogin() {
    }
    
    @Test
    public void testLongitudNombre(){
        Usuario usuario = new Usuario();
        usuario.setNombre("R");
        usuario.setPassword("123456");
        assertEquals(validarLogin.verificarLogin(usuario), LONG_NOMBRE_INCORRECTA);
        usuario.setNombre("Roberto");
        usuario.setPassword("123456");
        assertEquals(validarLogin.verificarLogin(usuario), LONG_NOMBRE_INCORRECTA);
    }
    
    @Test
    public void testLongitudContraseña(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Pepe");
        usuario.setPassword("12");
        assertEquals(validarLogin.verificarLogin(usuario), LONG_PASSWORD_INCORRECTA);
        usuario.setNombre("Pepe");
        usuario.setPassword("123456");
        assertEquals(validarLogin.verificarLogin(usuario), LONG_PASSWORD_INCORRECTA);
    }
    
    @Test
    public void testNombre(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Henry");
        usuario.setPassword("12345");
        assertEquals(validarLogin.verificarLogin(usuario), DATOS_INCORRECTOS);
    }
    
    @Test
    public void testContraseña(){
        Usuario usuario = new Usuario();
        usuario.setNombre("maria");
        usuario.setPassword("1234");
        assertEquals(validarLogin.verificarLogin(usuario), DATOS_INCORRECTOS);
    }
    
    @Test
    public void testDatos(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Henry");
        usuario.setPassword("1234");
        assertEquals(validarLogin.verificarLogin(usuario), DATOS_INCORRECTOS);
    }
    
    @Test
    public void testTodoCorrecto(){
        Usuario usuario = new Usuario();
        usuario.setNombre("juan");
        usuario.setPassword("1234");
        assertEquals(validarLogin.verificarLogin(usuario), USUARIO_AUTORIZADO);
        usuario.setNombre("pedro");
        usuario.setPassword("123");
        assertEquals(validarLogin.verificarLogin(usuario), USUARIO_AUTORIZADO);
        usuario.setNombre("maria");
        usuario.setPassword("12345");
        assertEquals(validarLogin.verificarLogin(usuario), USUARIO_AUTORIZADO);
    }
}
