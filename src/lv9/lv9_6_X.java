package lv9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class lv9_6 {
    //1037 약수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> divisor = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            divisor.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(divisor);

        for (int j = 3; ;j++ ) {
            ArrayList<Integer> search = new ArrayList<>();
            for (int k = 2; k <j; k++) {
                if (j % k == 0) {
                    search.add(k);
                }
            }

            if (compareArrayLists(divisor, search)) {
                System.out.println(j);
                break;

            }

        }
    }
    public static boolean compareArrayLists(ArrayList<?> list1, ArrayList<?> list2) {
        // 두 ArrayList의 크기가 같은지 확인
        if (list1.size() != list2.size()) {
            return false;
        }

        // 각 인덱스에 있는 요소를 하나씩 비교
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }

        // 모든 요소가 같다면 true 반환
        return true;
    }
}

