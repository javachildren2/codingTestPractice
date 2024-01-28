import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lv8_5{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] queue = new int[N];
        for (int i = 0; i < N; i++) {
            queue[i] = Integer.parseInt(st.nextToken());
        }

        if (isPossibleToGetSnack(N, queue)) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }

    private static boolean isPossibleToGetSnack(int N, int[] queue) {
        int expectedNumber = 1; // 기대되는 번호표의 값
        for (int i = 0; i < N; i++) {
            if (queue[i] == expectedNumber) {
                expectedNumber++; // 기대되는 번호표 값 증가
            } else if (i > 0 && queue[i - 1] == expectedNumber) {
                // 이동 가능한 공간이 있을 때, 다음 번호표로 이동
                expectedNumber++;
                i--; // 현재 위치에서 다음 위치로 이동
            }
        }
        return expectedNumber == N + 1; // 모든 학생이 이동했는지 확인
    }
}