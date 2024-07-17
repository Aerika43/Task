package Task;

import java.util.Scanner;
public class switch_pos_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a = sc.nextInt();
        switch(Integer.compare(a, 0))
        {
            case 1:
                System.out.println("Positive Number.");
                break;
            case -1:
                System.out.println("Negative Number.");
                break;
            default:
                System.out.println("Zero");
                break;
        }
    }
}
