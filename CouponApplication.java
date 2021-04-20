import java.util.Scanner;

public class CouponApplication {

   public static void main(String[] args) {
       boolean repeat = true;
       Scanner input = new Scanner(System.in);
       String choice;
       int totalCredits = 0, noOfDoughnuts;
       while(repeat)
       {
           //display menu
           System.out.println("Menu:");
           System.out.println("P(Purchase)");
           System.out.println("E(Exit Program)");
           //prompt and read the user choice
           System.out.print("Please Enter Your Choice: ");
           choice = input.nextLine();
           //check the first character of the user input
           //if the user entered anything starting with p
           if(choice.toLowerCase().charAt(0) == 'p')
           {
               //check if the credits are 12 or more
               if(totalCredits >= 12)
               {
                   //display that the user has qualified for free donut
                   System.out.println("*** CONGRATULATIONS ***");
                   System.out.println("You qualify for a free donut.");
                   //prompt and read if the user wishes to avail free donut
                   System.out.print("Would you like to use your credits? (Y or N) ");
                   choice = input.nextLine();
                   //if user entered y
                   if(choice.toLowerCase().charAt(0) == 'y')
                   {
                       //decrease the credits by 12
                       totalCredits = totalCredits - 12;
                       //display the remaing credits
                       System.out.println("You have just used 12 credits and have " + totalCredits + " left.");
                       System.out.println("Enjoy your free donut.");
                   }
                   //if the user entered n
                   else if(choice.toLowerCase().charAt(0) == 'n')
                   {
                       //prompt and read how many donuts user wishes to purchase
                       System.out.print("How many donuts would you like to buy? ");
                       noOfDoughnuts = input.nextInt();
                       input.nextLine();
                       //display error message if the number entered is not within the range
                       if(noOfDoughnuts <= 0 || noOfDoughnuts >= 500)
                           System.out.println("***Invalid # of donuts. ***");
                       //else process the transaction
                       else
                       {
                           //add credits earned
                           totalCredits = totalCredits + noOfDoughnuts;
                           //display the credits available
                           System.out.println("You just earned " + noOfDoughnuts + " credits and have a total of " + totalCredits + " to use. ");
                       }
                   }
                   //else display error message
                   else
                       System.out.println("*** Invalid response ***");
               }
               else
               {
                   //prompt and read the number of donuts the user wishes to purchase
                   System.out.print("How many donuts would you like to buy? ");
                   noOfDoughnuts = input.nextInt();
                   input.nextLine();
                   //display error message if the number entered is not within the range
                   if(noOfDoughnuts <= 0 || noOfDoughnuts >= 500)
                       System.out.println("***Invalid # of donuts. ***");
                   //else process the transaction
                   else
                   {
                       //add credits earned
                       totalCredits = totalCredits + noOfDoughnuts;
                       //display the credits available
                       System.out.println("You just earned " + noOfDoughnuts + " credits and have a total of " + totalCredits + " to use. ");
                   }
               }
           }
           //if the user entered e
           else if(choice.toLowerCase().charAt(0) == 'e')
           {
               //set repeat to false to terminate the program
               repeat = false;
               System.out.println("Exiting Program.\nGOODBYE!");
           }
           //else display an error message
           else
               System.out.println("*** Use P or E, please. ***");  
       }
       input.close();
   }

}