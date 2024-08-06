package Task;

import java.util.*;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("GAME");
        System.out.println("ROCK PAPER SCISSOR");
         System.out.println("How many rounds of Rock-Paper-Scissors would you like to play?");
        int rounds = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < rounds; i++) {

        
        String[] array ={"Rock","Paper","Scissor"};
//                         0       1        2
        
        String user;
        int user_index;
        System.out.println("Make a move! (Rock/Paper/Scissors)");
        String user_move = sc.nextLine();
                
        Random r = new Random();
        
    
        int random_index = r.nextInt(array.length);
        String computer_move = array[random_index];
        
        System.out.println("Computers move:"+computer_move);

        
        if (user_move.equals(computer_move))
        {
            System.out.println("It's a draw!");
        }
        else if(user_move.equals("Rock") && computer_move.equals("Paper"))
        {
            System.out.println("Computers Win");
        }
        else if(user_move.equals("Rock") && computer_move.equals("Scissor"))
        {
            System.out.println("You Win");
        }
        else if(user_move.equals("Paper") && computer_move.equals("Rock"))
        {
            System.out.println("You Win");
        }
        else if(user_move.equals("Paper") && computer_move.equals("Scissor"))
        {
            System.out.println("Computers Win");
        }  
        else if(user_move.equals("Scissor") && computer_move.equals("Rock"))
        {
            System.out.println("Computers Win");
        } 
        else if(user_move.equals("Scissor") && computer_move.equals("Paper"))
        {
            System.out.println("You Win");
        } 
        }
    }
}

