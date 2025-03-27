package Application.Heranca_Polimorfismo1;

public class Gerente extends Funcionarios{
    public Double bonusSalario;

    public Double getBonusSalario(){
        return bonusSalario;
    }
    public void setBonusSalario(Double bonusSalario){
        this.bonusSalario = bonusSalario;
    }
    public Gerente (String nomeFuncionario, Double salarioBaseFuncionarios, Double bonusSalario){
        super (nomeFuncionario, salarioBaseFuncionarios);
        this.bonusSalario = bonusSalario;
    }
    @Override
    public Double calcularSalario () {
        return getSalariosBaseFuncionarios() + getBonusSalario();
    }
        @Override
        public void salarioGerente() {
            System.out.println(calcularSalario());
        }
    }

