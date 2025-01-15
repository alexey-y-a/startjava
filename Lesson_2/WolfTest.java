public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "m";
        wolf.nickName = "Alfa";
        wolf.weight = 30;
        wolf.age = 10;
        wolf.color = "white";
        System.out.println("Пол = " + wolf.gender);
        System.out.println("Кличка = " + wolf.nickName);
        System.out.println("Вес = " + wolf.weight);
        System.out.println("Возраст = " + wolf.age);
        System.out.println("Цвет = " + wolf.color);
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}