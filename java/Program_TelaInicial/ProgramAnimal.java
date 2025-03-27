package Program_TelaInicial;

import Application.Animal.Animal;
import Application.Animal.Cachorro;

import java.util.Scanner;

public class ProgramAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome de seu cachorro: ");
        String nomeCachorro = sc.nextLine();
        System.out.println("Insira o nome de um animal: ");
        String nomeAnimal = sc.nextLine();
        Cachorro dog = new Cachorro(nomeCachorro);
        System.out.println("SOM DO CACHORRO: ");
        dog.fazerSom();
        Animal animals = new Animal(nomeAnimal);
        System.out.println("SOM GENÉRICO ANIMAL: ");
        animals.fazerSom();

        sc.close();
    }
}
