package improved_zoo_project; 

public abstract class Animal {
    protected String name;
    private String kingdom = "Animalia";

    public Animal(String name) {
        this.name = name;
    }

    public String getKingdom() {
        return kingdom;
    }

    public abstract void makeSound();
}