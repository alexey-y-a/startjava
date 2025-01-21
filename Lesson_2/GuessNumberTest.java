import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(scanner.nextLine());
        boolean isGameContinued = true;
        while (isGameContinued) {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            System.out.println("Хотите продолжить игру? [yes/no]:");
            String answer = scanner.nextLine();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Неверный ввод. Хотите продолжить игру? [yes/no]:");
                answer = scanner.nextLine();
            }
            if (answer.equals("no")) {
                isGameContinued = false;
            }
        }
        System.out.println("Игра завершена!");
    }
}