public class BestSorbet extends Sorvete {
    BestSorbet(String tipo){
        this.sabor = tipo;
    }

    public void DefineSabor(String NovoSabor){
        this.sabor = NovoSabor;
    }

    @Override
    public void delicia() {
        System.out.println("Hmmm, delícia, sorbet de " + this.sabor);
    }

}
