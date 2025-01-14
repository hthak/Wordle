import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class User
{
    public static void startGame()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("~Welcome to Wordle, a game coded by Himanshu~");
        System.out.println();
        wait(2000);
        System.out.println("Please select your difficulty! (Note: 1 = BEGINNER, 2 = AMATEUR, 3 = EXPERT)");
        System.out.println();
        int userDifficulty = scan.nextInt();
        Game g1 = new Game(userDifficulty);
        if(userDifficulty == 3)
        {
            System.out.println("<You have selected EXPERT>");
        }
        else if(userDifficulty == 2)
        {
            System.out.println("<You have selected AMATEUR>");
        }
        else
        {
            System.out.println("<You have selected BEGINNER>");
        }
        System.out.println();
        System.out.println("-----------------------INSTRUCTIONS-----------------------");
        System.out.println("         -       = WRONG letter and WRONG place");
        System.out.println("lowercase letter = RIGHT letter but WRONG place");
        System.out.println("UPPERCASE letter = RIGHT letter and RIGHT place");
        System.out.println("Please note: Two same letters may be placed even if the correct word only has one of that letter");
        System.out.println("----------------------------------------------------------");
        System.out.println();
        wait(7000);
        System.out.println("Now let's play...Please enter your 5 letter lowercase word guess!");
        String initialGuess = scan.next();
        if(initialGuess.length() == 5)
        {
            g1.guess(initialGuess);
            g1.guessEval();
            g1.printWrongGuessed();
        }
        else 
        {
            while(initialGuess.length() != 5)
            {
                System.err.println("Too big/small, please enter a 5 letter word!"); 
                initialGuess = scan.next();
            }
            g1.guess(initialGuess);
            g1.guessEval();
            g1.printWrongGuessed();
        }
        if(g1.win())
        {
            System.out.println();
            System.out.println();
            System.out.println("******** YOU WIN! :) ********");
            return;
        }
        else
        {
            System.out.println();
            System.out.println();
            System.out.println("Keep going, enter your next guess!");
            String secondGuess = scan.next();
            if(secondGuess.length() == 5)
            {
                g1.guess(secondGuess);
                g1.guessEval();
                g1.printWrongGuessed();
            }
            else 
            {
                while(secondGuess.length() != 5)
                {
                    System.out.println();
                    System.out.println();
                    System.err.println("Too big/small, please enter a 5 letter word!"); 
                    secondGuess = scan.next();
                }
                g1.guess(secondGuess);
                g1.guessEval();
                g1.printWrongGuessed();
            }
        }
        if(g1.win())
        {
            System.out.println();
            System.out.println();
            System.out.println("******** YOU WIN! :) ********");
            return;
        }
        else
        {
            System.out.println();
            System.out.println();
            System.out.println("Keep going, enter your next guess!");
            String thirdGuess = scan.next();
            if(thirdGuess.length() == 5)
            {
                g1.guess(thirdGuess);
                g1.guessEval();
                g1.printWrongGuessed();
            }
            else 
            {
                while(thirdGuess.length() != 5)
                {
                    System.out.println();
                    System.out.println();
                    System.err.println("Too big/small, please enter a 5 letter word!"); 
                    thirdGuess = scan.next();
                }
                g1.guess(thirdGuess);
                g1.guessEval();
                g1.printWrongGuessed();
            }
        }
        if(g1.win())
        {
            System.out.println();
            System.out.println();
            System.out.println("******** YOU WIN! :) ********");
            return;
        }
        else
        {
            System.out.println();
            System.out.println();
            System.out.println("Keep going, enter your next guess!");
            String fourthGuess = scan.next();
            if(fourthGuess.length() == 5)
            {
                g1.guess(fourthGuess);
                g1.guessEval();
                g1.printWrongGuessed();
            }
            else 
            {
                while(fourthGuess.length() != 5)
                {
                    System.out.println();
                    System.out.println();
                    System.err.println("Too big/small, please enter a 5 letter word!"); 
                    fourthGuess = scan.next();
                }
                g1.guess(fourthGuess);
                g1.guessEval();
                g1.printWrongGuessed();
            }
        }
        if(g1.win())
        {
            System.out.println();
            System.out.println();
            System.out.println("******** YOU WIN! :) ********");
            return;
        }
        else
        {
            System.out.println();
            System.out.println();
            System.out.println("Keep going, enter your next guess!");
            String fifthGuess = scan.next();
            if(fifthGuess.length() == 5)
            {
                g1.guess(fifthGuess);
                g1.guessEval();
                g1.printWrongGuessed();
            }
            else 
            {
                while(fifthGuess.length() != 5)
                {
                    System.out.println();
                    System.out.println();
                    System.err.println("Too big/small, please enter a 5 letter word!"); 
                    fifthGuess = scan.next();
                }
                g1.guess(fifthGuess);
                g1.guessEval();
                g1.printWrongGuessed();
            }
        }
        if(g1.win())
        {
            System.out.println();
            System.out.println();
            System.out.println("******** YOU WIN! :) ********");
            return;
        }
        else
        {
            if(g1.loss())
            {
                System.out.println();
                System.out.println();
                System.out.println("YOU LOST! :(");
                return;
            }
            System.out.println();
            System.out.println();
            System.out.println("Keep going, enter your next guess!");
            String sixthGuess = scan.next();
            if(sixthGuess.length() == 5)
            {
                g1.guess(sixthGuess);
                g1.guessEval();
                g1.printWrongGuessed();
            }
            else 
            {
                while(sixthGuess.length() != 5)
                {
                    System.out.println();
                    System.out.println();
                    System.err.println("Too big/small, please enter a 5 letter word!"); 
                    sixthGuess = scan.next();
                }
                g1.guess(sixthGuess);
                g1.guessEval();
                g1.printWrongGuessed();
            }
        }

        if(g1.win())
        {
            System.out.println();
            System.out.println();
            System.out.println("******** YOU WIN! :) ********");
            return;
        }
        else
        {
            if(g1.loss())
            {
                System.out.println();
                System.out.println();
                System.out.println("YOU LOST! :(");
                System.out.println("Maybe just stick to amateur...");
                return;
            }
            System.out.println();
            System.out.println();
            System.out.println("Keep going, enter your next guess!");
            String seventhGuess = scan.next();
            if(seventhGuess.length() == 5)
            {
                g1.guess(seventhGuess);
                g1.guessEval();
                g1.printWrongGuessed();
            }
            else 
            {
                while(seventhGuess.length() != 5)
                {
                    System.out.println();
                    System.out.println();
                    System.err.println("Too big/small, please enter a 5 letter word!"); 
                    seventhGuess = scan.next();
                }
                g1.guess(seventhGuess);
                g1.guessEval();
                g1.printWrongGuessed();
            }
        }
        if(g1.win())
        {
            System.out.println();
            System.out.println();
            System.out.println("******** YOU WIN! :) ********");
            return;
        }
        else
        {
            if(g1.loss())
            {
                System.out.println();
                System.out.println();
                System.out.println("YOU LOST! :(");
                System.out.println("Maybe just stick to beginner...");
                return;
            }
            System.out.println();
            System.out.println();
            System.out.println("Keep going, enter your next guess!");
            String eigthGuess = scan.next();
            if(eigthGuess.length() == 5)
            {
                g1.guess(eigthGuess);
                g1.guessEval();
                g1.printWrongGuessed();
            }
            else 
            {
                while(eigthGuess.length() != 5)
                {
                    System.out.println();
                    System.out.println();
                    System.err.println("Too big/small, please enter a 5 letter word!"); 
                    eigthGuess = scan.next();
                }
                g1.guess(eigthGuess);
                g1.guessEval();
                g1.printWrongGuessed();
            }
            if(g1.loss())
            {
                System.out.println();
                System.out.println();
                System.out.println("YOU LOST! :(");
                System.out.println("Come on...It can't get any easier than this...");
                return;
            }
        }
    }

    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}