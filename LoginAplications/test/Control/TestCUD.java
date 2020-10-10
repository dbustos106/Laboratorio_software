package Control;

import DAO.UsuarioDAO;
import Entidad.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCUD {
    
    private boolean OPERACION_EXITOSA = true;
    private boolean OPERACION_NO_EXITOSA = false;
    
    public TestCUD() {
    }
    
    @Test
    public void testCreate(){
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = new Usuario();
        
        usuario.setNombre("juan");
        usuario.setPassword("1234");
        assertEquals(dao.crear(usuario), OPERACION_EXITOSA);
        usuario.setNombre("pedro");
        usuario.setPassword("123");
        assertEquals(dao.crear(usuario), OPERACION_EXITOSA);
        usuario.setNombre("maria");
        usuario.setPassword("12345");
        assertEquals(dao.crear(usuario), OPERACION_EXITOSA);
        usuario.setNombre("john");
        usuario.setPassword("4567");
        assertEquals(dao.crear(usuario), OPERACION_EXITOSA);
    }
    
    @Test
    public void testUpdate(){
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = new Usuario();
        Usuario oldUsuario = new Usuario();
        
        usuario.setNombre("Henry");
        usuario.setPassword("1234");
        oldUsuario.setNombre("Henry");
        oldUsuario.setPassword("123");
        assertEquals(dao.actualizar(oldUsuario, oldUsuario), OPERACION_NO_EXITOSA);
        usuario.setNombre("pedro");
        usuario.setPassword("321");
        oldUsuario.setNombre("pedro");
        oldUsuario.setPassword("123");
        assertEquals(dao.actualizar(oldUsuario, oldUsuario), OPERACION_EXITOSA);
    }
    
    @Test
    public void testDelete(){
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = new Usuario();
        
        usuario.setNombre("Henry");
        usuario.setPassword("1234");
        assertEquals(dao.eliminar(usuario), OPERACION_NO_EXITOSA);
        usuario.setNombre("john");
        usuario.setPassword("4567");
        assertEquals(dao.eliminar(usuario), OPERACION_EXITOSA);
    }
    
}
