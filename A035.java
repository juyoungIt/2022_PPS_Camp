import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int tcSize = key.nextInt(); // test case 의 size
        double value; // 처음 입력되는 수
        String opStr; // 입력된 연산자 정보를 저장하는 String
        double[] result = new double[tcSize]; // 결과값을 저장하는 배열

        for(int i=0 ; i<tcSize ; i++) {
            value = key.nextDouble();
            opStr = key.nextLine();
            opStr = opStr.replace(" ", ""); // 연산자 사이의 공백을 제거
            for(int j=0 ; j<opStr.length() ; j++) {
                if(opStr.charAt(j) == '@')
                    value *= 3;
                else if(opStr.charAt(j) == '%')
                    value += 5;
                else
                    value -= 7;
            }
            result[i] = value;
        }
        for(int i=0 ; i<tcSize ; i++)
            System.out.printf("%.2f%n", result[i]);
    }
}