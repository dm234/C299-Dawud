import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        boolean playAgain = true;

        while(playAgain){
            System.out.println("How many rounds do you want to play: ");
            int rounds = sc.nextInt();

            if (rounds <1 || rounds>10){
                System.out.println("Error please choose between 1 to 10 rounds");
                System.exit(1);
            }

            String[] choices = {"rock", "paper", "scissors"};
            Random random = new Random();
            int ties, userScore, compScore;
            ties = userScore = compScore = 0;

            while(rounds > 0){
                rounds --;
                System.out.println("Pick either Rock (1), Paper(2) or Scissors(3): ");
                int userChoiceIndex = sc.nextInt();
                int compChoiceIndex = random.nextInt(3);
                String userChoice = choices[userChoiceIndex-1];
                String compChoice = choices[compChoiceIndex];


                System.out.println("You chose: " + userChoice);
                System.out.println("Computer chose: " + compChoice);

                if (userChoice == compChoice){
                    ties ++;
                    System.out.println("This round is a tie");
                    continue;
                }

                switch(userChoice){
                    case "rock":
                        if (compChoice == "paper"){
                            System.out.println("Computer won this round");
                            compScore ++;
                        }else{
                            System.out.println("You won this round");
                            userScore ++;
                        }
                        break;
                    case "paper":
                        if (compChoice == "scissors"){
                            System.out.println("Computer won this round");
                            compScore ++;
                        }else{
                            System.out.println("You won this round");
                            userScore ++;
                        }
                        break;
                    case "scissors":
                        if (compChoice == "rock"){
                            System.out.println("Computer won this round");
                            compScore ++;
                        }else{
                            System.out.println("You won this round");
                            userScore ++;
                        }
                        break;
                }


            }

            System.out.println("Ties: "+ties);
            System.out.println("Your Score: "+userScore);
            System.out.println("Computer Score: "+compScore);

            String winner;
            
            if (compScore==userScore){
                winner = "it is a Tie!";
            }else if (compScore>userScore){
                winner = "the computer wins!";
            }else{
                winner = "you win!! Congratulations";
            }

            System.out.println("Therefore " + winner);
            
            System.out.println("Do you want to play again (y/n)? ");
            sc.nextLine();
            String userPlayAgain = sc.nextLine();
            
            if (!userPlayAgain.equals("y")){
                playAgain = false;
            }
        
        }
        
    }
}
