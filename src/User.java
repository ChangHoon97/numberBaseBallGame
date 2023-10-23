import lombok.Getter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

@Getter
public class User {
    private ArrayList<Integer> userNumber;

    public User() {
        userNumber = new ArrayList<>();
    }

    public ArrayList<Integer> createUserNumber(String userInput) {  //userNumber를 ArrayList로 저장하여 반환
        if(isValidate(userInput)){
            for(char c : userInput.toCharArray()){
                userNumber.add(Character.getNumericValue(c));
            }
        }else {
            throw new IllegalArgumentException("입력값이 잘못되었습니다.");
        }
        return userNumber;
    }

    public void resetUserNumber(){  //userNumber가 정답이 아닌 경우 userNumber값을 리셋
        userNumber.clear();
    }

    private boolean isValidate(String userInput){   //userNumber의 validation 확인

        if(userInput.length() !=3) return false;    // userInput의 길이가 3인가?
        if(!userInput.matches("\\d+")) return false;    //userInput이 숫자로만 이루어져있는가?
        if(isRepeated(userInput))  return false;    // userInput에 반복되는 숫자가 있는가?
        if(userInput.contains("0")) return false;  //userInput에 0이 포함되어 있는가?

        return true;

    }

    private boolean isRepeated(String userInput){   //중복이 발견되었다면 true 반환
        HashSet<Character> set = new HashSet<>();
        for(char c : userInput.toCharArray()){
            if(!set.add(c)) return true;
        }
        return false;
    }

}
