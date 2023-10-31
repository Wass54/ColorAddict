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
     */
    public Joueur(String nom,ArrayList<Carte> main){
        this.nom = nom;
        this.main = main;
    }

    /**
	 * Méthode permettant de piocher une carte 
	 * @param listeCartes
	 */
	public void piocherCarte(Stack<Carte> listeCartes){
        if(main.size() < 3){
            main.add(listeCartes.peek());
            listeCartes.pop();
        }else{
            System.out.println("Erreur: Votre main contient déjà 3 cartes" +
                         "impossible d'en piocher une autre!");
        }
	}

    /**
     * Méthode permettant de jouer une carte de sa Main
     * @param cartesTable
     * @param niveau
     * @return true si la carte a été jouée
     */
    public boolean jouerCarteMain(Stack<Carte> cartesTable, String niveau){
        Carte tmp = cartesTable.peek();
        boolean res = false;

        //ne pas oublier dans l'interface, quand l'utilisateur il choisit une carte Joker de lui demander il veut passer à quelle couleur ensuite dans le code changer le setCouleur de la carte Joker

        if (niveau.equals("Debutant")){
            for(int i = 0; i < main.size(); i++){
                if(main.get(i).getNom().equals(tmp.getNom()) || main.get(i).getCouleur().equals(tmp.getCouleur()) 
                || main.get(i).getNom().equals("Joker")){
                    System.out.println("Le joueur joue la carte: " + main.get(i));
                    cartesTable.push(main.get(i));
                    main.remove(i);
                    res = true;
                }else{
                    System.out.println("Le joueur n'a aucuen carte à jouer, il pioche une carte");
                }
            }


        }else if(niveau.equals("Initie")){
            System.out.println("A implementer");
        }else if(niveau.equals("Confirme")){
            System.out.println("A implementer");
        }


        return res;
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
