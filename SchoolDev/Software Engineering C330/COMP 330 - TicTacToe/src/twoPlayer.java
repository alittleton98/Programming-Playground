import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.util.*;


public class twoPlayer extends JFrame implements ActionListener{
    private JFrame playerFrame = new JFrame("Two player mode");
    private JFrame characterFrame = new JFrame("Character Select");
    private String[][] gameBoard = new String[3][3];
    private int count = 0;

    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private JLabel playerLabel;
    private String playerTurn = "x";

    sound thisSound = new sound();

    //default icons set to x and o
    String imageX = "/images/redX.jpg";
    String imageO = "/images/blue.jpg";     

    //Checks if the tile has already been pressed
    Boolean b1Check = false;
    Boolean b2Check = false;
    Boolean b3Check = false;
    Boolean b4Check = false;
    Boolean b5Check = false;
    Boolean b6Check = false;
    Boolean b7Check = false;
    Boolean b8Check = false;
    Boolean b9Check = false;

   // characterSelect c = new characterSelect();

    public twoPlayer() {
        populateBoard(gameBoard);

        //Allows players to click a tile to draw their turn
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();

        //shows what player turn it is
        playerLabel = new JLabel();
        playerLabel.setForeground(Color.RED);

        //Allows button to take action when pressed
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        //adds button to jframe
        playerFrame.add(b1);
        playerFrame.add(b2);
        playerFrame.add(b3);
        playerFrame.add(b4);
        playerFrame.add(b5);
        playerFrame.add(b6);
        playerFrame.add(b7);
        playerFrame.add(b8);
        playerFrame.add(b9);
        playerFrame.add(playerLabel);

        //sets the size for first button which defaults the others to the same size
        b1.setPreferredSize(new Dimension(100,100));

        setCustomFrame(characterFrame);
        characterSelect(characterFrame, playerFrame);
        characterFrame.setVisible(true);


        setCustomFrame(playerFrame);
        playerFrame.setLayout(new GridLayout(4,3,3,3));
<<<<<<< HEAD
        playerFrame.setSize(500,500);
        playerFrame.getContentPane().setBackground(Color.BLACK);
        playerFrame.setVisible(true);
        tttGame.centerFrame(playerFrame);
=======
        //playerFrame.setVisible(true);

        tttGame.centerFrame(playerFrame);
        tttGame.centerFrame(characterFrame);
    }

    public void setCustomFrame(JFrame frame){
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.getContentPane().setBackground(Color.BLACK);
    }

    //Creates a frame to allow players to choose characters
    public void characterSelect(JFrame cFrame, JFrame tFrame){
        String[] xCharaters = new String[] {"red x", "link", "moon","pumpkin","wizard"};
        String[] oCharaters = new String[] {"blue o","grunge","megaman","white figure"};
        JComboBox<String> xC = new JComboBox<>(xCharaters);
        JComboBox<String> oC = new JComboBox<>(oCharaters);

        xC.setBounds(50, 50, 150, 20);
        oC.setBounds(250, 50, 150, 20);

        //Allows drop down box to communicate with the game to change characters
        ActionListener XselectionListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String x = (String) xC.getSelectedItem();
                switch(x){
                    case "red x": imageX = "/images/redX.jpg";
                        break;
                    case "link": imageX = "/images/link.png";
                        break;
                    case "moon": imageX = "/images/moon.jpeg";
                        break;
                    case "pumpkin": imageX = "/images/pumpkin.jpeg";
                        break;
                    case "wizard": imageX = "/images/wizard.jpeg";
                        break;
                }
                
            }
        };
        ActionListener OselectionListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String o = (String) oC.getSelectedItem();
                switch(o){
                    case "blue o": imageO = "/images/blue.jpg";
                        break;
                    case "grunge": imageO = "/images/grunge.jpeg";
                        break;
                    case "megaman": imageO = "/images/megaman.png";
                        break;
                    case "white figure": imageO = "/images/whitefigure.png";
                        break;

                }
                
            }
        };
        xC.addActionListener(XselectionListener);
        oC.addActionListener(OselectionListener);

        cFrame.add(xC);
        cFrame.add(oC);


        //Submits the characters and begins the game
        JButton b = new JButton("Submit Characters");
        b.setBounds(cFrame.getWidth()/2, 100, 150, 20);
        cFrame.add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                messageHandler.charactersSelected(cFrame, tFrame);
            }
        });
