package Control;

import DAO.UsuarioDAO;
import Entidad.Usuario;
import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestRead extends TestCase{
    
    private boolean OPERACION_EXITOSA = true;
    private boolean OPERACION_NO_EXITOSA = false;
    
    public TestRead() {
    }
    
    @Test
    public void testRead(){
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = new Usuario();
        
        usuario.setNombre("Henry");
        usuario.setPassword("1234");
        assertEquals(dao.leer(usuario), OPERACION_NO_EXITOSA);
        usuario.setNombre("juan");
        usuario.setPassword("1234");
        assertEquals(dao.leer(usuario), OPERACION_EXITOSA);
    }
    
}
