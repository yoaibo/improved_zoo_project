package improved_zoo_project;

public class Reptile extends Animal {
    private boolean hasVenom;

    public Reptile(String name, boolean hasVenom) {
        super(name);
        this.hasVenom = hasVenom;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the Reptile makes a cold-blooded sound: Hiss!");
    }
}