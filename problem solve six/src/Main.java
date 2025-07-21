import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            int validScores = 0;
            double sum = 0;

            // Read two valid scores
            while (validScores < 2) {
                double score = scanner.nextDouble();

                if (score >= 0.0 && score <= 10.0) {
                    sum += score;
                    validScores++;
                } else {
                    System.out.println("nota invalida");
                }
            }

            double average = sum / 2.0;
            System.out.printf("media = %.2f%n", average);

            int option = 0;
            // Ask for new calculation
            while (option != 1 && option != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                option = scanner.nextInt();
            }

            if (option == 2) {
                continueProgram = false;
            }
        }

        scanner.close();
    }
}