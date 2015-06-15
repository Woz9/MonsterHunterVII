package personnage;

public abstract class Personnage {
	
	protected String nom;
	protected int PV;
	protected int PX;
	
	
	protected Niveaux initiative;
	protected Niveaux attaque;
	protected Niveaux esquive;
	protected Niveaux defense;
	protected Niveaux degats;
	
	public Personnage(){
		this.nom = "Innomé";
		this.PV = 100;
		this.PX = 0;
		this.initiative = new Niveaux();
		this.attaque = new Niveaux();
		this.esquive = new Niveaux();
		this.defense = new Niveaux();
		this.degats = new Niveaux();
	}
	
	public Personnage(String nom, int PV, int PX, Niveaux initiative, Niveaux attaque, Niveaux esquive, Niveaux defense, Niveaux degats){
		this.nom = nom;
		this.PV = PV;
		this.PX = PX;
		this.initiative = initiative;
		this.esquive = esquive;
		this.attaque = esquive;
		this.defense = defense;
		this.degats = degats;
	}
	
	public int attaquer(Personnage adversaire){
		if(adversaire.esquive.score() < this.attaque.score()){
			if(adversaire.defense.score() < this.degats.score()){
				int diff = this.degats.score() - this.defense.score();
				return diff/3;
			}
			else
				return -1;
		}
		else
			return -1;
	}
	
	public void experience(){
		
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	public void setPV(int PV){
		this.PV = PV;
	}
	public void setPX(int PX){
		this.PX = PX;
	}
	public void setInitiative(Niveaux initiative){
		this.initiative = initiative;
	}
	public void setAttaque(Niveaux attaque){
		this.attaque = attaque;
	}
	public void setDefense(Niveaux defense){
		this.defense = defense;
	}
	public void setDegats(Niveaux degats){
		this.degats = degats;
	}
	
	public String getNom(){
		return this.nom;
	}
	public int getPV(){
		return this.PV;
	}
	public int getPX(){
		return this.PX;
	}
	public Niveaux getInitiative(){
		return this.initiative;
	}
	public Niveaux getEsquive(){
		return this.esquive;
	}
	public Niveaux getAttaque(){
		return this.attaque;
	}
	public Niveaux getDefense(){
		return this.defense;
	}
	public Niveaux getDegats(){
		return this.degats;
	}
	
	public String toString(){
		return "Nom : " + this.nom + "\n\nPV : " + this.PV + "\n\nPX : " + this.PX +"\n\nInitiative : " + this.initiative + "\n\nAttaque : " + this.attaque + "\n\nEsquive : " + this.esquive + "\n\nDefense : " + this.defense + "\n\nDegats : " + this.degats;
	}
}
