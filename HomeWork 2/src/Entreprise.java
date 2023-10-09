public class Entreprise {
    protected int employeeNumber;
    protected int capital;

    protected String name;
    protected String mission;

    public Entreprise(int eN, int c, String n, String m){
        this.employeeNumber = eN;
        this.capital = c;
        this.name = n;
        this.mission = m;
    }

    public Entreprise(int eN,String n, String m){
        this.employeeNumber = eN;
        this.name = n;
        this.mission = m;
    }

    public Entreprise(int eN, int c, String n){
        this.employeeNumber = eN;
        this.capital = c;
        this.name = n;
    }

    public Entreprise(int eN, String n){
        this.employeeNumber = eN;
        this.name = n;
    }

    public String mission() throws SecretMissionException{
        return this.mission;
    }

    public int capital() throws NonProfitException{
        return this.capital;
    }

    public static class SecretMissionException extends Exception{
        public SecretMissionException(String message){
            super(message);
        }
    }

    public static class NonProfitException extends Exception{
        public NonProfitException(String message){
            super(message);
        }
    }

    public static void printInformation(Entreprise[]entreprises) throws SecretMissionException,NonProfitException{
        for(int i = 0; i<entreprises.length;i++){
            System.out.println("The Mission : " + entreprises[i].mission + "\n");
            System.out.println("The Capital : " + entreprises[i].capital + "\n");
        }
    }



}

