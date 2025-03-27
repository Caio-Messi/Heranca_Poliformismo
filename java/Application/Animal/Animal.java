package Application.Animal;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Animal (String name){
        this.name = name;
    }
    public void fazerSom (){
        System.out.println("Som genérico de animal");
    }
}
