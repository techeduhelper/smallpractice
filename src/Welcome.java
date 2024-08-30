import java.util.Scanner;

public class Welcome {
    public static void main( String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter A Name: ");
        String name  = input.next();
        System.out.println("Welcome to " + name);
    }
}
