import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumbers = scanner.nextInt();
        int countInInterval = 0;
        int countOutInterval = 0;

        for (int i = 0; i < totalNumbers; i++) {
            int number = scanner.nextInt();
            if (number >= 10 && number <= 20) {
                countInInterval++;
            } else {
                countOutInterval++;
            }
        }

        System.out.println(countInInterval + " in");
        System.out.println(countOutInterval + " out");
    }
}