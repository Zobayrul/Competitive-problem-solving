import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Double salary = input.nextDouble();
        Double tax = 0.0;
        if (salary <= 2000.00) {
            System.out.println("Isento");
        } else {
            Double remaining = salary;
            if (remaining > 4500.00) {
                tax += (remaining - 4500.00) * .28;
                remaining = 4500.00;

            }
            if (remaining > 3000.00) {
                tax += (remaining - 3000.00) * .18;
                remaining = 3000.00;
            }
            if (remaining > 2000.00) {
                tax += (remaining - 2000.00) * 0.08;
            }

            System.out.printf("R$ %.2f\n", tax);
        }
    }
}
