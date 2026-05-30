import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int n = sc.nextInt();
        
        // 수열을 저장할 ArrayList를 선언
        ArrayList<Integer> seq = new ArrayList<>();
        
        // 첫 번째 항과 두 번째 항을 초기화
        seq.add(1);
        seq.add(n);
        
        while (true) {
            // 전항과 전전항을 더하여 새로운 값을 계산
            int nextVal = seq.get(seq.size() - 1) + seq.get(seq.size() - 2);
            seq.add(nextVal);
            
            // 생성된 값이 100을 넘기면 반복문을 탈출
            if (nextVal > 100) {
                break;
            }
        }
        
        // 지금까지 생성된 값들을 공백으로 구분하여 출력
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        
        sc.close();
    }
}