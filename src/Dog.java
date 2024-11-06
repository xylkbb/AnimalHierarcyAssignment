public class Dog extends Animal{

    public Dog(){
        this.species = "Dog";
    }

    @Override
    public void makeSound(){
        System.out.println("Woof");
    }
}
