package Task;

import java.util.Scanner;
class resg{
    String a;
    int b;
    public void resg(String x ,int y)
    {
        a = x;
        b = y;
    }
    public void login(String m,String n,int p)
    {
        if(a.equals(n))
        {
            System.out.println("Email Id is True");
        }
        else
        {
            System.out.println("Invaild Email");
        }
        if(b == p)
        {
            System.out.println("Password is True");
        }
        else
        {
            System.out.println("Invaild Password");
        }
    }
}
public class Registration {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    resg s = new resg();
    String x;
    int y;
     System.out.println("Enter Email Id: ");
     x = sc.nextLine();
     System.out.println("Password");
     y = sc.nextInt();
     s.resg(x, y);
        System.out.println("Login");
      String c;
      String a;
      int b;
        System.out.println("Enter Name: ");
        c = sc.next();
        System.out.println("Enter Email ID: ");
        a = sc.next();
        System.out.println("Enter Password: ");
        b = sc.nextInt();
        s.login(c, a, b);
    }
}
