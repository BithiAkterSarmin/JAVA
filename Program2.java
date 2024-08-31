import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int add,sub,div,mul,mod;
        add = x + y;
        sub = x - y;
        div = x / y;
        mul = x * y;
        mod = x % y;

        System.out.println("add: " + add);
        System.out.println("Sub: " + sub);
        System.out.println("div: " + div);
        System.out.println("mul: " + mul);
        System.out.println("mod: " + mod);

    }
}
