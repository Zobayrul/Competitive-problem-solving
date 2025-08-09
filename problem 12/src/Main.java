import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringBuilder result = new StringBuilder();

            boolean italicOpen = false;
            boolean boldOpen = false;

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == '_') {
                    if (!italicOpen) {
                        result.append("<i>");
                        italicOpen = true;
                    } else {
                        result.append("</i>");
                        italicOpen = false;
                    }
                } else if (c == '*') {
                    if (!boldOpen) {
                        result.append("<b>");
                        boldOpen = true;
                    } else {
                        result.append("</b>");
                        boldOpen = false;
                    }
                } else {
                    result.append(c);
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}