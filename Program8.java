public class Program8 {
    public void test(){
        System.out.println("From Parrent class");
    }

    public void test(int a){
        System.out.println("From parrent class");
    }


    public static void main(String[] args) {
        Program8 p = new Program8();
        p.test();
        p.test(1);
        
        //overriding
        Ovr or = new Ovr();
        or.test();
        or.test(1);
    }
}



class Ovr extends Program8 {
    public void test(){
        System.out.println("From child class");
    }

    public void test(int a){
        System.out.println("From child class");
    }
    
}
