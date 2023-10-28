package Carte;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InterfaceColorAddict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame=new JFrame("Color Addict");
		frame.setSize(400,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		JPanel titlePanel=new JPanel();
		titlePanel.setBackground(new Color(142,68,173));//la couleur violet 
		JLabel titleLabel=new JLabel("Color Addict Jeu");
		titleLabel.setFont(new Font("Arial",Font.BOLD,24));
		titleLabel.setForeground(Color.WHITE);
		titlePanel.add(titleLabel);
		//creation de l'arrière-plan:
		//JPanel cardPanel=new JPanel();
		JPanel cardPanel=new TestImagePanel(new ImageIcon("C:/Users/rekbi/eclipse-workspace/ProjetColorAddict/IMG_2611.jpg").getImage());
		cardPanel.setBackground(new Color(155,89,182));//pour la couleur violet clair
		//JLabel cardLabel =new JLabel(new ImageIcon("C:/Users/rekbi/eclipse-workspace/ProjetColorAddict/IMG_2611.jpg"));
		cardPanel.add(titleLabel);
		//cardPanel.add(cardLabel);
		//creation des boutons:
		JPanel buttonPanel1=new JPanel();
		buttonPanel1.setLayout(new GridLayout(3,1));
		buttonPanel1.setBackground(new Color(155,89,182));
		
		JButton playButton=new JButton("Jouer");
		JButton scoreButton=new JButton("Score");
		JButton quitButton=new JButton("Quitter");
		buttonPanel1.add(playButton);
		buttonPanel1.add(scoreButton);
		buttonPanel1.add(quitButton);
		//changer la taille des bouttons
		Dimension buttonSize=new Dimension(20,20);
		playButton.setPreferredSize(buttonSize);
		scoreButton.setPreferredSize(buttonSize);
		quitButton.setPreferredSize(buttonSize);
	
		
		frame.add(titlePanel,BorderLayout.NORTH);
		frame.add(cardPanel,BorderLayout.CENTER);
		frame.add(buttonPanel1,BorderLayout.SOUTH);
		frame.setVisible(true);
		
		
		
		
		
		
		
		
	}

}
