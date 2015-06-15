package objets;

import personnage.PJ;

public abstract class Objets {
	protected String nom;
	
	public Objets(){
		this.nom = "Innomé";
	}
	
	public Objets(String nom){
		this.nom = nom;
	}
	
	public abstract void utiliser(PJ p);
	
	public void setNom(String nom){
		this.nom = nom;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public String toString(){
		return "Nom : " + this.nom;
	}
}
