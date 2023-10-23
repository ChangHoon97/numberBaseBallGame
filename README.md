# numberBaseBallGame
숫자야구 게임을 절차 지향 프로그래밍이 아닌 객체 지향 프로그래밍의 관점에서 개발

<br>

**요구사항**
```
기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.

1. 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 낫싱이란 힌트를 얻고,
  그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
  예) 상대방(컴퓨터)의 수가 425일 때
  123을 제시한 경우 : 1스트라이크
  456을 제시한 경우 : 1볼 1스트라이크
  789를 제시한 경우 : 낫싱
2. 위 숫자 야구 게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다.
  게임 플레이어는 컴퓨터가 생각하고 있는 서로 다른 3개의 숫자를 입력하고,컴퓨터는 입력한 숫자에 대한 결과를 출력한다.
3. 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
4. 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
5. 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.

```

<br>

### 객체는 User, Computer, Game, View로 나누어진다.

1. User 객체
   - User가 입력한 값의 예외처리
   - 입력한 값을 ArrayList 타입 변수에 저장

2. Computer 객체
    - 랜덤한 정답 숫자를 생성
    - ArrayList에 정답 숫자 저장

3. Game 객체
    - Hint의 연산
    - 게임의 시작과 재시작 여부

4. View 객체
    - Console 입력
    - Console 출력

