import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number: ");
        int number = sc.nextInt();


        int i,j;

        for(i=number;i>=1;i--){
            for(j=number;j>=1;j--){
                if(j>i){
                    System.out.print(j + " ");
                }else{
                    System.out.print(i + " ");
                }
            }

            for(j=2;j<=number;j++){
                if(i>j){
                    System.out.print(i + " ");
                }else{
                    System.out.print(j + " ");
                }
            }
            System.out.println();

        }

        
        
        for(i=2;i<=number;i++){
            for(j=number;j>=1;j--){
                if(j>i){
                    System.out.print(j + " ");
                }else{
                    System.out.print(i + " ");
                }
            }

                for(j=2;j<=number;j++){
                    if(i<j){
                        System.out.print(j + " ");
                    }else{
                        System.out.print(i + " ");
                    }
            }
            System.out.println();
    }
    
}

}
