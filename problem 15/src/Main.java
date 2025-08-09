import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            sc.nextLine(); // consume newline
            if (N == 0) break;

            String[] lines = new String[N];
            int maxLen = 0;

            for (int i = 0; i < N; i++) {
                String rawLine = sc.nextLine();
                String cleanedLine = rawLine.trim().replaceAll("\\s+", " ");
                lines[i] = cleanedLine;

                if (cleanedLine.length() > maxLen) {
                    maxLen = cleanedLine.length();
                }
            }

            for (String line : lines) {
                int padding = maxLen - line.length();
                for (int i = 0; i < padding; i++) {
                    System.out.print(" ");
                }
                System.out.println(line);
            }
            System.out.println();
        }

        sc.close();
    }
}