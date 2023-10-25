package Carte;

import java.util.ArrayList;

public abstract class Jeu {

	private ArrayList<Carte> listCartes=new ArrayList<Carte>();
	private ArrayList<Carte>cartesTable=new ArrayList<Carte>();
	public Jeu(ArrayList<Carte> listCrtes, ArrayList<Carte> cartesTable) {
	
		
		this.listCartes = listCrtes;
		this.cartesTable = cartesTable;
	}
	abstract void jouer();
	@Override
	public String toString() {
		return "Jeu [  listCrtes=" + listCartes + ", cartesTable=" + cartesTable + "]";
	}
	
	
	public ArrayList<Carte> getListCrtes() {
		return listCartes;
	}
	public void setListCrtes(ArrayList<Carte> listCrtes) {
		this.listCartes = listCrtes;
	}
	public ArrayList<Carte> getCartesTable() {
		return cartesTable;
	}
	public void setCartesTable(ArrayList<Carte> cartesTable) {
		this.cartesTable = cartesTable;
	}
	
	
}
