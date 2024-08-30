import java.util.Scanner;

public class odds {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number For Table: \n");
        int rangeNumber = input.nextInt();
        int sum = oddSum(rangeNumber);
        System.out.println(sum);
    }

    public static int oddSum(int num){
        int sum = 0;
        int i = 1;
        while (i <= num){
            sum += i;
            i += 2;
        }
        return sum;
    }
}
