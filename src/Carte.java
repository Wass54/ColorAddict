package Carte;

public class Carte {
	  private String nom;
	  private String couleur;
	 public Carte(String nom, String couleur) {
	        this.nom = nom;
	        this.couleur=couleur;
	    }
	@Override
	public String toString() {
		return "Carte [nom=" + nom + ", couleur=" + couleur + "]";
	}

	  
	   
}
