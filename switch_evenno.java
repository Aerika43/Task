package Task;

import java.util.Scanner;

public class switch_evenno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
         switch(a%2)             
         {   
            case 0:
                System.out.println("Even Number");
                break;               
            case 1:
                System.out.println("Odd Number");
                break;
            default:
                System.out.println("Invalid input");
            break;            
    }
}
}
