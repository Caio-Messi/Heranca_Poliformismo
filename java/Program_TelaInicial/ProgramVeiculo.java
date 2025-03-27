package Program_TelaInicial;

import Application.Veiculo.Bicicleta;
import Application.Veiculo.Carro;
import Application.Veiculo.Veiculo;

public class ProgramVeiculo {
    public static void main(String[] args) {
        Veiculo [] veiculos =  new Veiculo[2];
        veiculos [0] = new Carro();
        veiculos[1] = new Bicicleta();

        for (Veiculo veiculo : veiculos){
            veiculo.Movimento();
        }
    }
}
