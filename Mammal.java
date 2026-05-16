package improved_zoo_project;

public class Mammal extends Animal {
    private String furColor;

    public Mammal(String name, String furColor) {
        super(name); 
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the Mammal makes a warm-blooded sound: Roar!");
    }
}