import java.util.ArrayList;

/**
 * Classe permettant le fonctionnement du jeu en général
 */   
public abstract class Jeu {

	/**
	 * Attribut correspondant aux total des cartes présentes dans le jeu
	 */
	private ArrayList<Carte> listeCartes = new ArrayList<Carte>();
	/**
	 * Attribut correspondant aux cartes qui sont déposées sur la table
	 */
	private ArrayList<Carte> cartesTable = new ArrayList<Carte>();


	/**
	 * Constructeur permettant l'instanciation du jeu avec ses cartes 
	 * @param listeCartes
	 * @param cartesTable
	 */
	public Jeu(ArrayList<Carte> listeCartes, ArrayList<Carte> cartesTable) {
		this.listeCartes = listeCartes;
		this.cartesTable = cartesTable;
	}

	/**
	 * Méthode abstraite donnant le réglement du jeu en général par rapport à chaque difficulté choisie
	 */
	abstract void jouer();


	/**
	 * Méthode abstraite permettant l'arret du jeu
	 */
	abstract void stop();




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
	public ArrayList<Carte> getCartesTable() {
		return cartesTable;
	}
	public void setCartesTable(ArrayList<Carte> cartesTable) {
		this.cartesTable = cartesTable;
	}
	
	
}
