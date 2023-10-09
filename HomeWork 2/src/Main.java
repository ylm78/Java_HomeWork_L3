public class Main {
    public static void main(String[] args) throws sameNumberTwiceException, arrayIndexIsNotOkException {
        MyNumbers MN1 = new MyNumbers(5);
        MN1.setNumber(2,3);
        System.out.println(MN1.toString());
    }
}