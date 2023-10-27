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
	 * Méthode permettant de voir si deux cartes sont égaux.
	 * @param b deuxième carte
	 * @return true si les deux cartes sont de mêmes couleurs sinon false
	 */
	
	public boolean equalsCarte(Carte b){
		if(this.getCouleur().equals(b.getCouleur())){
			return true;
		}else{
			return false;
		}
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
		this.nom = nom;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	  
	   
}
