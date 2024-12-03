import org.junit.jupiter.api.Test;
import com.example.ServicoFactory;
import com.example.IServico;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class ServicoFactoryTeste {

    @Test
    void deveRtornarExececaoParaServicoInexistente() {
        try{
            IServico servico = ServicoFactory.obterServico("Contrato");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("Evolucao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}
