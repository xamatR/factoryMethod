import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.ServicoPerscricao;

public class ServicoPerscricaoTest {
  
    @Test
    public void testExecutar() {
        ServicoPerscricao servico = new ServicoPerscricao();
        assertEquals("Prescrição liberada", servico.executar());
    }

    @Test
    public void testCancelar() {
        ServicoPerscricao servico = new ServicoPerscricao();
        assertEquals("Prescrição estornada", servico.cancelar());
    }


}
