package Task;
//create
//update
//delete
import java.util.*;

public class array_list_task {
    public static void main(String[] args) {
        ArrayList<String> list = new <String>ArrayList();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Aerika's Cake Shop");
        
        list.add("Cake");
        list.add("Pastry");
        list.add("Chocolate");
        list.add("Bread");
        list.add("Veg.Puff");
        System.out.println(list);
        
        int size = list.size();
        System.out.println("We have total "+size+" Items");
        
        for(int a=0;a<=4;a++)
        {
        System.out.println("What do you want to do?");
        System.out.println("1.Add items");
        System.out.println("2.Update items");
        System.out.println("3.Delete items");
        System.out.println("4.Exit");
        System.out.println("Enter the Number...");
         a = sc.nextInt();
        
        switch(a)
        {
            case 1:
                
                System.out.println("ADD THE ITEMS");
                String add1 = sc.next();
                
                list.add(add1);
                System.out.println(list);
                break;
            
            case 2:
                System.out.println("UPDATE THE ITEMS");
                System.out.println("Enter the number you want to update...");
                System.out.println("The Indexing is starting from zero");
                int j = sc.nextInt();
                String update = sc.next();
                
                list.set(j,update);
                System.out.println(list);
                break;
                
             case 3:
                System.out.println("DELETE THE ITEMS");
                int delete = sc.nextInt();
                list.remove(delete);
                System.out.println(list);
                break;
             case 4:
                System.out.println("Exiting");
                System.out.println("Thankyou!!");
                System.out.println("Have a Nice Day!!");
                break; 
                
        }
    }
    }
}

