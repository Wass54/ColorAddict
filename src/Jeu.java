import java.util.ArrayList;

/**
 * Classe permettant le fonctionnement du jeu en général
 */   
public abstract class Jeu {

	/**
	 * Attribut correspondant aux total des cartes présentes dans le jeu
	 */
	private ArrayList<Carte> listCartes=new ArrayList<Carte>();
	/**
	 * Attribut correspondant aux cartes qui sont déposées sur la table
	 */
	private ArrayList<Carte>cartesTable=new ArrayList<Carte>();


	/**
	 * Constructeur permettant l'instanciation du jeu avec ses cartes 
	 * @param listCartes
	 * @param cartesTable
	 */
	public Jeu(ArrayList<Carte> listCartes, ArrayList<Carte> cartesTable) {
		this.listCartes = listCartes;
		this.cartesTable = cartesTable;
	}

	/**
	 * Classe abstraite donnat le réglement du jeu en général par rapport à chaque difficulté choisie
	 */
	abstract void jouer();




	/**
	 * Méthodes basiques
	 * Getteurs et accesseurs ainsi que toString
	 */
	@Override
	public String toString() {
		return "Jeu [listCartes=" + listCartes + ", cartesTable=" + cartesTable + "]";
	}
	
	
	public ArrayList<Carte> getlistCartes() {
		return listCartes;
	}
	public void setlistCartes(ArrayList<Carte> listCartes) {
		this.listCartes = listCartes;
	}
	public ArrayList<Carte> getCartesTable() {
		return cartesTable;
	}
	public void setCartesTable(ArrayList<Carte> cartesTable) {
		this.cartesTable = cartesTable;
	}
	
	
}
