package swea;

// 코드

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SWEA7102 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("swea/sample_input.txt"); // 파일 객체
        Scanner sc = new Scanner(file);

        int tc = sc.nextInt(); // 2개
        for(int testcase = 0; testcase < tc; testcase++) {
            int N = sc.nextInt(); // 6
            int M = sc.nextInt(); // 6

            int sum_NM = N+M;
            // 1. 합까지 돌면서 배열 생성 하기
            int arr[] = new int[sum_NM + 1]; // 합까지 배열 생성하기
            for(int k = 1; k <=  sum_NM; k++) {
                arr[k] = k;  // arr[1] = 1, arr[12] = 12 이렇게 배열 받기 !
            }

            // 2. N과 M의 합을 계산하기
            // 3. 새로운 배열 생성
            int count[] = new int[sum_NM + 1];
            for(int k = 1; k <= sum_NM; k++) {
                for(int i = 1; i <= N; i++) {
                    for(int j = 1; j <= M; j++) {
                        if((i+j) == arr[k]) {
                            count[k]++;
                        }
                    }
                }
            }
//            System.out.println(Arrays.toString(count));
//            // [0, 0, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1]
//            // [0, 0, 1, 2, 3, 4, 4, 4, 3, 2, 1]

            // 이제 여기서 가장 큰 수 구해서 index값 구하기 !

            int max = 0;
            for(int i = 0; i < count.length; i++) {
                if(count[i] > max) {
                    max = count[i];
                }
            }

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < count.length; i++){
                if(count[i] == max){
                    sb.append(i).append(' ');
                }
            }
            System.out.println("#" + ( testcase + 1) + " " + sb.toString().trim());
        }
    }
}
