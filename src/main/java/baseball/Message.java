package baseball;

public class Message {
    public static void StartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다. 세자리 숫자를 입력하세요");
    }

    public static void EndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void RestartMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void HintMessage(int strike, int ball){
        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else if(strike == 0) {
            System.out.println(ball+ "볼");
        } else if(ball == 0) {
            System.out.println(strike + "스트라이크");
        } else {
            //System.out.println(strike + "스트라이크 " + ball + "볼");
            System.out.println(ball + "볼 "+ strike + "스트라이크");
        }
    }
}
