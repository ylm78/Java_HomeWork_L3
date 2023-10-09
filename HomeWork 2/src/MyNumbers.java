public class MyNumbers {
    private int arrayNumbers[];

    public MyNumbers(int arraySize){
        arrayNumbers = new int[arraySize];
    }

    public void setNumber(int number, int index) throws sameNumberTwiceException, arrayIndexIsNotOkException{
        if (index <=0 || index > arrayNumbers.length){
            throw new arrayIndexIsNotOkException("Wrong index, can not insert " + number + "in index :" + index);
        }
        for(int i = 0;i<arrayNumbers.length;i++){
            if(arrayNumbers[i] == number){
                throw new sameNumberTwiceException("The number is already in the array");
            }
        }
        arrayNumbers[index] = number;
    }

    public int getNumberByIndex(int index){
        if(index<=0 || index >arrayNumbers.length){
            System.out.println("Wrong");
            return -1;
        }
        return arrayNumbers[index];
    }

    public int averageArray(){
        int sum = 0, avg = 0;
        for(int i =0; i<arrayNumbers.length;i++){
            sum +=arrayNumbers[i];
        }
        avg =(int)((double)sum/arrayNumbers.length);
        return avg;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MyNumbers: [");
        for (int i = 0; i < arrayNumbers.length; i++) {
            stringBuilder.append(arrayNumbers[i]);
            if (i < arrayNumbers.length - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}
