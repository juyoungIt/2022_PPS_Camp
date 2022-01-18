import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0; // 사라진 인형의 수
        int size = board.length; // 인형이 담긴 상자의 크기
        int tmp;
        ArrayList<Integer> success = new ArrayList<>(); // 뽑기에 성공한 인형을 담음
        int sucSize; // 상자에 담긴 인형의 수
        
        for(int i=0 ; i<moves.length ; i++) {
            tmp = findTop(board, moves[i]);
            if(tmp == -1) // 해당 위치에 인형이 없는 경우
                continue;
            success.add(board[tmp][moves[i]-1]); // 뽑은 인형을 상자에 담음
            board[tmp][moves[i]-1] = 0; // 사라진 인형의 상태를 업데이트
            sucSize = success.size(); // 상자에 담긴 인형의 수를 업데이트
            if(sucSize > 1) {
                // 서로 같은 인형이 쌓인 경우
                if(success.get(sucSize-1) == success.get(sucSize-2)) {
                    success.remove(success.size()-1); // 인형 빼기 - 1
                    success.remove(success.size()-1); // 인형 빼기 - 2
                    answer+=2; // 사라진 인형의 수 증가
                }
            }
        }
        return answer;
    }
    
    // 특정 라인에서 인형이 가장 위에 있는 층을 찾기
    public int findTop(int[][] board, int x) {
        int size = board.length;
        int idx;
        
        for(idx=0 ; idx<size ; idx++) {
            if(board[idx][x-1] != 0)
                return idx; // 해당 인형이 위치한 인덱스를 반환
        }
        return -1; // 해당 라인에 인형이 없음
    }
}