public class Main{
    public static void main(String[] args) {
        
        Sorveteria SCrenata = new Crenata();
        Sorvete Frocos = SCrenata.criarSorvete("Flocos");
        Frocos.delicia();

        Sorveteria SChiquinho = new Chiquinho();
        Sorvete Menta = SChiquinho.criarSorbet("menta");
        Menta.delicia();
    }
}
