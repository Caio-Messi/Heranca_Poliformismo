package Program_TelaInicial;

import Application.Heranca_Polimorfismo1.Desenvolvedor;
import Application.Heranca_Polimorfismo1.Gerente;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSalariosDev_Gerente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Gerente gerente;
        Desenvolvedor dev;
        String name;
        Double salarioBase, salarioGerente;

        System.out.println("--------- MENU DE ESCOLHA CARGOS ---------");
        System.out.println("1 - GERENTE");
        System.out.println("2 - DESENVOLVEDOR");
        String escolha = sc.nextLine();

        do {
            switch (escolha) {
                case "1":
                    System.out.println("Insira o nome do gerente: ");
                    name = sc.nextLine();
                    System.out.println("Insira o salario base do salário: ");
                    salarioBase = sc.nextDouble();
                    System.out.println("Insira o valor do bônus: ");
                    salarioGerente = sc.nextDouble();
                    gerente = new Gerente(name, salarioBase, salarioGerente);
                    System.out.println();
                    System.out.println("Nome : " + gerente.getNomeFuncionario());
                    System.out.println("Salário base: " + gerente.getSalariosBaseFuncionarios());
                    System.out.println("Salário após o bônus: " + gerente.calcularSalario());
                    break;
                case "2":
                    System.out.println("Insira o nome do Dev: ");
                    name = sc.nextLine();
                    System.out.println("Insira o salário base do Dev: ");
                    salarioBase = sc.nextDouble();

                    Desenvolvedor desenvolvedor = new Desenvolvedor(name, salarioBase);
                    System.out.println();
                    System.out.println("Nome: " + desenvolvedor.getNomeFuncionario());
                    System.out.println("Salário base do Dev: " + desenvolvedor.getSalariosBaseFuncionarios());
                    System.out.println("Salário do Dev: " + desenvolvedor.calcularSalario());
                    break;
                default:
                    System.out.println("Opção incorreta, tente novamente");
            }
        } while (escolha == "1" && escolha == "2");
        sc.close();
    }
}