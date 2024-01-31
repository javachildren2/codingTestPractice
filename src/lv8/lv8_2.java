package lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class lv8_2 {
    //10773 제로
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> book = new Stack<>();
        for(int i = 0 ; i<N;i++){
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                book.pop();
            }else{
                book.push(x);
            }
        }
        int sum = sumOfStackElements(book);
        System.out.println(sum);
    }
    private static int sumOfStackElements(Stack<Integer> stack) {
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

}
