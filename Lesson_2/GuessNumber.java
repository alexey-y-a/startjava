import java.util.Scanner;

public class GuessNumber {
    
    private final Player player1;
    private final Player player2;
    private final int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.secretNumber = (int) (Math.random() * 100) + 1;
    }

    public void start() {
        System.out.println("Компьютер загадал число от 1 до 100. Угадай число!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (makeGuess(player1, scanner) || makeGuess(player2, scanner)) {
                break;
            }
        }
    }

    private boolean makeGuess(Player player, Scanner scanner) {
        int number = inputNumber(player.getName() + ", введите число: ", scanner);
        player.setNumber(number);
        return checkNumber(player);
    }

    private int inputNumber(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Ошибка: введите целое число!");
                scanner.next(); // Очищаем некорректный ввод
            }
        }
    }

    private boolean checkNumber(Player player) {
        int number = player.getNumber();
        
        if (number == secretNumber) {
            System.out.println("Поздравляем, " + player.getName() + "! Вы угадали число!");
            return true;
        }
        
        if (number < secretNumber) {
            System.out.println("Число " + number + " меньше загаданного");
        } else {
            System.out.println("Число " + number + " больше загаданного");
        }
        
        return false;
    }
}