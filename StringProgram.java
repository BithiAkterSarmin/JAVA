import java.util.Scanner;

public class StringProgram {
    public static void main(String[] args) {

        String word1;
        String word2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word1: ");
        word1 = sc.nextLine();
        System.out.println("Enter word2:");
        word2 = sc.nextLine();


        System.out.println("Upper Case word1: " + word1.toUpperCase());

        System.out.println("Lower case word1: " + word1.toLowerCase());

        boolean r = word1.equals(word2);
        if(r){
            System.out.println("Equal");
        }else{
            System.out.println("not Equal");
        }
        

        String newWord = word1.concat(word2);
      
        System.out.println("The length of new word: " + newWord.length());


        
    }
}
