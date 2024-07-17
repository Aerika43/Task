
package Task;
import java.util.Scanner;
class Number
{
    public void value(int a[])
    {
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sortyed array");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
public class ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the Number: ");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
              
        }
        Number o =new Number();
        o.value(a);
    }
    
}
