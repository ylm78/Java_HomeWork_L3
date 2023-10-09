public abstract class Animal {
    protected String name;
    protected String owner;
    protected String color;
    protected int age;

    public Animal(String name){
        this.name = name;
    }

    public Animal(String name, String owner, String color, int age){
        this.name = name;
        this.owner = owner;
        this.color = color;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("An animal make a sound like...");
    }

    @Override
    public String toString(){
        return "Name : " + this.name + "\nOwner : " + this.owner + "\nColor : "  + this.color + "\nAge : " + this.age;
    }

}
