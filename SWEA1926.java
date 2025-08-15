//package swea;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class SWEA1926 {
//    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("swea/input.txt"); // 파일 객체
//        Scanner sc = new Scanner(file);
//
//        int N = sc.nextInt(); // 100
//
//        for(int i = 1; i <= N; i++){
//            if(i >=1 && i <= 9){
//                if( i % 3 == 0){
//                    System.out.println("-");
//                }else{
//                    System.out.println(i);
//                }
//            } else if (i >= 10 && i <= 99) {
//                if( i % 3 == 0){
//                    System.out.println("--");
//                }else{
//                    System.out.println(i);
//                }
//            }else{
//                if( i % 3 == 0){
//                    System.out.println("---");
//                }else{
//                    System.out.println(i);
//                }
//            }
//        }
//    }
//}

package swea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class SWEA1926 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("swea/input.txt"); // 파일 객체
        Scanner sc = new Scanner(file);

        int N = sc.nextInt(); // 100

        for (int i = 1; i <= N; i++) {
            String s_num = Integer.toString(i); // 문자열로 변환해서 바꾸기
            int answer = 0;
            for(int j  = 0; j < s_num.length(); j++) {
                if(s_num.charAt(j) == '3' || s_num.charAt(j) == '6'|| s_num.charAt(j) == '9'){
                    answer += 1;
                }
            } // 3, 6 , 9가 포함되어있는지 확인 숫자 증가 시키기

            if(answer > 0){
                System.out.println("-".repeat(answer));
            }else{
                System.out.println(i);
            }
        }
    }
}