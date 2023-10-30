import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InterfaceColorAddict {
private static JFrame frame;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Carte carte = new Carte("ROUGE", "blue");

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
		JLabel cardLabel =new JLabel(new ImageIcon("./image/mainmenu.jpg"));
		cardPanel.add(titleLabel);
		cardPanel.add(cardLabel);
		//mettre une photo d'icon
		ImageIcon icon = new ImageIcon("./image/icon.png"); // Remplacez par le chemin de votre image
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
     //pour remplacer les buttons jouer, score,quitter avec la choix de niveaux
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Supprimez les boutons existants du panneau
                buttonPanel1.removeAll();
                menuPanel.setVisible(false);

                // Ajoutez les boutons de niveau au panneau
                buttonPanel1.add(levelPanel);

                // Actualisez le panneau pour montrer les nouveaux boutons
                buttonPanel1.revalidate();
                buttonPanel1.repaint();
            }
        });




        frame.add(cardPanel);
        frame.setVisible(true);
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













	}
