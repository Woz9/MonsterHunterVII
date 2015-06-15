package objets;

import personnage.Niveaux;
import personnage.PJ;

public class MainDroite extends Objets {
	private String type;
	private Niveaux maniabiliteArme;
	private Niveaux impactArme;
	private int portee;
		
	public MainDroite(){
		this.type = "Non renseigné";
		this.maniabiliteArme = new Niveaux();
		this.impactArme = new Niveaux();
		this.portee = 0;
	}
	
	public MainDroite(String nom, String type, Niveaux maniabiliteArme, Niveaux impactArme){
		super(nom);
		this.type = type;
		this.maniabiliteArme = maniabiliteArme;
		this.impactArme = impactArme;
	}
	
	public void utiliserMainD(PJ p){
		String s = "";
		MainDroite vide = new MainDroite();
		if(this == p.getEquipement().getMainD()){
			p.setUnObjetMainD(this);
			p.setMainD(vide);
		}
		else if( s != "Non renseigné"){
			p.setUnObjet(p.getEquipement().getMainD());
			p.setMainD(this);
			p.enleverUnObjet(this);
		}
		else{
			p.setMainD(this);
			p.enleverUnObjet(this);
		}
	}
	
	public void utiliser(PJ p){
		switch(this.type){
		case "Épée" :
			this.utiliserMainD(p);break;
		case "Arc" :
			this.utiliserMainD(p);break;
		}
		p.calcCapacites();
	}
	
	public void setType(String type){
		this.type = type;
	}
	public void setManiabiliteArme(Niveaux maniabiliteArme){
		this.maniabiliteArme = maniabiliteArme;
	}
	public void setImpactArme(Niveaux impactArme){
		this.impactArme = impactArme;
	}
	public void setPortee(int portee){
		this.portee = portee;
	}
	
	public String getType(){
		return this.type;
	}
	public Niveaux getManiabiliteArme(){
		return this.maniabiliteArme;
	}
	public Niveaux getImpactArme(){
		return this.impactArme;
	}
	public int getPortee(){
		return this.portee;
	}
	
	public String toString(){
		return super.toString() + "\nType : " + this.type + "\nManiabilité : " + this.maniabiliteArme + "\nImpact : " + this.impactArme + "\n Portee : " + this.portee;
	}
}
