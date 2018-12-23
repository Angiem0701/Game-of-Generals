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
	
	JLabel ObjectiveLabel = new JLabel();
	
	JTextArea HowToPlay = new JTextArea();
	
	SuperSocketMaster ssm;
	
	// Variables
	String strObjective = "The OBJECTIVE of the game is to eliminate or capture the Flag of your opponent. You may also win by successfully maneuvering your own Flag to the opposite end of the board.";
	String strObjective2 = "The player's set of pieces or soldiers with the corresponding ranks and functions consists of the following 21 pieces:";

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -		
	
	// METHODS - ACTIONLISTENER (Action Performed)
	public void actionPerformed(ActionEvent evt){		
		if(evt.getSource() == thetimer){
			thepanel.repaint();
			
		}else if(evt.getSource() == StartGameButton){
			StartGameButton.setVisible(false);
			HelpButton.setVisible(false);
			
		}else if(evt.getSource() == HelpButton){
			StartGameButton.setVisible(false);
			HelpButton.setVisible(false);
			ObjectiveLabel.setVisible(true);
			HowToPlay.setVisible(true);
			
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
		ObjectiveLabel.setBounds(520,150,300,50);
		ObjectiveLabel.setVisible(false);
		HowToPlay = new JTextArea(strObjective + "\n" + "\n" + strObjective2);
		HowToPlay.setLineWrap(true);
		HowToPlay.setWrapStyleWord(true);
		HowToPlay.setBounds(390,200,500,300);
		HowToPlay.setVisible(false);
		
		thepanel.add(StartGameButton);
		thepanel.add(HelpButton);
		thepanel.add(ObjectiveLabel);
		thepanel.add(HowToPlay);
		
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
