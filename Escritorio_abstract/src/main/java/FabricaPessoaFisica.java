public class FabricaPessoaFisica implements FabricaAbstrata {
    @Override
    public Contrato createContrato() {
        return new ContratoPessoaFisica();
    }

    @Override
    public Distrato createDistrato() {
        return new DistratoPessoaFisica();
    }

    @Override
    public Procuracao createProcuracao(){
        return new ProcuracaoPessoaFisica();
    }
}
