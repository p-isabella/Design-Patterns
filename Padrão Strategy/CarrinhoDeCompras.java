public class CarrinhoDeCompras {
    
    private EstrategiaPagamento pagamento;

    public EstrategiaPagamento defineEstrategia(EstrategiaPagamento p) {
        this.pagamento = p;
        return this.pagamento;
    }

    public void finalizaCompra(){ 
        System.out.println("Finalizei a compra. Uhu!!");
        this.pagamento.processar();
    }
}