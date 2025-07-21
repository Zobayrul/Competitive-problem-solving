import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int interWins = 0;
        int gremioWins = 0;
        int draws = 0;
        int totalMatches = 0;

        while (true) {
            int interGoals = sc.nextInt();
            int gremioGoals = sc.nextInt();

            if (interGoals > gremioGoals) {
                interWins++;
            } else if (gremioGoals > interGoals) {
                gremioWins++;
            } else {
                draws++;
            }

            totalMatches++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            int answer = sc.nextInt();

            if (answer != 1) {
                break;
            }
        }

        System.out.println(totalMatches + " grenais");
        System.out.println("Inter:" + interWins);
        System.out.println("Gremio:" + gremioWins);
        System.out.println("Empates:" + draws);

        if (interWins > gremioWins) {
            System.out.println("Inter venceu mais");
        } else if (gremioWins > interWins) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

        sc.close();
    }
}