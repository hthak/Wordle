import java.util.ArrayList;
public class Game
{
    int currentRow;
    ArrayList<String> words = new ArrayList<String>();
    char[] correctWordLetters;
    char[] currentGuessLetters;
    Board gameBoard;
    char[] wrongGuessedLetters;
    public Game(int selectDifficulty)
    {
        gameBoard = new Board(selectDifficulty);
        currentRow = 0;
        wrongGuessedLetters = new char[26];
        words.add("above");
        words.add("abuse");
        words.add("alike");
        words.add("alone");
        words.add("apart");
        words.add("arena");
        words.add("audio");
        words.add("among");
        words.add("asset");
        words.add("argue");
        words.add("adult");
        words.add("album");
        words.add("aside");
        words.add("apply");
        words.add("angle");
        words.add("alter");
        words.add("allow");
        words.add("again");
        words.add("avoid");
        words.add("badly");
        words.add("baker");
        words.add("bases");
        words.add("basic");
        words.add("basis");
        words.add("bench");
        words.add("bound");
        words.add("brown");
        words.add("blind");
        words.add("brand");
        words.add("buyer");
        words.add("build");
        words.add("brief");
        words.add("bring");
        words.add("broke");
        words.add("bread");
        words.add("break");
        words.add("boost");
        words.add("bench");
        words.add("blame");
        words.add("below");
        words.add("heist");
        words.add("shown");
        words.add("zesty");
        words.add("hasty");
        words.add("trash");
        words.add("fella");
        words.add("larva");
        words.add("cigar");
        words.add("rebut");
        words.add("sissy");
        words.add("humph");
        words.add("blush");
        words.add("focal");
        words.add("evade");
        words.add("naval");
        words.add("serve");
        words.add("heath");
        words.add("dwarf");
        words.add("model");
        words.add("karma");
        words.add("stink");
        words.add("grade");
        words.add("quiet");
        words.add("bench");
        words.add("abate");
        words.add("feign");
        words.add("major");
        words.add("death");
        words.add("fresh");
        words.add("crust");
        words.add("stool");
        words.add("colon");
        words.add("marry");
        words.add("react");
        words.add("batty");
        words.add("pride");
        words.add("floss");
        words.add("helix");
        words.add("croak");
        words.add("staff");
        words.add("paper");
        words.add("unfed");
        words.add("whelp");
        words.add("trawl");
        words.add("outdo");
        words.add("adobe");
        words.add("crazy");
        words.add("sower");
        words.add("repay");
        words.add("digit");
        words.add("crate");
        words.add("cluck");
        words.add("spike");
        words.add("mimic");
        words.add("pound");
        words.add("linen");
        words.add("unmet");
        words.add("flesh");
        words.add("forth");
        words.add("first");
        words.add("stand");
        words.add("belly");
        words.add("ivory");
        words.add("seedy");
        words.add("print");
        words.add("yearn");
        words.add("drain");
        words.add("bribe");
        words.add("stout");
        words.add("panel");
        words.add("crass");
        words.add("flume");
        words.add("fishy");
        words.add("offal");
        words.add("error");
        words.add("swirl");
        words.add("delta");
        words.add("bleed");
        words.add("flick");
        words.add("totem");
        words.add("wooer");
        words.add("front");
        words.add("shrub");
        words.add("parry");
        words.add("biome");
        words.add("lapel");
        words.add("start");
        words.add("greet");
        words.add("goner");
        words.add("golem");
        words.add("lusty");
        words.add("loopy");
        words.add("round");
        words.add("audit");
        words.add("lying");
        words.add("gamma");
        words.add("labor");
        words.add("islet");
        words.add("civic");
        words.add("forge");
        words.add("corny");
        words.add("moult");
        words.add("salad");
        words.add("spicy");
        words.add("spray");
        words.add("essay");
        words.add("spend");
        words.add("kebab");
        words.add("guild");
        words.add("motor");
        words.add("alone");
        randomWord();
    }

    public void randomWord()
    {
        correctWordLetters = new char[5];
        String s = words.get((int)(Math.random() * words.size())); //gets random word in words
        for(int x = 0; x < 5; x++)
        {
            correctWordLetters[x] = s.charAt(x); 
        }
    }

    public char[] guess(String g)
    { 
        currentRow++;
        currentGuessLetters = new char[5];
        for(int x = 0; x < g.length(); x++) 
        {
            currentGuessLetters[x] = g.charAt(x);
        }
        return currentGuessLetters;
    }

    int y = 0;
    public void guessEval()
    {
        for(int r = currentRow - 1; r < gameBoard.getRows(); r++) //loops through gameBoard rows
        {
            for(int c = 0; c < 5; c++) //loops through gameBoard cols
            {
                if(correctWordLetters[c] == currentGuessLetters[c])
                {
                    String temp = "" + correctWordLetters[c]; //converts correct char letter to string letter
                    temp = temp.toUpperCase(); //makes temp capital
                    gameBoard.place(r, c, temp); //capital letter placed in gameBoard means correct spot, correct letter
                }
                else
                {
                    boolean finished = false;
                    for(int p = 0; p < 5; p++) //loops through correctWordLetters
                    {
                        if(!finished && correctWordLetters[p] == currentGuessLetters[c])
                        {
                            String temp = "" + correctWordLetters[p]; //converts correct char letter to string letter
                            gameBoard.place(r, c, temp); //lowercase letter placed means wrong spot, correct letter
                            finished = true; //leaves for loop b/c somthing has been placed
                        }
                    }
                    if(!finished)
                    {
                        boolean found = false;
                        String temp = "-";
                        gameBoard.place(r, c, temp); //places a - which means wrong spot, wrong letter
                        for(int d = 0; d < wrongGuessedLetters.length; d++)
                        {
                            if(wrongGuessedLetters[d] == currentGuessLetters[c])
                            {
                                found = true;
                            }
                        }
                        if(found == false)
                        {
                            wrongGuessedLetters[y] = currentGuessLetters[c];
                            y++;
                        }
                    }
                }
            }
            gameBoard.printBoard();
            return;
        }
    }

    public void printWrongGuessed()
    {
        System.out.println("");
        System.out.print("Wrong guessed letters: ");
        for(int i = 0; i < wrongGuessedLetters.length; i++)
        {
            System.out.print(wrongGuessedLetters[i] + " ");
        }
    }

    public boolean loss()
    {
        if(Board.difficulty == 3 && currentRow == 6)
        {
            System.out.println();
            System.out.print("The correct word was ");
            for(int i = 0; i < correctWordLetters.length; i++)
            {
                System.out.print(correctWordLetters[i]);
            }
            System.out.print("!");
            return true;
        }
        if(Board.difficulty == 2 && currentRow == 7)
        {
            System.out.println();
            System.out.print("The correct word was ");
            for(int i = 0; i < correctWordLetters.length; i++)
            {
                System.out.print(correctWordLetters[i]);
            }
            System.out.print("!");
            return true;
        }
        if(Board.difficulty == 1 && currentRow == 8)
        {
            System.out.println();
            System.out.print("The correct word was ");
            for(int i = 0; i < correctWordLetters.length; i++)
            {
                System.out.print(correctWordLetters[i]);
            }
            System.out.print("!");
            return true;
        }
        return false;
    }

    public boolean win() 
    {
        int x = 0;
        for(int i = 0; i < 5; i++)
        {
            if(correctWordLetters[i] == currentGuessLetters[i])
            {
                x++;  
            }
        }
        if(x == 5) 
        {
            return true; 
        }
        return false; 
    }

}