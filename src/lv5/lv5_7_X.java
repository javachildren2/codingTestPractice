package lv5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lv5_7_X {
    //현재상태 => 검정 체스판 혹은 흰색 체스판으로 만들어서 최소갯수로 변경되는게 정답
    //2x2로 가정했을 때 현재상태가 {b w b w}이라면
    //검정 체스판은 {b w b w} 최소갯수 0 ,흰색 체스판은 {w b w b} 최소갯수 4
    //검정 체스판 최소갯수 + 흰색 체스판 최소갯수는 2x2의 체스판 갯수
    private static int solved(int start_row, int start_col, String[] board) {
        String orgBoard[] = {"WBWBWBWB", "BWBWBWBW"};
        int whiteSol = 0;

        for(int i=0; i<8; i++) {
            int row = start_row + i;
            for(int j=0; j<8; j++) {
                int col = start_col + j;
                if(board[row].charAt(col) != orgBoard[row % 2].charAt(j)) {
                    //orgBoard[row % 2]이렇게 작성한 이유는  String orgBoard[] = {"WBWBWBWB", "BWBWBWBW"}만 적어서
                    //0일때 WBWB.. 1일때 BWBW..
                    whiteSol++;
                }
            }
        }

        return Math.min(whiteSol, 64 - whiteSol);
    } // End of solved


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        String board[] = new String[row];

        for(int i=0; i<row; i++) {
            board[i] = br.readLine();
        }

        int sol = Integer.MAX_VALUE;

        for(int i=0; i<=row - 8; i++) {
            for(int j=0; j<=col - 8; j++) {
                int curSol = solved(i, j, board);
                System.out.println("curSol = " + curSol);

                if(sol > curSol) {
                    sol = curSol;
                }
            }
        }

        System.out.println(sol);
    }
}
