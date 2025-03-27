package Application.Heranca_Polimorfismo1;

public abstract class Funcionarios {
    private String nomeFuncionario;
    private Double salariosBaseFuncionarios;

    public Funcionarios(String nomeFuncionario, Double salariosBaseFuncionarios) {
        this.nomeFuncionario = nomeFuncionario;
        this.salariosBaseFuncionarios = salariosBaseFuncionarios;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Double getSalariosBaseFuncionarios() {
        return salariosBaseFuncionarios;
    }

    public void setSalariosBaseFuncionarios(Double salariosBaseFuncionarios) {
        this.salariosBaseFuncionarios = salariosBaseFuncionarios;
    }
    public Double calcularSalario (){
            Double calcularSalario = getSalariosBaseFuncionarios();
            return calcularSalario;
    }

    public void salarioGerente(){
        System.out.println(calcularSalario());
    }
    public void salarioDev (){
        System.out.println(calcularSalario());
    }
}
