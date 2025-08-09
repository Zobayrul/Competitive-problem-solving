import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int t = 0; t < T; t++) {
            String line = sc.nextLine();
            StringBuilder hidden = new StringBuilder();

            boolean newWord = true;
            for (char ch : line.toCharArray()) {
                if (ch == ' ') {
                    newWord = true;
                } else {
                    if (newWord) {
                        hidden.append(ch);
                        newWord = false;
                    }
                }
            }
            System.out.println(hidden.toString());
        }
        sc.close();
    }
}