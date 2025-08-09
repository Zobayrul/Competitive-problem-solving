import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int[] ledsPerDigit = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        for (int i = 0; i < N; i++) {
            String number = sc.nextLine().trim();
            int totalLeds = 0;
            for (char digitChar : number.toCharArray()) {
                int digit = digitChar - '0';
                totalLeds += ledsPerDigit[digit];
            }
            System.out.println(totalLeds + " leds");
        }

        sc.close();
    }
}