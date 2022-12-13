import java.util.Scanner;

class staff {
    private String staffid;
    private String name;
    private int phone;
    private float  salary;

    public  void accept(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("ENTER STAFF ID");
        staffid=scanner.next();
        System.out.println("ENTER NAME");
        name=scanner.next();
        System.out.println("ENTER PHONE NUMBER");
        phone=scanner.nextInt();
        System.out.println("ENTER SALARY");
        salary=scanner.nextFloat();
    }
    public void display(){
        System.out.println("STAFF_ID:"+staffid);
        System.out.println("NAME:"+name);
        System.out.println("PHONE_NUMBER" +phone);
        System.out.println("SALARY:"+salary);
    }


}
class teaching  extends staff{
    private String domain;
    private String[] publications;
    public void accept(){
        super.accept();
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER DOMAIN");
        domain=sc.next();
        System.out.println("ENTER NUMBER OF PUBLICATIONS");
        int n=sc.nextInt();
        publications=new String[n];
        System.out.println("ENTER THE PUBLICATIONS");
        for(int i=0;i<n;i++){
            publications[i]=sc.next();
        }
    }
    public void display(){
        super.display();
        System.out.println("DOMAIN:"+domain);
        System.out.println("PUBLICATIONS:");
        for(int i=0;i<publications.length;i++){
            System.out.println(publications[i]);
        }
    }
}

class technical extends staff
{
    private  String[] skills;
    public void accept()
    {
        super.accept();
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER NUMBER OF SKILLS");
        int n =sc.nextInt();
        skills=new String[n];
        System.out.println("ENTER SKILLS:");
        for(int i=0;i<n;i++){
            skills[i]=sc.next();

        }
    }
    public void display() {
        super.display();
        System.out.println("SKILLS:");
        for (int i = 0; i < skills.length; i++) {
            System.out.println(skills[i]);

        }
    }
}

class contract extends staff{
    private int period;
    public void accept() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER PERIOD:");
        period = sc.nextInt();

    }
    public void display(){
        super.display();
        System.out.println("PERIOD:"+period);

    }
}

class Main
{
    public static void main(String [] args){
        teaching teaching =new teaching();
        technical technical=new technical();
        contract contract=new contract();
        System.out.println("ENTER DETAILS OF TEACHING STAFF");
        teaching.accept();
        System.out.println("ENTER DETAILS OF TECHNICAL STAFF");
        technical.accept();
        System.out.println("ENTER DETAILS OF CONTRACT STAFF");
        contract.accept();
        System.out.println("DETAILS OF TEACHING STAFF ARE:");
        teaching.display();
        System.out.println("DETAILS OF TECHNICAL STAFF ARE:");
        technical.display();
        System.out.println("DETAILS OF CONTRACT STAFF ARE:");
        contract.display();

    }
}

































