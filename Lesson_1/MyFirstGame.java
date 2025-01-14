 public class MyFirstGame {
    
    public static void main(String[] args) {
        System.out.println("\nИгра Угадай число\n");

        int secretNumber = 50;
        System.out.println("\nКомпьютер загадал число от 1 до 100. Попробуйте угадать!\n");
        for (int i = 1; i <= 100; i++) {
            System.out.println("Игрок выбрал число: " + i);
            if (i == secretNumber) {
                System.out.println("Вы победили!");
                break;
            }
            if (i > secretNumber) {
                System.out.println(i + " ,больше того, что загадал компьютер");
            }
        }
    }
}