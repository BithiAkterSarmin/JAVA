import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;

        if(n==0||n==1){
            System.out.println("Not a prime Number");
            c=1;
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println("Not a prime Number");
                    c=1;
                    break;
                }
            }
        }

        if(c==0){
            System.out.println("Prime Number");
        }
    }
}
