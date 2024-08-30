import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number For Table: \n");
        int tableNumber = input.nextInt();
        multiplicationTable(tableNumber);
    }

    public static void multiplicationTable(int num){
        int i = 1;
        while (i<= 1000){
            System.out.println(num + "X" + i + "=" + (num*i));
            i++;
        }
    }
}
