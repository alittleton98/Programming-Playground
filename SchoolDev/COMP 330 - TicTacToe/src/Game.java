import java.util.*;
import javax.swing.*;

public class Game {

    public Game(){
    }
    
    public Boolean victor(String[][] board, JFrame frame){
        //Diagonal checks
        if(board[1][1].equals("x")){
            if(board[0][0].equals("x") && board[2][2].equals("x")){
                messageHandler.playerXWonMessage(frame);
                return true;
            } else if(board[0][2].equals("x") && board[2][0].equals("x")){
                messageHandler.playerXWonMessage(frame);
                return true;
            }
        }
        if(board[1][1].equals("o")){
            if(board[0][0].equals("o") && board[2][2].equals("o")){
                messageHandler.playerOWonMessage(frame);
                return true;
            } else if(board[0][2].equals("o") && board[2][0].equals("o")){
                messageHandler.playerOWonMessage(frame);
                return true;
            }
        }
        //

        //Adjacency checks
        if(board[0][0].equals("x")){
            if(board[0][1].equals("x") && board[0][2].equals("x")){
                messageHandler.playerXWonMessage(frame);
                return true;
            } else if(board[1][0].equals("x") && board[2][0].equals("x")){
                messageHandler.playerXWonMessage(frame);
                return true;
            }
        }

        if(board[2][2].equals("x")){
            if(board[2][1].equals("x") && board[2][0].equals("x")){
                messageHandler.playerXWonMessage(frame);
                return true;
            } else if(board[1][2].equals("x") && board[0][2].equals("x")){
                messageHandler.playerXWonMessage(frame);
                return true;
            }
        }
        if(board[0][0].equals("o")){
            if(board[0][1].equals("o") && board[0][2].equals("o")){
                messageHandler.playerOWonMessage(frame);
                return true;
            } else if(board[1][0].equals("o") && board[2][0].equals("o")){
                messageHandler.playerOWonMessage(frame);
                return true;
            }
        }

        if(board[2][2].equals("o")){
            if(board[2][1].equals("o") && board[2][0].equals("o")){
                messageHandler.playerOWonMessage(frame);
                return true;
            } else if(board[1][2].equals("o") && board[0][2].equals("o")){
                messageHandler.playerOWonMessage(frame);
                return true;
            }
        }
        //
        //straight checks
        if(board[1][1].equals("x")){
            if(board[1][0].equals("x") && board[1][2].equals("x")){
                messageHandler.playerXWonMessage(frame);
                return true;
            } else if(board[0][1].equals("x") && board[2][1].equals("x")){
                messageHandler.playerXWonMessage(frame);
                return true;
            }
        }
        if(board[1][1].equals("o")){
            if(board[1][0].equals("o") && board[1][2].equals("o")){
                messageHandler.playerOWonMessage(frame);
                return true;
            } else if(board[0][1].equals("o") && board[2][1].equals("o")){
                messageHandler.playerOWonMessage(frame);
                return true;
            }
        }

        return false;
    }

}