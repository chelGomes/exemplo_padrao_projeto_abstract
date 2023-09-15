public class FabricaPessoaJuridica implements FabricaAbstrata{
    @Override
    public Contrato createContrato() {
        return new ContratoPessoaJuridica();
    }

    @Override
    public Distrato createDistrato() {
        return new DistratoPessoaJuridica();
    }

    @Override
    public Procuracao createProcuracao(){
        return new ProcuracaoPessoaJuridica();
    }
}
