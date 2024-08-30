import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter num you want to fact: \n\n");
        int a = input.nextInt();
        long fact = factorialNumber(a);
        System.out.println(fact);
    }

    public static long factorialNumber(int num){
        if(num < 2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num){
            fact *= i;
            i++;
        }
        return fact;
    }
}
