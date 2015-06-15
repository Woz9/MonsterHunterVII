package objets;

public class Equipement {
	private Vetement[] v;
	private MainDroite mainD;
	private MainGauche mainG;
	
	public Equipement(){
		this.v = new Vetement[5];
		for(int i=0; i<v.length; i++){
			v[i] = new Vetement();
		}
		this.mainD = new MainDroite();
		this.mainG = new MainGauche();
	}
	
	public Equipement(Vetement[] v, MainDroite mainD, MainGauche mainG){
		this.v = v;
		this.mainD = mainD;
		this.mainG = mainG;
	}
			
	public void setUnV(Vetement v, int position){
		this.v[position] = v;
	}
	public void setV(Vetement[] v){
		this.v = v;
	}
	public void setMainD(MainDroite mainD){
		this.mainD = mainD;
	}
	public void setMainG(MainGauche mainG){
		this.mainG = mainG;
	}
	
	public Vetement getUnV(int position){
		return this.v[position];
	}
	public Vetement[] getV(){
		return this.v;
	}
	public MainDroite getMainD(){
		return this.mainD;
	}
	public MainGauche getMainG(){
		return this.mainG;
	}
	
	public void afficheEquipement(){
		System.out.println("\nVetements :");
		for (int i=0; i<this.v.length; i++){
			System.out.println("\n" + this.v[i].toString() + "\n");
		}
		System.out.println(mainD.toString() + mainG.toString());
	}
}
