import java.util.Scanner;
public class student_details {
    String USN;
    String Name;
    String Branch;
    int Phone;

    void insertrecord(String reg, String name, String branch, int phone) {
        USN = reg;
        Name = name;
        Branch = branch;
        Phone = phone;
    }

    void displayrecord() {
        System.out.println("USN IS  =" + USN + "\n NAME IS =" + Name + "\n BRANCH IS =" + Branch + "PHONE NUMBER IS =" + Phone);


    }


    public static void main(String[] args) {

        student_details s[] = new student_details[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number  of students ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            s[i] = new student_details();

        }
        for (int j = 0; j < n; j++) {
            sc.nextLine();
            String usn = sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            int phone = sc.nextInt();

            s[j].insertrecord(usn, name, branch, phone);

        }

        for (int m = 0; m < n; m++) {

            int i = m + 1;
            System.out.println("details of students are");
            s[m].displayrecord();
        }


    }
}










