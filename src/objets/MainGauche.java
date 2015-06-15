package objets;

import personnage.PJ;

public class MainGauche extends Objets{
	private String type;
	
	public MainGauche(){
		super();
		this.type = "Non renseigné";
	}
	
	public MainGauche(String nom, String type){
		super(nom);
		this.type = type;
	}
	public void utiliser(PJ p) {
		String s = "";
		MainDroite vide = new MainDroite();
		if(this == p.getEquipement().getMainG()){
			p.setUnObjetMainG(this);
			p.setMainD(vide);
		}
		else if( s != "Non renseigné"){
			p.setUnObjet(p.getEquipement().getMainD());
			p.setMainG(this);
			p.enleverUnObjet(this);
		}
		else{
			p.setMainG(this);
			p.enleverUnObjet(this);
		}
	}
	
	public String getType(){
		return this.type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
}
