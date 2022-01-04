import java.util.Scanner;

class Solution {
    boolean solution(String s) {
        int pCount = 0, yCount = 0;
        
        for(char letter : s.toCharArray()) {
            if(letter == 80 || letter == 112)
                pCount++;
            else if(letter == 89 || letter == 121)
                yCount++;
        }
        
        if(pCount == yCount)
            return true;
        else
            return false;
    }
}