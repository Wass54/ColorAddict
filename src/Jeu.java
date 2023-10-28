import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;
/**
 * Classe permettant le fonctionnement du jeu en général
 */   
public abstract class Jeu {

	/**
	 * Attribut correspondant au total des cartes présentes dans le jeu
	 */
	private ArrayList<Carte> listeCartes;
	/**
	 * Attribut correspondant aux cartes qui sont déposées au centre de la table
	 */
	private Stack<Carte> cartesTable;
	/**
	 * Attribut correspondant aux joueurs qui sont présents dans le jeu
	 */
	private ArrayList<Joueur> joueurs;


	/**
	 * Constructeur permettant l'instanciation du jeu avec ses cartes 
	 * @param listeCartes
	 * @param cartesTable
	 */
	public Jeu(ArrayList<Carte> listeCartes, Stack<Carte> cartesTable, ArrayList<Joueur> joueurs) {
		this.listeCartes = listeCartes;
		this.cartesTable = cartesTable;
		this.joueurs = joueurs;
	}

	/**
	 * Méthode abstraite donnant le réglement du jeu en général par rapport à chaque difficulté choisie
	 */
	abstract void jouer();


	/**
	 * Méthode abstraite permettant l'arret du jeu
	 * @return true si un joueur n'a plus de carte donc arrete la partie si tout le monde a des cartes encore retourne false
	 */
	public boolean stop(){
		boolean res = false;
		for(int i = 0; i < joueurs.size(); i++){
			if(joueurs.get(i).getCartes().isEmpty()){
				res = true;
			}
		}
		return res;
	}

	/**
	 * permet de melanger les cartes
	 */
	public void melangerCartes(){
		Collections.shuffle(this.listeCartes);
	}

	/**
	 * Méthode permettant de poser une carte au centre de la table
	 * @param carte
	 */
	public void ajouterCarteSurTable(Carte carte){
		cartesTable.push(carte);
	}




	/**
	 * Méthodes basiques
	 * Getteurs et accesseurs ainsi que toString
	 */
	@Override
	public String toString() {
		return "Jeu [listeCartes=" + listeCartes + ", cartesTable=" + cartesTable + "]";
	}
	
	
	public ArrayList<Carte> getlisteCartes() {
		return listeCartes;
	}
	public void setlisteCartes(ArrayList<Carte> listeCartes) {
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
