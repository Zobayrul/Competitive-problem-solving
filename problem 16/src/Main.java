import java.util.Scanner;

public class Main {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        int count = 0;
        boolean isEnd = false;
    }

    static class Trie {
        TrieNode root = new TrieNode();

        void insert(String word) {
            TrieNode node = root;
            for (char ch : word.toCharArray()) {
                int idx = ch - 'a';
                if (node.children[idx] == null) {
                    node.children[idx] = new TrieNode();
                }
                node = node.children[idx];
                node.count++;
            }
            node.isEnd = true;
        }

        int keystrokesForWord(String word) {
            TrieNode node = root;
            int strokes = 0;
            for (int i = 0; i < word.length(); i++) {
                int idx = word.charAt(i) - 'a';
                node = node.children[idx];

                if (i == 0 || node.count > 1 || node.isEnd) {
                    strokes++;
                }
            }
            return strokes;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;
            sc.nextLine();

            Trie trie = new Trie();
            String[] words = new String[N];

            for (int i = 0; i < N; i++) {
                words[i] = sc.nextLine();
                trie.insert(words[i]);
            }

            double totalStrokes = 0;
            for (String w : words) {
                totalStrokes += trie.keystrokesForWord(w);
            }

            double avg = totalStrokes / N;
            System.out.printf("%.2f\n", avg);
        }

        sc.close();
    }
}