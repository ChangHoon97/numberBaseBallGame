public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        boolean gameEnd = true;

        while (gameEnd) {
            game.run();
            gameEnd = game.retry();
        }

        System.out.println("Testing");
        System.out.println("jira Test");
        System.out.println("KAN-1-Lee");
        System.out.println("test2");
        System.out.println("test3");
        System.out.println("test4");

    }
}