package Task;

import java.util.Scanner;

public class String_UpperCase_LowerCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Any String : ");
        String name = sc.nextLine();
        
        for(int i=0;i<name.length();i++)
        {
            if(Character.isUpperCase((name.charAt(i))))
            {
                System.out.print(Character.toLowerCase(name.charAt(i)));
            }
            else
            {
                System.out.print(Character.toUpperCase(name.charAt(i)));
            }
        }
        System.out.println("");
         
    }
}
