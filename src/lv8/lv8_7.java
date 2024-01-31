package lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class lv8_7 {
    //2164 카드2
    public static void main(String[] args) throws IOException {
        //N = 6 123456 34562 5624 246 64 4
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(br.readLine());
        Deque<Integer> card = new LinkedList<>();
        for(int i = 1;i<=N;i++){
            card.add(i);
        }

        for(int i=0;i<N-1;i++){
            card.removeFirst();
            int x =card.removeFirst();
            card.addLast(x);
        }
        int x = card.element();
        System.out.println(x);
    }
}
