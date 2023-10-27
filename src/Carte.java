/**
 * Classe correspondant à une carte
 */
public class Carte {

	/**
	 * Attribut correspondant au nom d'une carte (ex : JAUNE, ROUGE, VERT, ORANGE, ROSE, NOIR, JOKER)
	 */
	private String nom;
	/**
	 * Attribut correspondant au nom d'une carte (ex : JAUNE, ROUGE, VERT, ORANGE, ROSE, NOIR, JOKER)
	 */
	private String couleur;

	/**
	 * Constructeur permettant d'instancier une carte
	 * @param nom
	 * @param couleur
	 */
	public Carte(String nom, String couleur) {
	    this.nom = nom;
	    this.couleur=couleur;
	}



	/**
	 * Méthodes basiques
	 * Getteurs et accesseurs ainsi que toString
	 */
	@Override
	public String toString() {
		return "Carte [nom=" + nom + ", couleur=" + couleur + "]";
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.listCartes = nom;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = nom;
	}

	  
	   
}
