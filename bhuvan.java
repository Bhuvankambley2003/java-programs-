class Employee{
    int id;
    String name;
    float salary;
    public Employee(int i, String raju, int i1) {
        id=i;
        name=raju;
        salary=i1;
    }
    public void insert(int i, String n, float s) {
    }
    void display(){System.out.println(id+" "+name+" "+salary);}
}
public class bhuvan {
    public static void main(String[] args) {
        Employee e1=new Employee(101,"raju",1000);
        Employee e2=new Employee(102,"irfan",25000);
        Employee e3=new Employee(103,"nakul",55000);
        e1.display();
        e2.display();
        e3.display();
    }
}