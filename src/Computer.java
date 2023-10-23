import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Computer {
    private final ArrayList<Integer> computerNumber = new ArrayList<>();

    Computer(){ //객체가 선언되면 생성자를 통해 랜덤 번호 생성
        generateFullNumber();
    }

    private int generateSingleNumber(){  //단일 랜덤 숫자 생성 메서드
        return  (int) (Math.random() * 8) + 1;
    }

    private void generateFullNumber(){   //전체 숫자 생성 메서드
        while (computerNumber.size() < 3) {
            int randomNumber = generateSingleNumber();
            if(!computerNumber.contains(randomNumber)){
                computerNumber.add(randomNumber);
            }
        }
    }

}
