package swea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA21936 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("swea/sample_in.txt"); // 파일 객체
        Scanner sc = new Scanner(file);

        int T = sc.nextInt(); // testcase 갯수
        for (int testcase = 1; testcase <= T; testcase++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            String s = sc.next();

            StringBuilder sb = new StringBuilder(s); // 파라미터로 문자열을 입력받는다 !
            String reverse_s = sb.reverse().toString(); // 뒤집는 배열

            String s_new = "";
            for(int i = 0; i <= N -M ; i++){ // 0 , 1 , 2
                String s1 = s.substring(i , i + M); // 0부터 3까지 , 1부터 4까지 , 2부터 5까
                String s2 = reverse_s.substring(N-M-i,N-i);

                if(s1.equals(s2)) {
                    s_new = s1;
                }
            }
            if(s_new.equals("")){
                s_new = "NONE";
            }
            System.out.println("#" + testcase + " " + s_new);
        }
    }
}

// ABCBD
// DBCBA