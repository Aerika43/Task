package Task;

import java.util.Scanner;
//class page_1
//{
//    public int a;
//    void register_login()
//    {
//    Scanner sc1 = new Scanner(System.in);
//    String name;
//    int AccNo;
//    int mob;
//    int pass;
//     
//    System.out.println("Do you want to 1.Register or 2.Login?");
//    int rl = sc1.nextInt();
//    switch(rl)
//    {
//        case 1:
//            System.out.println("Enter Name: ");
//             name = sc1.next();
//            System.out.println("Enter Account Number: ");
//             AccNo = sc1.nextInt();
//            System.out.println("Enter Moblie Number: ");
//             mob = sc1.nextInt();
//            System.out.println("Registration Successful...");
//            break;
//        case 2:
//            System.out.println("Account Number : ");
//            AccNo = sc1.nextInt();
//            System.out.println("Password : ");
//            pass = sc1.nextInt();
//            System.out.println("Login Successful...");
//    }
//    }
//}
class Sign_in //extends page_1
{
  public int AccNo;
         int Password;
    void getdata()
        {
            Scanner sc2 = new Scanner(System.in);
            
            System.out.println("Account Number: ");
            AccNo = sc2.nextInt();
            
            System.out.println("Password: ");
            Password = sc2.nextInt();
            
            System.out.println("Account Verified!");
        }
}

class Display extends Sign_in
{
    public void bankshow()
    {
        System.out.println("Account Number: "+AccNo);
        System.out.println("Account Password: "+Password);
        System.out.println("Accountant Name: Aerika Talaviya");
        System.out.println("Total Bank Balance: 850000");
         
    }
}
class Money extends Display
{
    public int withdraw;
           int deposit;
    void money()
    {
        Scanner sc2 = new Scanner(System.in);
        for(int money=0;money<=6;money++)
        {
        System.out.println("What do you need?");
        System.out.println("1.Withdraw Money");
        System.out.println("2.Deposit Money");
        System.out.println("3.Balance Enquiry");
        System.out.println("4.Print Passbook");
        System.out.println("5.Change Any Information");
        System.out.println("6.Exit");
        money = sc2.nextInt();
            switch(money)
            {
            case 1:
                System.out.println("Enter Amount you want to Withdraw: ");  
                int w = sc2.nextInt();
                System.out.println("You have recieved "+w+" ruppees");
                System.out.println("Transcation Successful");
                System.out.println("Total Bank Balanced Left: "+(850000-w));
                break;
                
            case 2:
                System.out.println("Enter Amount you want to Deposit: ");
                int d = sc2.nextInt();
                System.out.println("You have Deposited "+d+" ruppees");
                System.out.println("Transcation Successful");
                System.out.println("Total Bank Balanced Left: "+(850000-d));
                break;
                
            case 3:
                System.out.println("Account Number: "+AccNo);
                System.out.println("Password: "+Password);
                System.out.println("Accountant Name: Aerika Talaviya");        
                System.out.println("Total Bank Balance is: 850000");
                break;
            
            case 4:
                System.out.println("Please Enter Your PassBook");
                System.out.println("");
                System.out.println("Your PassBook is Printing..."); 
                System.out.println("Please Wait");
                System.out.println("");
                System.out.println("Printing is Done");
                System.out.println("Remove Your PassBook");
                break;
                
            case 5:
                System.out.println("Enter Account Number: ");
                int ac = sc2.nextInt();
                System.out.println("Password: ");
                int p = sc2.nextInt();
                
                System.out.println("What Information you Need to Change:");
                System.out.println("1.Account Number");
                System.out.println("2.Password");
                System.out.println("3.Name");
                int c = sc2.nextInt();
                    switch(c)
                    {
                        case 1:
                        System.out.println("Enter New Account Number: ");
                        int a = sc2.nextInt();
                        System.out.println("Your Account Number Has Been Changed To "+a);
                        break;
                        
                        case 2: 
                        System.out.println("Enter New Password Number: ");
                        int n = sc2.nextInt();
                        System.out.println("Your Password Has Been Changed To "+n);
                        break;
                        
                        case 3: 
                        System.out.println("Enter New Name: ");
                        int m = sc2.nextInt();
                        System.out.println("Your Name Has Been Changed To "+m);
                        break;
                    }
                    break;
            case 6:
                System.out.println("Exiting");
                break;    
            } 
    }
    }
}
public class bank_switch {
    public static void main(String[] args) {
        System.out.println("Welcome to Aerika's Bank!!!");
        Scanner sc = new Scanner(System.in);
        Money m = new Money();

       //m.register_login();
        m.getdata();        
        m.bankshow();
        m.money();   
}
}


