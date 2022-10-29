import java.util.Scanner;
public class Jotto {


        // METHOD BEGIN //
        public static boolean validateWord(String word) { 

            boolean find = true;
            int i = 0;
            int count = 0;

        if (word.length() != 5) {
          find = false;}

        if (word.length() == 5){
          while (count < word.length()) {
                    char index = (word.charAt(i));
                    count++;
                    i++; 
              
           if (word.indexOf(index, word.indexOf(index) + 1) == 0){
            find = true;
           }         

          else if (word.indexOf(index, word.indexOf(index) + 1) > 0){
            find = false;}
          }

           }
            return find;
           }
                    
        // END OF METHOD1 //  
        
        
        // SCORE WORD METHOD//
        public static int wordScore(String word1, String word2){
          int count = 0;
          for (int i = 0; i < word1.length(); i++) {
            char ch = word1.charAt(i);
            for (int j = 0; j < word2.length(); j++) {
                if (ch == word2.charAt(j)) {
                    count++;
                }
            }
          }
            
            return(count);
          
        
        }

        // END OF SCORE WORD METHOD //

        // SCORE GAME METHOD//

        public static int gameScore(int x){
          int score = 100; 
          int y = (score - (x * 5));
           return y;}

        // END OF SCORE GAME METHOD //
                                 
        public static void main(String[] args) {
        // JOTTO //
          System.out.println("=== JOTTO ===");
        
        Scanner input = new Scanner(System.in);

          // MYSTERY WORD INFO //

        System.out.print("Enter a mystery word: ");
        String mystery_word = input.nextLine();
        mystery_word = mystery_word.toLowerCase();
        
          
        if (validateWord(mystery_word) == false){
          System.out.println("The supplied mystery word is not valid.");
          System.exit(1);}

          // GUESS INFO //

        System.out.print("Enter your guess: ");
        String guess = input.nextLine();
        guess = guess.toLowerCase();


     //   if (validateWord(guess) == false){
     //     System.out.println("The supplied guess is not valid.");
     //clean     System.exit(1);}
          
          int plays = 0;
          // MAIN LOOP //
    
          
        while (!guess.equals(mystery_word)){



          if (validateWord(guess) == true){
            System.out.println("Score: " + wordScore(mystery_word, guess));
          System.out.print("Enter your guess: ");
          guess = input.nextLine();
          guess = guess.toLowerCase();
          plays ++;}
          

          if (validateWord(guess) == false){
            if (guess.equals("quit")){
              System.out.println("Thanks for playing, goodbye!");
              System.exit(1);}

            System.out.println("The supplied guess is not valid.");        
            System.out.print("Enter your guess: ");
            guess = input.nextLine();
            guess = guess.toLowerCase();
            

     
 }

                   }
      
          if (guess.equals(mystery_word)) {
            System.out.println("You won!");
            System.out.println("Game Score: " + gameScore(plays));}
    }
  
        // END OF MAIN LOOP //    
        
          
  
          
   }               
