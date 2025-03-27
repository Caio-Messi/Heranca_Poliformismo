package Heranca_Polimorfismo_2;

public class PagamentoDinheiro extends Pagamento{
    public PagamentoDinheiro (){
        super();
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento com dinheiro aprovado");
    }
}
