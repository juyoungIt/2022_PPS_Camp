import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int memberSize = key.nextInt();          // 등록된 회원의 수
        int[] ages = new int[memberSize];        // 등록된 회원의 나이
        String[] names = new String[memberSize]; // 등록된 회원의 이름
        int[] agesCopy = new int[memberSize];    // 연산에 활용하기 위한 ages 의 복사본
        int[] idx = new int[memberSize]; // 정렬 순서에 대한 기존 배열에서의 index 값을 저장

        for(int i=0 ; i<memberSize ; i++) {
            ages[i] = key.nextInt();
            agesCopy[i] = ages[i];
            names[i] = key.nextLine();
        }

        for(int i=0 ; i<memberSize ; i++) {
            idx[i] = findMinIdx(agesCopy);
            agesCopy[idx[i]] = 201; // 다음번 탐색에서 제외시키기 위함 (정의된 범위 밖의 수)
        }

        for(int i=0 ; i<memberSize ; i++) {
            System.out.print(ages[idx[i]]);
            System.out.println(names[idx[i]]);
        }

    }

    // 주어진 배열에서 가장 작은 값의 인덱스를 찾아 반환
    public static int findMinIdx(int[] ages) {
        int min = ages[0];
        int minIdx = 0;

        for(int i=1 ; i<ages.length ; i++) {
            if(min > ages[i]) {
                min = ages[i];
                minIdx = i;
            }
        }

        return minIdx;
    }
}