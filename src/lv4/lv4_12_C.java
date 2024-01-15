package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv4_12_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");

        int up = Integer.parseInt(strArr[0]);
        int down= Integer.parseInt(strArr[1]);
        int length = Integer.parseInt(strArr[2]);

        int day=0;

        day=(length-down)/(up-down);

        if((length-down)%(up-down)!=0){
            day++;
        }
        System.out.println(day);

    }
}
