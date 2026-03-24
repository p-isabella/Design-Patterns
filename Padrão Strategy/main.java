// Definindo pagamento e finalizando compra

public static void main(String[] args) {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    carrinho.defineEstrategia(EstrategiaPagamento new PagamentoBoleto);
    carrinho.finalizaCompra();
}