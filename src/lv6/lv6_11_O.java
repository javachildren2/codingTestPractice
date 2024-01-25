package lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class lv6_11 {
    //1764 듣보잡
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=  new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> people = new HashSet<>();
        int cnt =0;
        for(int i =0;i<N;i++){
            people.add(br.readLine());
        }
        StringBuilder sb = new StringBuilder();
        Set<String> sPeople = new TreeSet<>();
        for(int i=0;i<M;i++){
            String s = br.readLine();
            if(people.contains(s)){
                cnt++;
                sPeople.add(s);
            }
        }for(String people1:sPeople){
            sb.append(people1+"\n");
        }

        System.out.println(cnt);
        System.out.print(sb);
    }
}
