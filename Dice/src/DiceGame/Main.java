package DiceGame;
import java.util.Random;

// 주사위 클래스
class Die {
    private int faceValue;

    public void roll() {
        Random rand = new Random();
        faceValue = rand.nextInt(6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}

// 플레이어 클래스
class Player {
    private final String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addToScore(int points) {
        score += points;
    }
}

// 주사위 게임 클래스
class DiceGame {
    private final Die die1;
    private final Die die2;
    private final Player player1;
    private final Player player2;

    public DiceGame(String player1Name, String player2Name) {
        die1 = new Die();
        die2 = new Die();
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
    }

    public void play() {
        die1.roll();
        int v1 = die1.getFaceValue();
        System.out.println(player1.getName() + "의 첫 번째 주사위 결과: " + v1);

        die2.roll();
        int v2 = die2.getFaceValue();
        System.out.println(player1.getName() + "의 두 번째 주사위 결과: " + v2);

        int sum = v1 + v2;

        if (sum >= 7) {
            player1.addToScore(1);
            System.out.println(player1.getName() + " 승리!");
        } else {
            player2.addToScore(1);
            System.out.println(player2.getName() + " 승리!");
        }
    }

    public void printFinalResult() {
        System.out.println("게임 종료");
        System.out.println(player1.getName() + "의 최종 스코어: " + player1.getScore());
        System.out.println(player2.getName() + "의 최종 스코어: " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + "이(가) 최종 승리!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + "이(가) 최종 승리!");
        } else {
            System.out.println("최종 무승부!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        DiceGame game = new DiceGame("플레이어1", "플레이어2");
        game.play();
        game.printFinalResult();
    }
}