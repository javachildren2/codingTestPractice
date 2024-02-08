package lv10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lv10_4 {
    //1012 유기농 배추
    static int MAX = 50 + 10;
    static int[] dirR = {1, -1, 0, 0};
    static int[] dirC = {0, 0, 1, -1};
    static boolean[][] graph;
    static boolean[][] visited;

    public static void dfs(int y, int x) {
        visited[y][x] = true;
        for (int dirIdx = 0; dirIdx < 4; dirIdx++) {
            int newY = y + dirR[dirIdx];
            int newX = x + dirC[dirIdx];
            if (graph[newY][newX] && !visited[newY][newX]) {
                dfs(newY, newX);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            graph = new boolean[MAX][MAX];
            visited = new boolean[MAX][MAX];

            // 그래프 정보 입력
            for (int k = 0; k < K; k++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[y + 1][x + 1] = true;
            }

            // 방문하지 않은 지점부터 dfs 돌기
            int answer = 0;
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    if (graph[i][j] && !visited[i][j]) {
                        dfs(i, j);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
