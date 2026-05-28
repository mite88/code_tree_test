import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        

        int[] multiples = new int[100];
        int count = 0;      
        int fiveCount = 0;  
        

        int current = n;
        while (fiveCount < 2) {
            multiples[count] = current; 
            System.out.print(multiples[count] + " ");
            
  
            if (multiples[count] % 5 == 0) {
                fiveCount++;
            }
            
            current += n; 
            count++;
        }
        
        scanner.close();
    }
}