import java.util.Scanner;

class multiplication {
    public static  void main(String[] args){
        System.out.println("Please Enter the First float No: ");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        System.out.println("Please Enter the second float No: ");
        float b = input.nextFloat();
        float c = a * b;
        System.out.println("The result will be: " + c);
    }
}
