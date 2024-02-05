package lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class lv6_13 {
    //11478 서로 다른 부분 문자열의 개수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        Set<String> substringSet = new HashSet<>();

        // 부분 문자열을 찾기
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(j+" : "+s.substring(i, j));
                substringSet.add(s.substring(i, j));
            }
        }


        System.out.println(substringSet.size());
    }
}