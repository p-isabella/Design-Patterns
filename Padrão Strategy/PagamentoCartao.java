public class PagamentoCartao implements EstrategiaPagamento {
    @Override 
    public void processar() { System.out.println("Fui pago com cartão!"); }
}