public class Elephant extends Animal implements Haslegs{
    private double tuskLength;

    public Elephant(String name, double tuskLength){
        super(name);
        this.tuskLength = tuskLength;
    }

    public Elephant(String name, String owner, String color, int age){
        super(name, owner, color, age);
    }
    public void trumpet() {
        System.out.println("The elephant named " + name + " is trumpeting!");
    }

    @Override
    public void letsRun(){
        System.out.println("The elephant " + this.name + "run");
    }

    @Override
    public void makeSound(){
        System.out.println("Huuuuuuu");
    }

    @Override
    public int getNumberOfLegs(){
        return 4;
    }

}
