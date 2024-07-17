package Task;
import java.util.Scanner;
class sign_in
{
    public int AccNo;
           int Password;
    void getdata()
        {
            Scanner sc1 = new Scanner(System.in);
            
            System.out.println("Account Number: ");
            AccNo = sc1.nextInt();
            
            System.out.println("Password: ");
            Password = sc1.nextInt();
            
            System.out.println("Account Verified!");
        }
}

class display extends sign_in
{
    public void bankshow()
    {
        System.out.println("Account Number: "+AccNo);
        System.out.println("Account Password: "+Password);
        System.out.println("Accountant Name: Aerika Talaviya");
        System.out.println("Total Bank Balance: 850000");
         
    }
}
class money extends display
{
    public int withdraw;
           int deposit;
    void money()
    {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Do you want to Withdraw Money or Deposit Money?");
        String money = sc2.next();
        if(money.equals("withdraw"))
        {
            System.out.println("How much Amount you need?");
            int w = sc2.nextInt();
            System.out.println("You have recieved "+w+" ruppees");
             
            System.out.println("Total Bank Balanced Left: "+(850000-w));
        }
        if(money.equals("deposit"))
        {
            System.out.println("How much Amount you need to deposit?");
            int d = sc2.nextInt();
            System.out.println("You have depoisted "+d+"ruppees");
            
            System.out.println("Total Bank Balanced Left: "+(850000-d));
        }  
    }
}
public class bank_if {
    public static void main(String[] args) {
        money m = new money();
        m.getdata();        
        m.bankshow();
        m.money();       
    }   
}
