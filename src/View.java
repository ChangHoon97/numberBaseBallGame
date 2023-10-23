import java.util.Objects;
import java.util.Scanner;

public class View {
    private final Scanner sc = new Scanner(System.in);

    public View(){
        System.out.println("숫자 야구 게임을 시작합니다.");
    }
    public String userInputPrint(){ //user의 숫자 받기
        System.out.print("세자리 숫자를 제시해주세요 : ");
        return sc.nextLine();
    }

    public void hintPrint(int strike, int ball){    //hint
        if(strike ==0 && ball == 0){
            System.out.println("낫싱");
            return;
        }
        if(ball != 0){
            System.out.print(ball + "볼 ");
        }
        if(strike != 0){
            System.out.println(strike + "스트라이크");
        }
    }

    public void gameSetPrint(){     //정답을 맞혔을 경우
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public String retryPrint(){     //게임 재시작 여부
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String userInput = sc.nextLine();
        if(!userInput.equals("1") && !userInput.equals("2")){
            throw new IllegalArgumentException("잘못 입력하셨습니다.");
        }
        return userInput;
    }
}
