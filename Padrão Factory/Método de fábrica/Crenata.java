public class Crenata implements Sorveteria {
    
    @Override
    public Sorvete criarSorbet(String tipo){
        return new BestSorbet(tipo);
    }

    @Override
    public Sorvete criarSorvete(String tipo){
        return new BestSorvete(tipo);
    }

    @Override
    public void vendeSorvete() {
        System.out.println("Crenata vendendo um sorvete delicioso!");
    }
}
