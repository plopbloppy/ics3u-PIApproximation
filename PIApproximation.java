import java.util.Scanner;

public class PIApproximation {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        
        while (true) {
            System.out.println("Please enter the n value:");
            int n = keyboard.nextInt();
            double sum = 0.0;
            
            for (int i = 0; i <= n; i++) {
                sum += Math.pow(-1, i) / (2 * i + 1);  
            }

            System.out.println("The value of pi is: " + 4 * sum + ".");
            System.out.println("Would you like to try again? [y/n]");
            
            if  (Character.toLowerCase(keyboard.next().charAt(0)) == 'n') {
                keyboard.close();
                break;
            }
        }
    }
}