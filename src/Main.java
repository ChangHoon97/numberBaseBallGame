public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        boolean gameEnd = true;

        while (gameEnd) {
            game.run();
            gameEnd = game.retry();
        }

    }
}