>>>>>>> Tyler

    }
    //button interactions
    public void actionPerformed(ActionEvent ae) {
        thisSound.playRing();
        if(ae.getSource() == b1){
            if(b1Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[0][0] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[0][0] = "o";
                }
                buttonPressed(b1);
                b1Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }

        }
        if(ae.getSource() == b2){
            if(b2Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[0][1] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[0][1] = "o";
                }
                buttonPressed(b2);
                b2Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b3){
            if(b3Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[0][2] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[0][2] = "o";
                }
                buttonPressed(b3);
                b3Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b4){
            if(b4Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[1][0] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[1][0] = "o";
                }
                buttonPressed(b4);
                b4Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b5){
            if(b5Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[1][1] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[1][1] = "o";
                }
                buttonPressed(b5);
                b5Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b6){
            if(b6Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[1][2] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[1][2] = "o";
                }
                buttonPressed(b6);
                b6Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b7){
            if(b7Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[2][0] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[2][0] = "o";
                }
                buttonPressed(b7);
                b7Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b8){
            if(b8Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[2][1] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[2][1] = "o";
                }
                buttonPressed(b8);
                b8Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b9){
            if(b9Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[2][2] = "x";
                } else if(playerTurn.equals("o")){
                    gameBoard[2][2] = "o";
                }
                buttonPressed(b9);
                b9Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }
    }

    //If a button is pressed, it changes the turn and shows an alert to see whose turn it is
    public void buttonPressed(JButton button){
        count++;
        if(playerTurn.equals("x")) {
            changeXImage(button);
            messageHandler.playerOMessage();
            checkForWinner();
            playerTurn = "o";
            playerLabel.setText("player o's turn");
        } else if(playerTurn.equals("o")){
            changeOImage(button);
            messageHandler.playerXMessage();
            checkForWinner();
            playerTurn = "x";
           playerLabel.setText("player x's turn");

        }


    }
    public void checkForWinner(){
        Game g = new Game();
        if(count >= 5 && count < 9){
             if(g.victor(gameBoard, playerFrame)){
                 System.out.println("someone won");
             }
        } else if(count == 9 && !g.victor(gameBoard, playerFrame)){
            messageHandler.gameTie(playerFrame);
        }
    }
    
    //Changes the buttton's icon image to corresponding turn
    public void changeOImage(JButton b){
        try{
            //characterSelect c = new characterSelect();
            java.net.URL imgURL = getClass().getResource(imageO);
            ImageIcon icon = new ImageIcon(imgURL);
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(100,100, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImg);
            b.setIcon(icon);
            b.setBorder(BorderFactory.createEmptyBorder());
        } catch(Exception e) {
            e.printStackTrace();
        
        }

    }
    public void changeXImage(JButton b){
        try{
            java.net.URL imgURL = getClass().getResource(imageX);
            ImageIcon icon = new ImageIcon(imgURL);
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(100,100, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImg);
            b.setIcon(icon);
            b.setBorder(BorderFactory.createEmptyBorder());
        } catch(Exception e) {
            e.printStackTrace();
        
        }
    }

    //populates an empty board that communicates directly with the actual gamae
    public void populateBoard(String[][] board){
        board[0][0]= "not used";
        board[0][1]= "not used";
        board[0][2]= "not used";
        board[1][0]= "not used";
        board[1][1]= "not used";
        board[1][2]= "not used";
        board[2][0]= "not used";
        board[2][1]= "not used";
        board[2][2]= "not used";
    }
    //game tie check
    public Boolean boardFull(){
        if(b1Check == true 
            && b2Check == true
            && b3Check == true
            && b4Check == true
            && b5Check == true
            && b6Check == true
            && b7Check == true
            && b8Check == true
            && b9Check == true){
            return true;
        }
        return false;
    }
}