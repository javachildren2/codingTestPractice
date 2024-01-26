package lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lv7_4 {
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(numbers);
        List<Integer> differences = new ArrayList<>();
        for (int i = 1; i < N; i++) {
            differences.add(numbers.get(i) - numbers.get(i - 1));
        }

        int gcd = differences.get(0);
        for (int i = 1; i < differences.size(); i++) {
            gcd = gcd(gcd, differences.get(i));
        }


        int cnt = 0;
        for (int i = 1; i < N; i++) {
            cnt += (numbers.get(i) - numbers.get(i - 1)) / gcd - 1;
        }

        System.out.println(cnt);
    }
}