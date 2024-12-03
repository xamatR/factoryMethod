import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.ServicoOrcamento;

public class ServicoOrcamentoTest {
    
    @Test
    public void testExecutar() {
        ServicoOrcamento servico = new ServicoOrcamento();
        assertEquals("Orçamento liberado", servico.executar());
    }

    @Test
    public void testCancelar() {
        ServicoOrcamento servico = new ServicoOrcamento();
        assertEquals("Orçamento cancelado", servico.cancelar());
    }

}
