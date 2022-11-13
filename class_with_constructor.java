class employee{
    int id;
    String name;
    float salary;
    public employee(int i, String raju, float i1) {
        id=i;
        name=raju;
        salary=i1;
    }

    void display(){System.out.println(id+" "+name+" "+salary);}
}
public class class_with_constructor {
    public static void main(String[] args) {
        employee e1=new employee(100,"b",10000);
        employee e2=new employee(101,"h",100);
        employee e3=new employee(102,"bhuvan",1000);
        e1.display();
        e2.display();
        e3.display();
    }
}

