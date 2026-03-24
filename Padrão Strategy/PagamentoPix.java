public class PagamentoPix implements EstrategiaPagamento {
    @Override 
    public void processar() { System.out.println("Fui pago com pix!"); }
}