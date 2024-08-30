import java.util.Scanner;

class SwapProgram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Swapping Start now you can Swap two number\n\n");
        System.out.println("Please Enter first Number: ");
        int a = input.nextInt();
        System.out.println("Please Enter second Number: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Number a is: " + a);
        System.out.println("Number b is: " + b);
    }
}
