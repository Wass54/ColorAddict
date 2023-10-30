import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

	    //Debutant jeu = new Debutant(Collections.shuffle(listeCartes), );

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

		Stack<Carte> listeCartes = new Stack<Carte>();
		for(int i = 0; i < 3; i++){
			listeCartes.addAll(Arrays.asList(joker));
			listeCartes.addAll(Arrays.asList(cartesJaune));
			listeCartes.addAll(Arrays.asList(cartesRouge));
			listeCartes.addAll(Arrays.asList(cartesVert));
            listeCartes.addAll(Arrays.asList(cartesBleu));
		}

		Collections.shuffle(listeCartes);
		ArrayList<Carte> main = new ArrayList<>();
		System.out.println(listeCartes);
		main.add(listeCartes.peek());
		System.out.println("--------------------");
		System.out.println(listeCartes);
		System.out.println("--------------------");
		System.out.println(main);
		
	}

}
