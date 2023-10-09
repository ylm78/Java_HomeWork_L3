public class Vehicle {
    private String vehicType;
    private String vehicNom;
    public Motor motor;
    protected Door door;

    public Vehicle(String vehicType, String vehicNom){
        this.vehicType = vehicType;
        this.vehicNom = vehicNom;
        this.motor = new Motor();
    }

    public String getVehicleType() {
        return vehicType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicType = vehicleType;
    }

    public String getvehicNom() {
        return vehicNom;
    }

    public void setvehicNom(String vehicNom) {
        this.vehicNom = vehicNom;
    }

    public int getTotalDoors(){
        return door.getTotalDoors();
    }

    public void setDoor(int passenger, int trunk) {
        this.door = new Door(passenger,trunk);
    }


public class Motor{
        private String motorType;
        public Motor(){
            if(vehicType.equals("4WD") && vehicNom.equals("Crysler")){
                motorType ="Large";
            }else{
                motorType = "Small";
            }
        }
    public String getMotorType() {
        return motorType;
    }
}

public static class Door{
    protected int passengerDoor;
    protected int trunk;

    public  Door(int passengerDoor, int trunk){
        this.passengerDoor  = passengerDoor;
        this.trunk = trunk;

    }

    public  int getTotalDoors() {

        return passengerDoor + trunk;


    }

    public int getTrunk() {
        return trunk;
    }

    // What happens if we try to access from getTotalPortes() one of the attributes of Vehicle?
    // We can not access because Door class in a static class
    // We can create an element doign : Vehicle.Door myDoor = new Vehicle.Door()
}
}