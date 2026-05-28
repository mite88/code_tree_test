import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int n = scanner.nextInt();

        int[] inputData = new int[n];
        for (int i = 0; i < n; i++) {
            inputData[i] = scanner.nextInt();
        }

        List<Integer> evenNumbers = new ArrayList<>();

        for (int num : inputData) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

  

        for (int i = 0; i < evenNumbers.size(); i++) {
            System.out.print(evenNumbers.get(i));
     
            if (i < evenNumbers.size() - 1) {
                System.out.print(" ");
            }
        }
       
        
        scanner.close();
    }
}