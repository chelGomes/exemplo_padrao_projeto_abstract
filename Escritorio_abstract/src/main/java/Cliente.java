public class Cliente {
    private Contrato contrato;
    private Distrato distrato;

    private Procuracao procuracao;

    public Cliente (FabricaAbstrata fabrica) {
        this.contrato = fabrica.createContrato();
        this.distrato = fabrica.createDistrato();
        this.procuracao = fabrica.createProcuracao();
    }

    public String emitirContrato() {
        return this.contrato.emitir();
    }

    public String emitirDistrato() {
        return this.distrato.emitir();
    }

    public String emitirProcuracao(){
        return this.procuracao.emitir();
    }
}
