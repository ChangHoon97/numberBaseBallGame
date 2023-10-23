import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private View view;
    private Computer computer;
    private User user;
    boolean answer = false; //정답 여부

    public Game(){
        view = new View();
        computer = new Computer();
        user = new User();
    }

    public void run(){
        ArrayList<Integer> computerNumberList = computer.getComputerNumber();   //랜덤한 정답 번호 생성

        System.out.println(computerNumberList); //정답 번호 출력(빠른 테스트를 위해 출력)

        while (!answer) {
            ArrayList<Integer> userNumberList = user.createUserNumber(view.userInputPrint());   //user의 수 저장
            answer = hint(userNumberList, computerNumberList);
            user.resetUserNumber();
        }
        retry();    //재시작 여부 확인
    }

    public void retry(){
        String userInput = view.retryPrint();

        if(!userInput.equals("1") && !userInput.equals("2")){
            throw new IllegalArgumentException("잘못 입력하셨습니다.");
        }

        if(userInput.equals("1")){
            answer = false;
            run();
        }

    }

    private boolean hint(ArrayList<Integer> userNumberList, ArrayList<Integer> computerNumberList){     //hint를 print하고 정답 여부 반환
        int strike = 0;
        int ball = 0;

        for(int i =0; i<3; i++){    //볼과 스트라이크 카운트
            if(userNumberList.get(i).equals(computerNumberList.get(i))) strike++;
            if(computerNumberList.contains(userNumberList.get(i))) ball++;
        }
        ball -= strike; //strike의 경우 ball에도 포함되기 때문에 수행

        view.hintPrint(strike, ball);   //hint를 print

        if(strike==3){
            view.gameSetPrint();
            return true;
        }
        return false;
    }
}

