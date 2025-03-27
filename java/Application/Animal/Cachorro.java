package Application.Animal;

public class Cachorro extends Animal {
    public Cachorro (String name){
        super((name));
    }
    @Override
    public void fazerSom (){
        System.out.println("O cachorro late");
    }
}
