package Application.Heranca_Polimorfismo1;

public class Desenvolvedor extends Funcionarios {
    public Double salarioDev;

    public Double getSalarioDev() {
        return salarioDev;
    }

    public void setSalarioDev(Double salarioDev) {
        this.salarioDev = salarioDev;
    }

    public Desenvolvedor (String nomeFuncionario, Double salarioBaseFuncionarios){
        super (nomeFuncionario, salarioBaseFuncionarios);
    }
    @Override
    public Double calcularSalario(){
        return salarioDev = getSalariosBaseFuncionarios() + (getSalariosBaseFuncionarios() * 0.10);
    }


}
