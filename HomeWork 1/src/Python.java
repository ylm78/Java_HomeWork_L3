public class Python extends Animal{
    private boolean isVenomous;

    public Python(String name, boolean isVenomous){
        super(name);
        this.isVenomous = isVenomous;
    }

    public Python(String name, String owner, String color, int age){
        super(name, owner, color, age);
    }

    public void slither() {
        System.out.println("The python named " + name + " is slithering!");
    }

    @Override
    public void makeSound(){
        System.out.println("Sssss");
    }
}
