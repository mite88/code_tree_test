import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 원소의 개수 N을 입력
        int n = sc.nextInt();
        
        // 원소의 크기 저장할 배열을 선언
        int[] countArr = new int[10];
        
     
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            countArr[num]++; // 입력받은 숫자를 인덱스로 삼아 해당 칸의 값을 1 증가
        }
        
        // 1부터 9까지 각 숫자가 몇 번 나왔는지 줄바꿈하여 출력
        for (int i = 1; i <= 9; i++) {
            System.out.println(countArr[i]);
        }
        
        sc.close();
    }
}