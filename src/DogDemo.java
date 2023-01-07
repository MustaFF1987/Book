import java.util.Scanner;

public class DogDemo {

    public static void main(String[] args) {
        Dog dog= new Dog("Billy", 10, "Коричневого");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Дайте команду собаке Голос: ");

        String name = scanner.nextLine();

        String DogsName = dog.getDogsName();
        Integer DogsAge = dog.getDogsAge();
        String DogsColor = dog.getDogsColor();

        System.out.println("Я собака по имени = " + DogsName);
        System.out.println("В прошлом году мне было = " + DogsAge + " лет");
        System.out.println("Я " + DogsColor + " цвета");

        Integer Result1 = DogsAge + 1;

        System.out.println("Узнайте сколько лет исполнилось собаке в этом году: ");

        String name2 = scanner.nextLine();

        System.out.println("В этом году мне исполнилось = " + Result1 + " лет");
        System.out.println("Но я так же осталась " + DogsColor + " цвета");

        String NewColor = "Серый";

        String name3 = scanner.nextLine();
        System.out.println("Сегодян я поменяла свой цвет на " + NewColor);

    }

}
