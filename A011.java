class Solution {
    public int[] solution(int N, int[] stages) {
        
        int[] fails = new int[N];  // stage별 clear하지 못한 수
        int[] arrive = new int[N]; // stage별 도달 수
        double[] failRates = new double[N]; // stage별 실패율
        int[] result = new int[N]; // 최종결과
        double maxFail; // 가장 높은 실패율의 값
        int maxStage=0;   // 가장 높은 실패율을 가진 stage의 index

        int allClear = N + 1; // all clear를 의미하는 값

        // 각 stage별 정지현황 및 도달현황 연산
        for(int i=0 ; i<stages.length ; i++) {
            // 모든 stage를 clear한 경우
            if(stages[i] == allClear) {
                // stage에 도달한 횟수를 업데이트 (모두)
                for(int j=0 ; j<N ; j++)
                    arrive[j]++;
            }
            // 모든 stage를 clear하지 않은 경우
            else {
                fails[stages[i]-1]++; // 현재 멈춰 있는 stage에 대한 값 업데이트
                // 이전에 clear한 stage들에 대해서 업데이트
                for(int j=0 ; j<stages[i] ; j++)
                    arrive[j]++;
            }
        }

        // 각 stage별 실패율 계산
        for(int i=0 ; i<N ; i++) {
            // 해당 stage에 도달한 플레이어가 존재하지 않는 경우
            if(arrive[i] == 0)
                failRates[i] = 0;
            else
                failRates[i] = (double)fails[i]/arrive[i];
        }

        // 실패율이 높은 stage 부터 내림차순으로 결과 생성
        maxFail = -1;
        for(int i=0 ; i<N ; i++) {
            for(int j=0 ; j<N ; j++) {
                if(failRates[j] > maxFail) {
                    maxFail = failRates[j];
                    maxStage = j;
                }
            }
            failRates[maxStage] = -1;
            result[i] = maxStage+1;
            maxFail = -1;
        }

        return result;
        
    }
}