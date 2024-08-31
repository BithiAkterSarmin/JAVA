class Program6 {
    public void work(){
        System.out.println("Employee working");
    }
}


class Employee extends Program6 {
    String name;
    int id;

    public void setEmployee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void printValue(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: " + id);
    }

    public void work(){
        super.work();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmployee("e1", 11);
        e1.printValue();
        e1.work();
    }
    
}
