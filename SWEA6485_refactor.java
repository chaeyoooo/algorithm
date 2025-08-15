package swea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SWEA6485_refactor {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("swea/s_input.txt"); // 파일 객체
        Scanner sc = new Scanner(file);

        int tc = sc.nextInt(); // 1
        for(int testcase = 1; testcase <= tc; testcase++){
            int n_tc = sc.nextInt(); //2
            int[] new_p = new int[5001];
            for(int n_testcase = 0; n_testcase < n_tc; n_testcase++){
                int a = sc.nextInt();
                int b = sc.nextInt();

                for(int result = a; result <= b; result++) {
                    new_p[result]++;
                }
            }
            int P = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(testcase).append(' ');
            int[] answer = new int[5000];
            for(int i = 0; i < P; i++) {
                int c = sc.nextInt();
                sb.append(new_p[c]).append(' ');
            }
            System.out.println(sb.toString().trim());
        }
    }
}
