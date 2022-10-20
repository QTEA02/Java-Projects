import java.util.Arrays;
import java.util.Scanner;
public class Hurkle {
    public static void main(String[] args){
        //initialize variables
        int[] board = new int[100];

        
        int hurkle_found = 0;
        int playerX = 0;
        int playerY = 0;
        Scanner input = new Scanner(System.in);

    
    
        spawnPlayer(board, 1);
        generateHurkle(board, 2);
        generateItem(board, 3);
     //   System.out.println(Arrays.toString(board));\
//     int index1 = (direction.indexOf(' '));
//     String dir = (direction.substring(0,index1);
//     int index2 = direction.indexOf(' ', direction.indexOf(' ') + 1);
//     String amount = direction.substring(index1 +1 , index2);

        //main loop
        while (hurkle_found < 1){
            System.out.print("\nDirection:");
            String dir = input.next();

            if (dir.equals("q")){
                System.out.println("You lose!");
                System.exit(0);
            }

            String amount = input.next();
            int Amount = Integer.parseInt(amount);
            
            if (dir.equals("w")){
                if ( isValidSpace(playerX -1, playerY)){
                    playerX -= Amount;}
                }
            else if (dir.equals("e")){
            if ( isValidSpace(playerX +1, playerY)){
                    playerX += Amount;}
            }
            else if (dir.equals("n")){
            if ( isValidSpace(playerX, playerY +1)){
                playerY += Amount;
            }
        
        }
            else if (dir.equals("s")){
            if ( isValidSpace(playerX, playerY -1)){
                playerY -= Amount;
            }
            else{
                System.out.println("Invalid movement");
                System.exit(0);
            }
        }
            System.out.println("Location: " + "X:" + playerX + " Y:" + playerY);

            //check player position
            int e = convert2dto1d(playerX, playerY);
            if (board[e] == 2){
                hurkle_found++;
                System.out.print("You win!");
                System.exit(0);
            }
            else if (board[e] == (3)){
                System.out.print("You are in a pit!");
                playerX = 0;
                playerY = 0;
            }
            

            


        }
        //print win/lose

     
    }
        public static void generateHurkle(int[] arr, int value){
        for (int x = 1; x < 2; x++);{
            int hurkle = (int)(Math.random() * 100);
            arr[hurkle] = value;}
        }
        public static void generateItem(int[] arr, int value){
        for(int y = 1; y < 5; y++ ){
            int location = (int)(Math.random()* 100);
            System.out.println("Location" + location + " is:" + value );
            arr[location] = value;}
        }

        public static void spawnPlayer(int[] arr, int value){
            int player = 0;
            arr[player] = value;
            System.out.println("Location" + player + " is:" + value);
        
        }

        public static int[] convert1dto2d(int i){
            int[] position = new int[2];
            position [0] = i % 10;
            position [1] = i / 10;
            return position;      
        }
        public static int convert2dto1d(int playerX, int playerY){
            int index = playerY * 10 + playerX;
            return index;
        }
        public static boolean isValidSpace(int x, int y){
          if (x < 0 || x > 9 || y < 0 || y > 9){
              return false;}
            else {
                return true;
            }
          }
        
    }

    


