import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Création des cartes pour chaque situation
		 */
		//Carte joker
		Carte joker = new Carte("Joker", "Joker");
		//Cartes Nom Jaune 
		Carte[] cartesJaunes = {
			new Carte("Jaune", "Jaune"),
			new Carte("Jaune", "Rouge"),
			new Carte("Jaune", "Vert"),
			new Carte("Jaune", "Orange"),
			new Carte("Jaune", "Rose"),
			new Carte("Jaune", "Noir")
		};
		//Carte Nom Rouge
		Carte[] cartesRouge = {
			new Carte("Rouge", "Jaune"),
			new Carte("Rouge", "Rouge"),
			new Carte("Rouge", "Vert"),
			new Carte("Rouge", "Orange"),
			new Carte("Rouge", "Rose"),
			new Carte("Rouge", "Noir")
		};
		//Carte Nom Vert
		Carte[] cartesVert = {
			new Carte("Vert", "Jaune"),
			new Carte("Vert", "Rouge"),
			new Carte("Vert", "Vert"),
			new Carte("Vert", "Orange"),
			new Carte("Vert", "Rose"),
			new Carte("Vert", "Noir")
		};
		//Carte Nom Orange
		Carte[] cartesOrange = {
			new Carte("Orange", "Jaune"),
			new Carte("Orange", "Rouge"),
			new Carte("Orange", "Vert"),
			new Carte("Orange", "Orange"),
			new Carte("Orange", "Rose"),
			new Carte("Orange", "Noir")
		};
		//Carte Nom Rouge
		Carte[] cartesRose = {
			new Carte("Rose", "Jaune"),
			new Carte("Rose", "Rouge"),
			new Carte("Rose", "Vert"),
			new Carte("Rose", "Orange"),
			new Carte("Rose", "Rose"),
			new Carte("Rose", "Noir")
		};
		//Carte Nom Rouge
		Carte[] cartesNoir = {
			new Carte("Noir", "Jaune"),
			new Carte("Noir", "Rouge"),
			new Carte("Noir", "Vert"),
			new Carte("Noir", "Orange"),
			new Carte("Noir", "Rose"),
			new Carte("Noir", "Noir")
		};
		

		ArrayList<Carte> listeCartes = new ArrayList<Carte>();
		listeCartes.add(joker);
		listeCartes.addAll(Arrays.asList(cartesJaunes));
		listeCartes.addAll(Arrays.asList(cartesRouge));
		listeCartes.addAll(Arrays.asList(cartesVert));
		listeCartes.addAll(Arrays.asList(cartesOrange));
		listeCartes.addAll(Arrays.asList(cartesRose));
		listeCartes.addAll(Arrays.asList(cartesNoir));

		Collections.shuffle(listeCartes);

		System.out.println(listeCartes);

	    //Debutant jeu = new Debutant(Collections.shuffle(listeCartes), );


		
	}

}
