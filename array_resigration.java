package Task;

import java.util.Scanner;

class resg1{
    String a [] = new String[4];
    int b[] = new int[4];
    public void resg(String x[] ,int y[],int user)
    {
        for(int i =0;i<user;i++)
        {
            a[i] = x[i];
            b[i] = y[i];
        }
        for(int i =0;i<user;i++)
        {
            System.out.println("Email : "+a[i]);
            System.out.println("Password : "+b[i]);
        }
    }
   
    
    public void login(String n[],int p[],int user)
    {                 
      for(int i=user;i<=user;i++)
      {
        if(a[i].equals(n[i]) && p[i] == b[i])
        {
            System.out.println("Login SuccesFull");
            break;
        }
        else
        {
            System.out.println("Invaild Crendentials");
        }
      } 
    }
}
public class array_resigration {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        resg1 s = new resg1();

        String x[] = new String[4];
        int y[] = new int[4];
        String name;
        System.out.println("How many number of user you want to register");
        int user = sc.nextInt();
        for(int i=0;i<user;i++)
        {
           System.out.println("Enter Name : ");
           name = sc.next();
           System.out.println("Enter Email Id: ");
           x[i] = sc.next();
           System.out.println("Password");
           y[i] = sc.nextInt();
        }
        s.resg(x,y,user);

        System.out.println("Login");
        String a[] = new String [4];
        int b[] = new int [4];

        for(int i=0;i<user;i++)
        {
           System.out.println("Enter Email ID: ");
           a[i]= sc.next();
           System.out.println("Enter Password: ");
           b[i] = sc.nextInt();
           
           s.login(a, b,i);
        }
    }
}

