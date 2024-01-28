package lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class lv8_3 {
    //9012 괄호
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Character> VPS = new Stack<>();

        for(int i = 0 ;i < N ;i++){
            String s = br.readLine();
            for(int j = 0 ; j<s.length();j++){
                VPS.push(s.charAt(j));
                if(s.charAt(j)=='('){
                    
                }
            }
        }

    }
}
