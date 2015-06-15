package objets;

import personnage.Niveaux;
import personnage.PJ;

public class Vetement extends Objets{
	private String type;
	private Niveaux encombrement;
	private Niveaux armure;
	
	public Vetement(){
		super();
		this.type = "Non renseigné";
		this.encombrement = new Niveaux();
		this.armure = new Niveaux();
	}
	
	public Vetement(String nom, String type, Niveaux encombrement, Niveaux armure){
		super(nom);
		this.type = type;
		this.encombrement = encombrement;
		this.armure = armure;
	}
	
	
	public void utiliserUnV(PJ p, Vetement v, int position){
		String s = "";
		Vetement vide = new Vetement();
		if(v.equals(p.getUnV(position, s))){
			p.setUnObjetV(v);
			p.setUnV(vide, position);
		}
		else if( s != "Non renseigné"){
			p.setUnObjet(p.getUnV(position, s));
			p.setUnV(v, position);
		}
		else
			p.setUnV(v, position);
	}
	public void utiliser(PJ p){
		switch(this.type){
		case "Casque" :
			this.utiliserUnV(p, this, 0);break;
		case "Torse" :
			this.utiliserUnV(p, this, 1);break;
		case "Gants" :
			this.utiliserUnV(p, this, 2);break;
		case "Jambières" :
			this.utiliserUnV(p, this, 3);break;
		case "Bottes" :
			this.utiliserUnV(p, this, 4);break;
		}
		p.calcCapacites();
	}
	
	public void setType(String type){
		this.type = type;
	}
	public void setEncombrement(Niveaux encombrement){
		this.encombrement = encombrement;
	}
	public void setArmure(Niveaux armure){
		this.armure = armure;
	}
	
	public String getType(){
		return this.type;
	}
	public Niveaux getEncombrement(){
		return this.encombrement;
	}
	public Niveaux getArmure(){
		return this.armure;
	}
	
	public String toString(){
		return super.toString() + "\nType : " + this.type + "\nEncombrement : " + this.encombrement + "\nArmure : " + this.armure;
	}
}
