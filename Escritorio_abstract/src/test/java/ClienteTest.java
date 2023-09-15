import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {
    @Test
    void deveEmitirContratoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Fisica", cliente.emitirContrato());
    }

    @Test
    void deveEmitirContratoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Juridica", cliente.emitirContrato());
    }

    @Test
    void deveEmitirDistratoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Distrato Pessoa Fisica", cliente.emitirDistrato());
    }

    @Test
    void deveEmitirDistratoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Distrato Pessoa Juridica", cliente.emitirDistrato());
    }

    @Test
    void deveEmitirProcuracaoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuracao Pessoa Fisica", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuracao Pessoa Juridica", cliente.emitirProcuracao());
    }
}
