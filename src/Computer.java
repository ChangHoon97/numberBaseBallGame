import java.util.ArrayList;

public class Computer {
    private ArrayList<Integer> computerNumber;

    Computer(){

    }

    public int generateSingleNumber(){

        return  (int) (Math.random() * 8) + 1;
    }

    public int generateFullNumber(int length){
        int randomNumber = generateSingleNumber();
        if(!computerNumber.contains(randomNumber)){
            
        }
    }

}
