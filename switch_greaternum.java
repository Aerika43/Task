package Task;
import java.util.Scanner;
public class switch_greaternum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        System.out.println("Enter a Number: ");
        int b = sc.nextInt();
        
        switch(Integer.compare(a,b))
        {
            case 0:
                System.out.println("Both are Equal");
                break;
            case 1:
                System.out.println(a+" Is Greater");
                break;
            case -1:
                System.out.println(b+" Is Greater");
                break;    
             
            default:
                System.out.println("Invaild Input");
                break;    
        }
        
        System.out.println("Enter a Number to find the square root: ");
        int c = sc.nextInt();
        System.out.print("Square root is:");
        System.out.println(Math.sqrt(c));
        
    }
}
