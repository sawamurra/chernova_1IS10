import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Введите имя: ");
        String name=scanner.nextLine();

        System.out.print("Введите возраст: ");
        int age=scanner.nextInt();

        System.out.print("Введите вес: ");
        double weight=scanner.nextDouble();

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Вес: " + weight);


    }
}
