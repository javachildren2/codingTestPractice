package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv4_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int x = a;
        int y = 0;
        StringBuilder sb = new StringBuilder();

        for (; ; ) {
            if (x < b) {
                if(x>=10){

                    sb.append((char)(x+55));

                }else {
                    sb.append(x);
                }
                break;
            } else {
                y = x %b;
                x = x / b;

                if(y>=10){

                    sb.append((char)(y+55));

                }else{
                    sb.append(y);
                }
            }
        }

        System.out.println(sb.reverse());
        }


    }

