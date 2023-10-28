import java.util.ArrayList;
/**
 * Classe correspondant à un joueur
 */
public class Joueur {
    
    /**
     * Attribut correspondant au nom du joueur
     */
    private String nom;

    /**
     * Attribut correspondant à la carte qu'il a en main
     */
    private Carte main;

    /**
     * Attribut correspondant au total des cartes que possède le joueur
     */
    private ArrayList<Carte> cartes;





    /**
	 * Méthodes basiques
	 * Getteurs et accesseurs ainsi que toString
	 */
	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", main=" + main + ", cartes=" + cartes +"]";
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public Carte getMain() {
		return main;
	}
	public void setMain(Carte main) {
		this.main = main;
	}

    public ArrayList<Carte> cartes(){
        return cartes;
    }
    public void setCartes(ArrayList<Carte> cartes){
        this.cartes = cartes;
    }

}
