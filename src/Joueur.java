import java.util.ArrayList;
import java.util.Stack;
/**
 * Classe correspondant à un joueur
 */
public class Joueur {
    
    /**
     * Attribut correspondant au nom du joueur
     */
    private String nom;

    /**
     * Attribut correspondant aux cartes à sa main
     */
    private ArrayList<Carte> main;


    /**
     * Constructeur permettant d'instancier un joueur
     * @param nom
     * @param main
     * @param cartes
     */
    public Joueur(String nom,ArrayList<Carte> main){
        this.nom = nom;
        this.main = main;
    }

    /**
	 * Méthode permettant de piocher une carte 
	 * @param listeCartes
	 */
	public void piocherCarte(ArrayList<Carte> listeCartes){
        if(main.size() < 3){
            main.add(listeCartes.get(0));
        }else{
            System.out.println("Erreur: Votre main contient déjà 3 cartes" +
                         "impossible d'en piocher une autre!");
        }
	}

    /**
     * Méthode permettant de jouer une carte de sa Main
     * @param cartesTable
     */
    public void jouerCarteMain(Stack<Carte> cartesTable){
        Carte tmp = cartesTable.peek();

        for(int i = 0; i < main.size(); i++){
            if(main.get(i).getNom().equals(tmp.getNom()) || main.get(i).getCouleur().equals(tmp.getCouleur())){
                cartesTable.push(main.get(i));
                main.remove(i);
            }
        }


    }


    /**
	 * Méthodes basiques
	 * Getteurs et accesseurs ainsi que toString
	 */
	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", main=" + main + "]";
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Carte> getMain() {
		return main;
	}
	public void setMain(ArrayList<Carte> main) {
		this.main = main;
	}

}
