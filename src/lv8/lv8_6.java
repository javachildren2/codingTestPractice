package lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class lv8_6 {
    //18258 큐2, 이 코드에서는 lastElement가 중요하다 마지막요소를 add할때마다 초기화 시켜줌으로써
    // back명령어를 입력 받으면 리턴 해줄수 있음
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int lastElement = -1;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push":
                    int y=Integer.parseInt(st.nextToken());
                    lastElement=y;
                    queue.add(y);

                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1+"\n");
                        break;
                    } else {
                        int x = queue.remove();
                        sb.append(x+"\n");
                        break;
                    }
                case "size":
                    sb.append(queue.size()+"\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1+"\n");
                        break;
                    } else {
                        sb.append(0+"\n");
                        break;
                    }
                case "front":{
                    if (queue.isEmpty()) {
                        sb.append(-1+"\n");
                        break;
                    }else{
                        sb.append(queue.element()+"\n");
                        break;
                    }


                }
                case "back":{
                    if (queue.isEmpty()) {
                        sb.append(-1+"\n");
                        break;
                    }else{
                        sb.append(lastElement+"\n");
                        break;
                    }
                }

            }
        }
        System.out.print(sb);
    }
}
