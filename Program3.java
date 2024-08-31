import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

      
        int year;
      
        System.out.println("Enter a Year: ");
      
        Scanner sc = new Scanner(System.in);
      
        year = sc.nextInt();

      
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not Leap Year");
        }
         
    }
}
