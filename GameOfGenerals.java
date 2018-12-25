// Game of Generals [Demo]
// Created by: Angelica C. F. Manansala
// Created on: December 21, 2018
// Last Updated: December 23, 2018

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameOfGenerals implements ActionListener, KeyListener, MouseListener, MouseMotionListener{

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -	
	
	// PROPERTIES
	JFrame theframe;
	GameofGeneralsAnimationPanel thepanel;
	Timer thetimer;
	
	JButton StartGameButton = new JButton();
	JButton HelpButton = new JButton();
	JButton CreateServerButton = new JButton();
	JButton JoinServerButton = new JButton();
	JButton Next1Button = new JButton();
	JButton PreviousButton = new JButton();
	JButton MainMenuButton = new JButton();
		
	JLabel ObjectiveLabel = new JLabel();
	
	JTextArea HowToPlay = new JTextArea();
	
	SuperSocketMaster ssm;
	
	
	// Variables
	String strObjectiveTitle = "*** THE OBJECTIVE OF THE GAME ***";
	String strObjective = "The OBJECTIVE of the game is to ELIMINATE or CAPTURE the FLAG of your opponent. You may also win by successfully maneuvering your own FLAG to the opposite end of the board.";
	String strObjective2 = "The player's set of pieces or soldiers with the corresponding ranks and functions consists of the following 21 pieces:";
	String strPieces = "5-STAR GENERAL: Eliminates any lower ranking officer, private, and flag"+"\n"+"4-STAR GENERAL: Eliminates any lower ranking officer, private, and flag"+"\n"+"3-STAR GENERAL: Eliminates any lower ranking officer, private, and flag"+"\n"+"2-STAR GENERAL: Eliminates any lower ranking officer, private, and flag"+"\n"+"1-STAR GENERAL: Eliminates any lower ranking officer, private, and flag"+"\n"+"COLONEL: Eliminates any lower ranking officer, private, and flag"+"\n"+"LT. COLONEL: Eliminates any lower ranking officer, private, and flag"+"\n"+"MAJOR: Eliminates any lower ranking officer, private, and flag"+"\n"+"CAPTAIN: Eliminates any lower ranking officer, private, and flag"+"\n"+"1st LIEUTENANT: Eliminates any lower ranking officer, private, and flag"+"\n"+"2nd LIEUTENANT: Eliminates any lower ranking officer, private, and flag"+"\n"+"SERGEANT: private and flag"+"\n"+"SPY: Eliminates all officers (from the rank of Sergeant up to the five (5) Star General & the flag."+"\n"+"PRIVATE: Eliminates the spy and the flag"+"\n"+"FLAG: can be eliminated by any piece including the opposing flag; a flag eliminates the opposing flag when it takes aggressive action by moving into the same square occupied by the other flag";
	String strPiecesNote = "NOTE: If both soldiers are of equal ranks, BOTH are eliminated";

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -		
	
	// METHODS - ACTIONLISTENER (Action Performed)
	public void actionPerformed(ActionEvent evt){		
		if(evt.getSource() == thetimer){
			thepanel.repaint();
				
		}else if(evt.getSource() == StartGameButton){
			StartGameButton.setVisible(false);
			HelpButton.setVisible(false);
			CreateServerButton.setVisible(true);
			JoinServerButton.setVisible(true);
			
		}else if(evt.getSource() == HelpButton){
			StartGameButton.setVisible(false);
			HelpButton.setVisible(false);
			ObjectiveLabel.setVisible(true);
			HowToPlay.setVisible(true);
			Next1Button.setVisible(true);
			MainMenuButton.setVisible(true);
			
		}else if(evt.getSource() == MainMenuButton){
			StartGameButton.setVisible(true);
			HelpButton.setVisible(true);
			ObjectiveLabel.setVisible(false);
			HowToPlay.setVisible(false);
			Next1Button.setVisible(false);
			MainMenuButton.setVisible(false);
			PreviousButton.setVisible(false);
						
		}else if(evt.getSource() == Next1Button){
			HowToPlay.setText(null);
			PreviousButton.setVisible(true);	
		}
	}
	
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -	
	
	// METHODS - KEYLISTENER (Key Released)
	public void keyReleased(KeyEvent evt){
	}
	
	// METHODS - KEYLISTENER (Key Pressed)
	public void keyPressed(KeyEvent evt){
		//System.out.println(evt.getKeyCode());
	}	
	
	// METHODS - KEYLISTENER (Key Typed)
	public void keyTyped(KeyEvent evt){
		
	}	
	
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -	
	
	// METHODS - MOUSELISTENER (Mouse Exited)
	public void mouseExited(MouseEvent evt){
	}	
	
	// METHODS - MOUSELISTENER (Mouse Entered)
	public void mouseEntered(MouseEvent evt){
		
	}
	
	// METHODS - MOUSELISTENER (Mouse Released)
	public void mouseReleased(MouseEvent evt){
		
	}
	
	// METHODS - MOUSELISTENER (Mouse Pressed)
	public void mousePressed(MouseEvent evt){
		
	}
	
	// METHODS - MOUSELISTENER (Mouse Clicked)
	public void mouseClicked(MouseEvent evt){
		
	}
	
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -	
	
	// METHODS - MOUSEMOTIONLISTENER (Mouse Moved)
	public void mouseMoved(MouseEvent evt){
		
	}
	
	// METHODS - MOUSEMOTIONLISTENER (Mouse Dragged)
	public void mouseDragged(MouseEvent evt){	
	}

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	
	// CONSTRUCTOR
	public GameOfGenerals(){
		theframe = new JFrame("~ Game of Generals ~");
		thepanel = new GameofGeneralsAnimationPanel();
		thepanel.setLayout(null);
		thepanel.setPreferredSize(new Dimension(1280,720));
		theframe.setResizable(false);
		
		thetimer = new Timer(1000/60, this);
		thetimer.start();	
		
		StartGameButton = new JButton("Start Game!");
		StartGameButton.addActionListener(this);
		StartGameButton.setBounds(540,310,200,50);
		HelpButton = new JButton("How to Play");
		HelpButton.addActionListener(this);
		HelpButton.setBounds(540,360,200,50);
		
		ObjectiveLabel = new JLabel("HOW TO PLAY 'GAME OF THE GENERALS'");
		ObjectiveLabel.setBounds(510,50,300,50);
		ObjectiveLabel.setVisible(false);
		HowToPlay = new JTextArea(strObjectiveTitle+"\n"+"\n"+strObjective+"\n"+"\n"+strObjective2+"\n"+"\n"+strPieces+"\n"+"\n"+strPiecesNote);
		HowToPlay.setLineWrap(true);
		HowToPlay.setWrapStyleWord(true);
		HowToPlay.setBounds(390,100,500,500);
		HowToPlay.setVisible(false);
		HowToPlay.setEditable(false);
		MainMenuButton = new JButton("Main Menu");
		MainMenuButton.addActionListener(this);
		MainMenuButton.setBounds(390,610,160,50);
		MainMenuButton.setVisible(false);
		Next1Button = new JButton("Next ->");
		Next1Button.addActionListener(this);
		Next1Button.setBounds(730,610,160,50);
		Next1Button.setVisible(false);
		PreviousButton = new JButton("<- Previous");
		PreviousButton.addActionListener(this);
		PreviousButton.setBounds(560,610,160,50);
		PreviousButton.setVisible(false);
		
		CreateServerButton = new JButton("Create a New Server");
		CreateServerButton.addActionListener(this);
		CreateServerButton.setBounds(540,310,200,50);
		CreateServerButton.setVisible(false);
		JoinServerButton = new JButton("Join an Existing Server");
		JoinServerButton.addActionListener(this);
		JoinServerButton.setBounds(540,360,200,50);
		JoinServerButton.setVisible(false);
		
		thepanel.add(StartGameButton);
		thepanel.add(HelpButton);
		thepanel.add(CreateServerButton);
		thepanel.add(JoinServerButton);
		thepanel.add(ObjectiveLabel);
		thepanel.add(HowToPlay);
		thepanel.add(Next1Button);
		thepanel.add(MainMenuButton);
		thepanel.add(PreviousButton);
		
		theframe.setContentPane(thepanel);
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theframe.pack();
		theframe.setVisible(true);	
				
		
	}
	
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -	
	
	// MAIN METHOD
	public static void main(String[] args){
		new GameOfGenerals();
	}	
	
}
