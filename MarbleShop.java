import java.util.Scanner;
public class MarbleShop {
    public static void main (String[] args) { 
        int Amount_of_Swirlies = 10;
        int Amount_of_Aggies = 5;
        int Amount_of_Clearies = 20;

        double Price_of_Swirlies = 0.35;
        double Price_of_Aggies = 0.77;
        double Price_of_Clearies = 0.12;

        double user_Money = 2.36;

        System.out.println("=== MARBLE SHOP ===");
        System.out.printf("%-10s%10s%10s\n" , "Marble" , "Amount" , "Price");
        System.out.printf("%-10s%10s%10s\n" , "Swirlies" , Amount_of_Swirlies, Price_of_Swirlies);
        System.out.printf("%-10s%10s%10s\n" , "Aggies" , Amount_of_Aggies ,Price_of_Aggies);
        System.out.printf("%-10s%10s%10s\n" , "Clearies" , Amount_of_Clearies , Price_of_Clearies);
        System.out.printf("You have: $" + user_Money + "\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Command: ");
        String command = input.nextLine();
       
        //System.out.println(command.indexOf(' '));

        if ((command.indexOf(' ') == -1)){
            System.out.println("Invalid Command");
            System.exit(1);
        }
        //Use substring() to store variables in 'command' string
        int index1 = (command.indexOf(' '));
        String action = command.substring(0,index1);
        int index2 = command.indexOf(' ', command.indexOf(' ') + 1);
        String amount = command.substring(index1 +1 , index2);
        String marble_type = command.substring(index2 + 1);

        // Convert variables
        action = action.toLowerCase();
        marble_type = marble_type.toLowerCase();
        int Amount = Integer.parseInt(amount);
 
        if (action.equals("buy")){
            
            if (marble_type.equals("swirlies")){
                if ((Amount <= Amount_of_Swirlies) && (Amount * Price_of_Swirlies <= user_Money)){
                    System.out.println("You bought " + Amount + " " + marble_type + ".");
                    System.out.printf("It cost: $" +  "%.2f", (Amount * Price_of_Swirlies));
                    System.out.println();
                }
                    
                else {
                    System.out.println("You do not have enough money, or the shop does not have enough marbles.");}
                }
            

            else if (marble_type.equals("aggies")){
                if ((Amount <= Amount_of_Aggies) && (Amount * Price_of_Aggies <= user_Money)){
                    System.out.println("You bought " + Amount + " " + marble_type + ".");
                    System.out.printf("It cost: $" + "%.2f", (Amount * Price_of_Aggies));
                    System.out.println();
                }
                else {
                    System.out.println("You do not have enough money, or the shop does not have enough marbles.");}
                }
            
                     
            else if (marble_type.equals("clearies")){
                if ((Amount <= Amount_of_Clearies) && (Amount * Price_of_Clearies <= user_Money)){
                    System.out.println("You bought " + Amount + " " + marble_type + ".");
                    System.out.printf("It cost: $" + "%.2f" , (Amount * Price_of_Clearies));
                    System.out.println();
                    }
                else {
                    System.out.println("You do not have enough money, or the shop does not have enough marbles.");}
                }
                else{
                System.out.println("Invalid marble type");}
            }
            
               
        
        else {
            System.out.println("Invalid action");}

        
    }
}