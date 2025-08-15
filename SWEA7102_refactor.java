package swea;

// 코드

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA7102_refactor {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("swea/sample_input.txt"); // 파일 객체
        Scanner sc = new Scanner(file);

        int tc = sc.nextInt(); // 2개
        for(int testcase = 0; testcase < tc; testcase++) {
            int N = sc.nextInt(); // 6
            int M = sc.nextInt(); // 6

            int lo = Math.min(N, M) + 1;
            int hi = Math.max(N, M) + 1;

            StringBuilder sb = new StringBuilder();
            for (int s = lo; s <= hi; s++) {
                    sb.append(s).append(' ');
            }

            System.out.println("#" + (testcase + 1) + " " + sb.toString().trim());
        }
    }
}
