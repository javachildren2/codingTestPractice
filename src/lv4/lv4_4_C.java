package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class lv4_4 {

    public static String wordDistinct(String s) {
        if (s == null || s.isBlank()) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.add(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        StringBuilder sb = new StringBuilder(wordDistinct(word));

        System.out.println(sb);






    }
   }
