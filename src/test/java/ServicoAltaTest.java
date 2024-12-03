import org.junit.jupiter.api.Test;

import com.example.ServicoAlta;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ServicoAltaTest {
    @Test
    public void testExecutar() {
        ServicoAlta servico = new ServicoAlta();
        assertEquals("Alta Liberada", servico.executar());
    }

    @Test
    public void testCancelar() {
        ServicoAlta servico = new ServicoAlta();
        assertEquals("Alta obito", servico.cancelar());
    }    
}
