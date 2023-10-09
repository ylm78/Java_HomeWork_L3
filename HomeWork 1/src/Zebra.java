public class Zebra extends Animal implements Haslegs{
    private String stripePattern;

    public Zebra(String name, String stripePattern) {
        super(name);
        this.stripePattern = stripePattern;
    }

    public Zebra(String name, String owner, String color, int age){
        super(name, owner, color, age);
    }

    public void gallop() {
        System.out.println("The zebra named " + name + " is galloping!");
    }

    @Override
    public void letsRun(){
        System.out.println("The zebra " + this.name + "run");
    }

    @Override
    public void makeSound(){
        System.out.println("Hehi Hehi");
    }

    @Override
    public int getNumberOfLegs(){
        return 4;
    }
}
