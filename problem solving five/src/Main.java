import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int correctPassword = 2002;

        while (true) {
            int passwordAttempt = scanner.nextInt();

            if (passwordAttempt == correctPassword) {
                System.out.println("Acesso Permitido");
                break;  // Stop the program
            } else {
                System.out.println("Senha Invalida");
            }
        }
    }
}