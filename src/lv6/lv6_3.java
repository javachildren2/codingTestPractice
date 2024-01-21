package lv6;

import java.util.*;

public class lv6_3 {
    //1181 단어정렬
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());


        List<String> words = new ArrayList<>();

        Set<String> uniqueWords = new HashSet<>();


        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            words.add(word);
            uniqueWords.add(word);
        }

        Collections.sort(words, (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return Integer.compare(s1.length(), s2.length());
            } else {
                return s1.compareTo(s2);
            }
        });

        for (String word : words) {
            if (uniqueWords.contains(word)) {
                System.out.println(word);
                uniqueWords.remove(word);
            }
        }
    }
}