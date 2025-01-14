import java.util.ArrayList;
public class Board
{
    public static int difficulty; //1 = easy (8 rows), 2 = medium (7 rows), and 3 = hard (6 rows) 
    private String wordBoard[][];

    public Board(int d)
    {
        difficulty = d;
        if(difficulty == 3) //hard makes 6 rows
        {
            wordBoard = new String[6][5];
        }
        else if(difficulty == 2) //medium makes 7 rows
        {
            wordBoard = new String[7][5];
        }
        else //else defaults to easy which makes 8 rows
        {
            wordBoard = new String[8][5];
        }
    }

    public int getRows()
    {
        return wordBoard.length;
    }

    public int getColumns()
    {
        return wordBoard[0].length;
    }

    public void place(int rowLocation, int colLocation, String value)
    {
        wordBoard[rowLocation][colLocation] = value;
    }

    public boolean checkNull(int row, int col)
    {
        if(wordBoard[row][col] == null)
        {
            return true;
        }
        return false;
    }

    public void printBoard()
    {
        int x = 0;
        for(int r = 0; r < wordBoard.length; r++)
        {
            for(int c = 0; c < wordBoard[0].length; c++)
            {
                if(r > x)
                {
                    System.out.println();
                    x++;
                }
                if(wordBoard[r][c] == null)
                {
                   System.out.print(" " + " " + " |");
                }
                else
                System.out.print(" " + wordBoard[r][c] + " |");
            }
        }
    }
}
