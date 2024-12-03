import org.junit.jupiter.api.Test;
import com.example.ServicoProgVisitas;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoProgVisitasTest {


    @Test
    public void testExecutar() {
        ServicoProgVisitas servico = new ServicoProgVisitas();
        assertEquals("Visita realizada", servico.executar());
    }

    @Test
    public void testCancelar() {
        ServicoProgVisitas servico = new ServicoProgVisitas();
        assertEquals("Visita cancelada", servico.cancelar());
    }
}
