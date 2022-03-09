import java.util.Scanner;
public class AddTwoNumbers2 {

    public static void main(String[] args) {
        
        int num1, num2, sum; /// imagining i m telling user that user will have to give their input only as integer -number 1,2,3,4,,1.4.18k.0.90
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers:"+sum);
    }
}
