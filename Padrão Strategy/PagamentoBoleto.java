public class PagamentoBoleto implements EstrategiaPagamento {
    @Override 
    public void processar() { System.out.println("Fui pago com boleto!"); }
}