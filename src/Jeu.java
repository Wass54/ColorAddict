import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Collections;
/**
 * Classe permettant le fonctionnement du jeu en général
 */   
public abstract class Jeu {

	/**
	 * Attribut correspondant à une pile et qui fait réf. au total des cartes présentes dans le jeu
	 */
	protected Stack<Carte> listeCartes;
	/**
	 * Attribut correspondant à une pile et qui fait référence aux cartes qui sont déposées au centre de la table
	 */
	protected Stack<Carte> cartesTable;
	/**
	 * Attribut correspondant aux joueurs qui sont présents dans le jeu
	 */
	protected ArrayList<Joueur> joueurs;
	
	/**
	 * Attribut permettant de savoir y a eu cb de tours 
	 */
	protected int nbTours = 0;

	


	/**
	 * Constructeur permettant l'instanciation du jeu avec ses cartes 
	 * @param cartesTable
	 * @param joueurs
	 */
	public Jeu(Stack<Carte> cartesTable, ArrayList<Joueur> joueurs) {
		this.listeCartes = remplissageCarte();
		this.cartesTable = cartesTable;
		this.joueurs = joueurs;
	}

	/**
	 * Méthode abstraite donnant le réglement du jeu en général par rapport à chaque difficulté choisie
	 */
	abstract void jouer();

	/**
	 * Méthode permettant au joueur de jouer
	 * @param joueur
	 */
	abstract void jouerTour(Joueur joueur);


	/**
	 * Méthode abstraite permettant l'arret du jeu
	 * @return true si un joueur n'a plus de carte donc arrete la partie si tout le monde a des cartes encore retourne false
	 */
	public boolean stop(){
		boolean res = false;
		for(int i = 0; i < joueurs.size(); i++){
			if(joueurs.get(i).getMain().isEmpty()){
				res = true;
			}
		}
		return res;
	}

	/**
	 * Méthode permettant de remplir le jeu avec des cartes tout en étant mélangé 
	 * afin de plus facilement donner les cartes aux joueurs
	 * @return une pile de cartes mélangées
	 */
	public abstract Stack<Carte> remplissageCarte();

	/**
	 * Méthode permettant de poser une carte au centre de la table
	 * @param carte
	 */
	public void ajouterCarteSurTable(Carte carte){
		cartesTable.push(carte);
	}

	/**
	 * permet de mélanger une liste de carte
	 * @param listeCartes
	 * @return
	 */
	public Stack<Carte> melangerCartes(Stack<Carte> listeCartes){
		Collections.shuffle(listeCartes);
		return listeCartes;
	}



	/**
	 * Méthodes basiques
	 * Getteurs et accesseurs ainsi que toString
	 */
	@Override
	public String toString() {
		return "Jeu [listeCartes=" + listeCartes + ", cartesTable=" + cartesTable + "]";
	}
	
	
	public Stack<Carte> getlisteCartes() {
		return listeCartes;
	}
	public void setlisteCartes(Stack<Carte> listeCartes) {
		this.listeCartes = listeCartes;
	}

	public Stack<Carte> getCartesTable() {
		return cartesTable;
	}
	public void setCartesTable(Stack<Carte> cartesTable) {
		this.cartesTable = cartesTable;
	}

	public ArrayList<Joueur> getJoueurs() {
		return joueurs;
	}
	public void setJoueurs(ArrayList<Joueur> joueurs) {
		this.joueurs = joueurs;
	}
	
	
}
