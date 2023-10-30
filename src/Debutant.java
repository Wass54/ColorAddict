import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Debutant extends Jeu{
    
    public Debutant(Stack<Carte> cartesTable, ArrayList<Joueur> joueurs) {
		super(cartesTable, joueurs);
	}


    public void jouer(){
        if (joueurs.size() == 2) {
            Joueur joueur1 = joueurs.get(0);
            Joueur joueur2 = joueurs.get(1);

            while(super.stop() != true){
                super.nbTours++;
                System.out.println("Tour joueur 1" + joueur1.toString());
                jouerTour(joueur1);
                if(super.stop()) break;

                System.out.println("Tour joueur 2" + joueur2.toString());
                jouerTour(joueur2);
                if(super.stop()) break;

            }

        }
    }

    public void jouerTour(Joueur joueur){
        
    }



    /**
     * pour le mode débutant on remplit qu'avec des ROUGE, BLEU, JAUNE et VERT
     * @return une liste de carte mélangée pr les distribuer aux joueurs
     */
    public ArrayList<Carte> remplissageCarte(){
		//Carte joker
		Carte[] joker = {
			new Carte("Joker", "Joker")
		};
 		//Cartes Nom Jaune 
		Carte[] cartesJaune = {
			new Carte("Jaune", "Jaune"),
			new Carte("Jaune", "Rouge"),
			new Carte("Jaune", "Vert"),
			new Carte("Jaune", "Bleu")
		};
		//Carte Nom Rouge
		Carte[] cartesRouge = {
			new Carte("Rouge", "Jaune"),
			new Carte("Rouge", "Rouge"),
			new Carte("Rouge", "Vert"),
			new Carte("Rouge", "Bleu")
		};
		//Carte Nom Vert
		Carte[] cartesVert = {
			new Carte("Vert", "Jaune"),
			new Carte("Vert", "Rouge"),
			new Carte("Vert", "Vert"),
			new Carte("Vert", "Bleu")
		};
        //Carte Nom Bleu
		Carte[] cartesBleu = {
			new Carte("Bleu", "Jaune"),
			new Carte("Bleu", "Rouge"),
			new Carte("Bleu", "Vert"),
			new Carte("Bleu", "Bleu")
		};

		ArrayList<Carte> listeCartes = new ArrayList<Carte>();
		for(int i = 0; i < 3; i++){
			listeCartes.addAll(Arrays.asList(joker));
			listeCartes.addAll(Arrays.asList(cartesJaune));
			listeCartes.addAll(Arrays.asList(cartesRouge));
			listeCartes.addAll(Arrays.asList(cartesVert));
            listeCartes.addAll(Arrays.asList(cartesBleu));
		}

		return super.melangerCartes(listeCartes);
	}

}
