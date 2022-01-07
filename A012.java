class Solution {
    public int countPrimes(int n) {
        
        int count = 0; // 소수의 수
        boolean[] isPrime = new boolean[n]; // 각 수의 소수여부
        
        // 모든 수에 대해서 true로 초기화
        for(int i=2 ; i<n ; i++)
            isPrime[i] = true;
        
        // 배수를 지워나가면서 소수를 선별
        for(int i=2 ; i<n ; i++) {
            if(!isPrime[i]) continue;
            for(int j=i*2 ; j<n ; j+=i)
                isPrime[j] = false;
        }
        
        for(int i=2 ; i<n ; i++)
            if(isPrime[i])
                count++;
        
        return count;
    }
}