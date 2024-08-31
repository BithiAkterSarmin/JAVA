public class Program7 {
    //Method Overloading
    public void test(){
        System.out.println("Test One");
    }

    public void test(int a){
        System.out.println("Test two");
    }

    public void test(int a, float b){
        System.out.println("Test three");
    }

    public static void main(String[] args) {
        Program7 p = new Program7();
        p.test();
        p.test(1);
        p.test(1,5.5f);
    }
}
