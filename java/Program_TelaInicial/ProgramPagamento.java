package Program_TelaInicial;

import Heranca_Polimorfismo_2.Pagamento;
import Heranca_Polimorfismo_2.PagamentoCartao;
import Heranca_Polimorfismo_2.PagamentoDinheiro;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Pagamento [] pagamentos = new Pagamento[2];
        pagamentos[0] = new PagamentoCartao();
        pagamentos [1] = new PagamentoDinheiro();
        for (Pagamento pagamento : pagamentos){
            pagamento.realizarPagamento();
        }
    }
}
