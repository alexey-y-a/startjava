import java.util.Scanner;

public class GuessNumber {
    
    private Player player1;
    private Player player2;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        secretNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Компьютер загадал число от 1 до 100. Угадай число!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(player1.getName() + ", введите число: ");
            player1.setNumber(scanner.nextInt());
            if (checkNumber(player1)) {
                break;
            }
            System.out.print(player2.getName() + ", введите число: ");
            player2.setNumber(scanner.nextInt());
            if (checkNumber(player2)) {
                break;
            }
        }
    }
    
    private boolean checkNumber(Player player) {
        int number = player.getNumber();
        if (number == secretNumber) {
            System.out.println("Поздравляем, " + player.getName() + "! Вы угадали число!");
            return true;
        } else if (number < secretNumber) {
            System.out.println("Число " + number + " меньше загаданного");
        } else {
            System.out.println("Число " + number + " больше загаданного");
        }
        return false;
    }
}