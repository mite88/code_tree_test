import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 10개의 항을 저장할 배열을 선언
        int[] arr = new int[10];
        
        // 첫 번째 항과 두 번째 항을 입력받아 배열에 저장
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        
        // 3번째 항부터 10번째 항까지 점화식을 적용하여 계산
        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i - 1] + 2 * arr[i - 2];
        }
        
        // 계산된 10개의 항을 공백으로 구분하여 출력
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}