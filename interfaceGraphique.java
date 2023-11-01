package InterfaceGraphiqueGame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class interfaceGraphique {
	
	
	

	private static JFrame frame;
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame=new JFrame("Color Addict");
		frame.setSize(400,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		JPanel titlePanel=new JPanel();
		titlePanel.setBackground(Color.WHITE);
		JLabel titleLabel=new JLabel("Color Addict Jeu");
		titleLabel.setFont(new Font("Arial",Font.BOLD,24));
		titleLabel.setForeground(Color.yellow);
		titlePanel.add(titleLabel);
		//creation de l'arrière-plan:
		JPanel cardPanel=new JPanel();
		
		cardPanel.setBackground( Color.WHITE);
		JLabel cardLabel =new JLabel(new ImageIcon("C:/Users/rekbi/eclipse-workspace/ProjetColorAddict/photos game/71nSqf3JF8L._AC_SX450_.jpg"));
		cardPanel.add(titleLabel);
		cardPanel.add(cardLabel);
		//mettre une photo d'icon
		ImageIcon icon = new ImageIcon("C:/Users/rekbi/eclipse-workspace/ProjetColorAddict/photos game/COLOR-ADDICT-JEU-DE-BASE-FRANC387AIS__3114524104001-Z.png"); // Remplacez par le chemin de votre image
		frame.setIconImage(icon.getImage());
		//creation des boutons:
		JPanel buttonPanel1=new JPanel();
		buttonPanel1.setLayout(new GridLayout(3,1));
		buttonPanel1.setBackground(Color.WHITE);
		
		//autre methode pour creer les buttons
		frame.add(titlePanel,BorderLayout.NORTH);
		frame.add(cardPanel,BorderLayout.CENTER);
		frame.add(buttonPanel1,BorderLayout.SOUTH);
		frame.setVisible(true);
	
		// Boutons
        JButton playButton = createButton("Jouer");
        JButton scoreButton = createButton("Score");
        JButton quitButton = createButton("Quitter");
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();  // quand je click sur "quitter" ca ferme la fenêtre
            }
        });
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0, 10, 0);  // Espacement entre les boutons
        gbc.gridx = 0;

        JPanel menuPanel=new JPanel();
        menuPanel.add(playButton,gbc);
        menuPanel.add(scoreButton,gbc);
        menuPanel.add(quitButton,gbc);
     // on crée des boutons pour chaque niveau
        JPanel levelPanel=new JPanel();
        //levelPanel.setLayout(new GridLayout(3,1));
       // levelPanel.setBackground(Color.gray); 
        JButton level1Button = createButton("Debutant");
        JButton level2Button = createButton("Initié");
        JButton level3Button = createButton("Confié");
        levelPanel.add(level1Button,gbc);
        levelPanel.add(level2Button,gbc);
        levelPanel.add(level3Button,gbc);
        cardPanel.add(menuPanel,"MENU");

        JButton boutonVersionKid = createButton1("Version Kids","C:/Users/rekbi/eclipse-workspace/ProjetColorAddict/photos game/Capture d'écran 2023-10-30 142454.png");
        JButton boutonVersionRectoVerso = createButton1("Version Recto-Verso","C:/Users/rekbi/eclipse-workspace/ProjetColorAddict/photos game/Capture d'écran 2023-10-30 143749.png");
        JButton boutonVersionApéro=createButton1("Version Apéro","C:/Users/rekbi/eclipse-workspace/ProjetColorAddict/photos game/Capture d'écran 2023-10-30 150606.png");
        JButton boutonVersionttB=createButton1("Version Têtes Brulées","C:/Users/rekbi/eclipse-workspace/ProjetColorAddict/photos game/Capture d'écran 2023-10-30 151410.png");
        JButton boutonVersionNormal=createButton1("Version Normal", "C:/Users/rekbi/eclipse-workspace/ProjetColorAddict/photos game/Capture d'écran 2023-10-31 225912.png");
        JPanel versionPanel=new JPanel();
        versionPanel.add(boutonVersionKid);
        versionPanel.add(boutonVersionRectoVerso);
        versionPanel.add(boutonVersionApéro);
        versionPanel.add(boutonVersionttB);
        versionPanel.add(boutonVersionNormal);
      //saisie nom utilisateur
       level1Button.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			askForName();
		}
    	   
       });
        level2Button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				askForName();
			}
        	
        });
        level3Button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				askForName();
			}
        	
        });
        
     
  
        
        
     //pour remplacer les buttons jouer, score,quitter avec la choix de niveaux
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // supprimer les boutons existants du panneau
                buttonPanel1.removeAll();
                menuPanel.setVisible(false);

                // Ajouter les boutons de niveau au panneau
                buttonPanel1.add(levelPanel);

                // Actualiser le panneau pour montrer les nouveaux boutons
                buttonPanel1.revalidate();
                buttonPanel1.repaint();
            }
        });
             
        level1Button.addActionListener(e -> {
            //supprimer les buttons existants :
         	buttonPanel1.removeAll();
         	levelPanel.setVisible(false);
         	//Ajouter les boutons de versions
         	buttonPanel1.add(versionPanel);
         	//Actualiser le panneau pour montrer les nouveaux boutons
         	 buttonPanel1.revalidate();
              buttonPanel1.repaint();
         	
         });
       
        level2Button.addActionListener(e -> {
            //supprimer les buttons existants :
         	buttonPanel1.removeAll();
         	levelPanel.setVisible(false);
         	//Ajouter les boutons de versions
         	buttonPanel1.add(versionPanel);
         	//Actualiser le panneau pour montrer les nouveaux boutons
         	 buttonPanel1.revalidate();
              buttonPanel1.repaint();
         	
         });
        level3Button.addActionListener(e -> {
            //supprimer les buttons existants :
         	buttonPanel1.removeAll();
         	levelPanel.setVisible(false);
         	//Ajouter les boutons de versions
         	buttonPanel1.add(versionPanel);
         	//Actualiser le panneau pour montrer les nouveaux boutons
         	 buttonPanel1.revalidate();
              buttonPanel1.repaint();
         	
         });
        
        frame.add(cardPanel);
        frame.setVisible(true);
        
	}
	
	//  affiche une fenêtre pour demander le nom de l'utilisateur
	private static void askForName() {
	    JFrame inputFrame = new JFrame("Veuillez entrer votre nom");
	    inputFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//ca ferme uniquement la fenetre de nom de l'utilisateur
	    inputFrame.setLayout(new FlowLayout());
	    /*
	     * FlowLayout:il positionne les composants dans l'ordre où ils sont ajoutés, de gauche à droite et de haut en bas, en respectant les préférences de taille des composants
	     */

	    JTextField playerName = new JTextField(20);
	    JButton submitButton = new JButton("Soumettre");

	    inputFrame.add(new JLabel("nom du joueur:"));
	    inputFrame.add(playerName);
	    inputFrame.add(submitButton);

	    submitButton.addActionListener(new ActionListener(){
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            String nomJoueur = playerName.getText();
	            inputFrame.dispose(); // ca ferme la fenêtre après la soumission
	        }
	    });

	    inputFrame.pack();
	    inputFrame.setLocationRelativeTo(null); // pour centrer la fenêtre
	    inputFrame.setVisible(true);
	}

	private static JButton createButton(String text) {
        JButton button = new JButton(text);

        // Style du bouton
        button.setBackground(Color.gray); // couleur de fond du bouton
        button.setForeground(Color.BLACK); // couleur du texte du bouton
        button.setFont(new Font("Arial", Font.BOLD, 18)); // la police et taille
        button.setBorderPainted(false); // pas de bordure
        button.setFocusPainted(false); // pas de focus
        button.setPreferredSize(new Dimension(150, 50)); // taille du bouton

        return button;
    }
	
	private static JButton createButton1(String text, String iconPath) {
	    JButton button = new JButton(text);

	    // Style du bouton
	    button.setBackground(Color.gray); // couleur de fond du bouton
	    button.setForeground(Color.BLACK); // couleur du texte du bouton
	    button.setFont(new Font("Arial", Font.BOLD, 10)); // la police et taille
	    button.setBorderPainted(false); // pas de bordure
	    button.setFocusPainted(false); // pas de focus
	    button.setPreferredSize(new Dimension(150, 50)); // taille du bouton

	    // Ajout de l'icône au bouton
	    if (iconPath != null && !iconPath.isEmpty()) {
	        ImageIcon originalIcon = new ImageIcon(iconPath);
	        Image scaledImage = originalIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH); 
	        ImageIcon scaledIcon = new ImageIcon(scaledImage);
	        button.setIcon(scaledIcon);
	        button.setHorizontalTextPosition(JButton.RIGHT); 
	    }

	    return button;
	}
	
	
  
    
 
    
		
		
		
		
		
	 }



