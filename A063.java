class Solution {
    public String addBinary(String a, String b) {
        String result = "";    // 결과값을 저장할 String
        int carry = 0;         // 연산시 발생하는 carry값을 저장
        int lenA = a.length(); // 문자열 a의 길이
        int lenB = b.length(); // 문자열 b의 길이
        int tmp;               // 계산과정에서 발생하는 중간값을 일시저장
        int diff;              // 두 문자열 길이의 차
        
        // 길이가 짧은 이진수의 나머지 부분에 계산의 편의성을 위해 0을 채워넣음
        if(lenA < lenB) {
            diff = lenB - lenA;
            for(int i=0 ; i<diff ; i++)
                a = "0" + a;
        }
        else if(lenB < lenA) {
            diff = lenA - lenB;
            for(int i=0 ; i<diff ; i++)
                b = "0" + b;
        }
        
        System.out.println("strA = " + a);
        System.out.println("strB = " + b);
            
        for(int i=1 ; i<=a.length() ; i++) {
            tmp = Character.getNumericValue(a.charAt(a.length()-i))
                + Character.getNumericValue(b.charAt(a.length()-i))
                + carry;
            if(tmp == 0) {
                result = "0" + result;
                carry = 0;
            }
            else if(tmp == 1) {
                result = "1" + result;
                carry = 0;
            }
            else if(tmp == 2) {
                result = "0" + result;
                carry = 1;
            }
            else { // tmp 값이 3을 가지는 경우
                result = "1" + result;
                carry = 1;
            }
        }
        
        if(carry == 1)
            result = "1" + result;
        
        return result;
    }
}