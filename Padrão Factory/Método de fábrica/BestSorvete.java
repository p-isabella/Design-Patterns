public class BestSorvete extends Sorvete {
    BestSorvete(String tipo){
        this.sabor = tipo;
    }
    
    public void DefineSabor(String NovoSabor){
        this.sabor = NovoSabor;
    }

    @Override
    public void delicia() {
        System.out.println("Hmmm, delícia, sorvete de " + this.sabor);
    }
}
