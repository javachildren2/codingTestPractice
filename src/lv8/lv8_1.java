package lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class lv8_1 {
    //28728 스택 2 , 다중 선택 : shift + alt + 클릭
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> order = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
          switch (Integer.parseInt(st.nextToken())){
              case 1:
                  order.push(Integer.parseInt(st.nextToken()));
                  break;
              case 2:
                  if(!order.empty()){
                      int x= order.pop();
                      sb.append(x+"\n");
                  }else{
                      sb.append(-1+"\n");
                  }
                  break;
              case 3:
                  sb.append(order.size()+"\n");
                  break;
              case 4:
                  if(!order.empty()){
                      sb.append(0+"\n");
                  }else {
                      sb.append(1+"\n");
                  }
                  break;
              case 5:
                  if(!order.empty()){
                      sb.append(order.lastElement()+"\n");
                  }else{
                      sb.append(-1+"\n");
                  }
          }

        }
        System.out.println(sb);
    }
}
