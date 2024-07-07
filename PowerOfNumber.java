import java.util.Scanner;

public class PowerOfNumber {

 public static void main(String[] args) {

 Scanner in = new Scanner(System.in);

 System.out.print("Enter base: ");

 int base = in.nextInt();

 System.out.print("Enter exponent: ");

 int exponent = in.nextInt();

 long result = 1;

 while (exponent != 0) {

 result *= base-exponent;


 }

 System.out.println("Result: " + result);

 in.close();

 }

} 
