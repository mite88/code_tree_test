import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int[] numbers = new int[100];
        int count = 0;
        
        // 0이 입력될 때까지 정수 입력받기
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers[count] = input;
            count++;
        }
        
 
        for (int i = 0; i < count; i++) {
            int num = numbers[i];
            int result;
            
          
            if (num % 2 != 0) {
                result = num + 3;
            } else {
                result = num / 2;
            }
            
          
            System.out.print(result + (i == count - 1 ? "" : " "));
        }
        
        scanner.close();
    }
}