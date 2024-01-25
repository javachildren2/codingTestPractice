package lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class lv6_12 {
    //1269 대칭 차집합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<Integer> nSet = new TreeSet<>();
        Set<Integer> mSet = new TreeSet<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        for(int i =0;i<N;i++){
            nSet.add(Integer.parseInt(st2.nextToken()));
        }
        StringTokenizer st3 = new StringTokenizer(br.readLine()," ");
        for(int i =0;i<M;i++){
            mSet.add(Integer.parseInt(st3.nextToken()));
        }

        int aCnt=0;
        int bCnt=0;
        for(int n:nSet){
            if(mSet.contains(n)){
                aCnt++;
            }
        }
        for(int m:mSet){
            if(nSet.contains(m)){
                bCnt++;
            }
        }

        System.out.println(N-aCnt+M-bCnt);


    }
}
