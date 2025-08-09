import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // number of test cases

        for (int t = 0; t < N; t++) {
            int L = sc.nextInt();  // number of lines in this test case
            sc.nextLine(); // consume newline

            int totalHash = 0;

            for (int i = 0; i < L; i++) {
                String line = sc.nextLine();

                for (int j = 0; j < line.length(); j++) {
                    char c = line.charAt(j);
                    int alphabetPos = c - 'A';   // 0-based position in alphabet
                    int elementIndex = i;        // line index
                    int charPos = j;             // character index in line

                    totalHash += alphabetPos + elementIndex + charPos;
                }
            }
            System.out.println(totalHash);
        }
        sc.close();
    }
}