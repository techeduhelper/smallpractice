import java.util.Scanner;

public class leapyear {
    public  static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the year that you want to cheak leap year or not \n");
        int year = input.nextInt();
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ){
            System.out.println("Your year is leap year");
        } else {
            System.out.println("Your year is not leap year");
        }
    }
}
