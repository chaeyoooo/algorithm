package swea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SWEA6485 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("swea/s_input.txt"); // 파일 객체
        Scanner sc = new Scanner(file);

        int tc = sc.nextInt(); // 1
        for(int testcase = 1; testcase <= tc; testcase++){
            int n_tc = sc.nextInt(); //2
            for(int n_testcase = 0; n_testcase < n_tc; n_testcase++){
                int a = sc.nextInt();
                int b = sc.nextInt();

            }
            int P = sc.nextInt();
            // 배열 만들기
            int[] new_p = new int[5000];
            // 정답 배열
            int[] answer = new int[5000];
            for(int i = 0; i < P; i++) {
                new_p[i] = sc.nextInt(); // C
            }
//            for(int result = a; result <= b; result++){
//                answer[new_p[i]]++;
//            }
            System.out.println(Arrays.toString(answer));
        }
    }
}
