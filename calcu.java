import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("계산할 식을 입력해주세요");

            String[] input = sc.nextLine().split(" ");

            try {
                float num1 = Float.parseFloat(input[0]);
                String operator = input[1];
                float num2 = Float.parseFloat(input[2]);
                float result;

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("0으로 나눌 수 없습니다.");
                            continue;
                    	}
			result = num1 / num2;
                        break;

		    default:
    			System.out.println("잘못된 연산자입니다.");
    			continue;

                }

                System.out.println("결과: " + result);

            } catch (Exception e) {
                System.out.println("숫자를 올바르게 입력해주세요.");
                continue;
            }

            String choice;

            while (true) {
                System.out.println("계속 계산하려면 1, 종료하려면 0을 입력해주세요.");
                choice = sc.nextLine();

                if (choice.equals("0") || choice.equals("1")) {
                    break;
                }
            }

            if (choice.equals("0")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }

        sc.close();
    }
}

