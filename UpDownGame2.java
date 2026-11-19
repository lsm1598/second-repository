
import java.util.Random;
import java.util.Scanner;

// 테스트 주석 
// 테스트 주석 
// 테스트 주석 
// 테스트 주석 
// 테스트 주석 
// 테스트 주석 
// 테스트 주석 
// 테스트 주석 

public class UpDownGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int answer = random.nextInt(100) + 1;
        int count = 0;

        while (true) {
            System.out.print("숫자 입력 1~100: ");
            int num = sc.nextInt();

            if (num <= 0) {
                System.out.println("양수만 입력해주세요.");
                continue;
            }

            count++;
            System.out.println("현재 시도 횟수: " + count);

            if (num < answer) {
                System.out.println("Up");
            } else if (num > answer) {
                System.out.println("Down");
            } else {
                System.out.println("정답- 총 시도 횟수: " + count);
                break;
            }
        }

        sc.close();
    }
}
