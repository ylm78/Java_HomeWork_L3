public class Main {
    public static void main(String []args){
        Animal tab[] = new Animal[3];
        Animal a1 = new Zebra("Zebraloli", "strip");
        Animal a2 = new Elephant("Elephantoli", 1.7);
        Animal a3 = new Python("Pythonapoli", true);
        tab[0] = a1;
        tab[1] = a2;
        tab[2] = a3;
        for(int i = 0;i<tab.length;i++){
            if(tab[i] instanceof Elephant){
                ((Elephant) tab[i]).trumpet();
            }
            if(tab[i] instanceof Zebra){
                ((Zebra) tab[i]).gallop();
            }
            if(tab[i] instanceof Python){
                ((Python) tab[i]).slither();
            }
            System.out.println(tab[i].toString());
        }
    }
}
