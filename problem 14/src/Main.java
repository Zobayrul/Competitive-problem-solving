import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String coded = sc.nextLine();
            int shift = sc.nextInt();
            sc.nextLine();

            StringBuilder decoded = new StringBuilder();

            for (char c : coded.toCharArray()) {

                int originalPos = (c - 'A' - shift + 26) % 26;
                decoded.append((char) ('A' + originalPos));
            }

            System.out.println(decoded.toString());
        }

        sc.close();
    }
}