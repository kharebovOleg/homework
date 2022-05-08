import java.util.Scanner;

public class EnterPassword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String enterName = scanner.nextLine();
        System.out.println("Введите пароль");
        String enterPassword = scanner.nextLine();
        if (enterPassword.length() < 8 || enterPassword.length() > 15) {
            do {
                System.out.println("Длина пароля должна составлять от 8 до 15 символов");
                enterPassword = scanner.nextLine();
            } while (enterPassword.length() < 8 || enterPassword.length() > 15);
        }
        System.out.printf("%s, ваш новый пароль: %s", enterName, enterPassword);

        System.out.println("hello");
        System.out.println("hello");
    }
}
