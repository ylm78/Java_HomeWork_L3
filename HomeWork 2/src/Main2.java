public class Main2 {
    public static void main(String []args){
        Vehicle V1 = new Vehicle("4WD", "Crysler");
        Vehicle V2 = new Vehicle("3WD", "Peugeot");

        System.out.println("Motor type of " + V1.getvehicNom() + " is " + V1.motor.getMotorType());
        System.out.println("Motor type of " + V2.getvehicNom() + " is " + V2.motor.getMotorType());

        V1.setDoor(4,1);
        V2.setDoor(2,1);

        System.out.println("The number of door of" + V1.getvehicNom() + " is " + V1.getTotalDoors());
        System.out.println("The number of door of" + V2.getvehicNom() + " is " + V2.getTotalDoors());
    }
}
