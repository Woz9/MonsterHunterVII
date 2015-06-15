package personnage;

import java.util.ArrayList;
import java.util.List;


import objets.MainDroite;
import objets.Equipement;
import objets.MainGauche;
import objets.Objets;
import objets.Vetement;

public class PJ extends Personnage {

	private int force ;
	private int adresse;
	private int resistance;
	private List<Objets> inventaire;
	private Equipement equipement;
	String skin1 = "ressources/sprite/people/soldier_altcolor.png";
	String skin2 = "ressources/sprite/people/princess.png";
	int posX;
	int posY;
	
	
	public PJ() {
		super();
		this.force = 0;
		this.adresse = 0;
		this.resistance = 0;
		this.inventaire = new ArrayList<Objets>();
		this.equipement = new Equipement();
	}
	
	public PJ(String nom,int PV, int PX, int force, int adresse, int resistance, Niveaux initiative, Niveaux attaque, Niveaux esquive, Niveaux defense, Niveaux degats, List<Objets> inventaire, Equipement equipement){
		super(nom, PV, PX,initiative, attaque, esquive, defense, degats);
		this.force = force;
		this.adresse = adresse;
		this.resistance = resistance;
		this.inventaire = inventaire;
		this.equipement = equipement;
	}
	
	public Niveaux calcEncombrementTotal(){
		Niveaux encombrementTotal = new Niveaux();
		int x, y;
		for(int i=0; i<this.equipement.getV().length; i++){
			x = encombrementTotal.getNbD();
			y = encombrementTotal.getUA();
			encombrementTotal.setNbD(x + this.equipement.getUnV(i).getEncombrement().getNbD());
			encombrementTotal.setUA(y + this.equipement.getUnV(i).getEncombrement().getUA());
		}
		return encombrementTotal;
	}
	
	public Niveaux calcArmureTotal(){
		Niveaux armureTotal = new Niveaux();
		int x, y;
		for(int i=0; i<this.equipement.getV().length; i++){
			x = armureTotal.getNbD();
			y = armureTotal.getUA();
			armureTotal.setNbD(x + this.equipement.getUnV(i).getArmure().getNbD());
			armureTotal.setUA(y + this.equipement.getUnV(i).getArmure().getUA());
		}
		return armureTotal;
	}
	
	public void calcCapacites(){
		Niveaux forceN = new Niveaux(this.force);
		Niveaux adresseN = new Niveaux(this.adresse);
		Niveaux resistanceN = new Niveaux(this.resistance);
		this.initiative.setNbD(adresseN.getNbD() - this.calcEncombrementTotal().getNbD());
		this.initiative.setUA(adresseN.getUA() - this.calcEncombrementTotal().getUA());
		this.attaque.setNbD(adresseN.getNbD() + this.equipement.getMainD().getManiabiliteArme().getNbD());
		this.attaque.setUA(adresseN.getUA() + this.equipement.getMainD().getManiabiliteArme().getUA());
		this.esquive.setNbD(adresseN.getNbD() - this.calcEncombrementTotal().getNbD());
		this.esquive.setUA(adresseN.getUA() - this.calcEncombrementTotal().getUA());
		this.defense.setNbD(resistanceN.getNbD() + this.calcArmureTotal().getNbD());
		this.defense.setUA(resistanceN.getUA() + this.calcArmureTotal().getUA());
		this.degats.setNbD(forceN.getNbD() + this.equipement.getMainD().getImpactArme().getNbD());
		this.degats.setUA(forceN.getUA() + this.equipement.getMainD().getImpactArme().getUA());
	}
	
	public void afficheInventaire(){
		System.out.println("\nInventaire\n");
		for(int i=0; i<this.inventaire.size(); i++){
			System.out.println("\n" + this.inventaire.get(i).toString() + "\n");
		}
	}
	
	public void setForce(int force){
		this.force = force;
	}
	public void setAdresse(int adresse){
		this.adresse = adresse;
	}
	public void setResistance(int resistance){
		this.resistance = resistance;
	}
	public void setUnObjet(Objets o){
		this.inventaire.add(o);
	}
	public void setUnObjetV(Vetement v){
		this.inventaire.add(v);
	}
	public void setUnObjetMainD(MainDroite m){
		this.inventaire.add(m);
	}
	public void setUnObjetMainG(MainGauche m){
		this.inventaire.add(m);
	}
	public void enleverUnObjet(Objets o){
		this.inventaire.remove(o);
	}
	public void setUnV(Vetement v, int position){
		this.equipement.setUnV(v ,position);
	}
	
	public void setMainD(MainDroite m){
		this.equipement.setMainD(m);
	}
	public void setMainG(MainGauche m){
		this.equipement.setMainG(m);
	}
	public void setEquipement(Equipement e){
		this.equipement = e;
	}
	public void setSkin1(String s){
		this.skin1 = s;
	}
	public void setSkin2(String s){
		this.skin2 = s;
	}
	public void setPosX(int x){
		this.posX = x;
	}
	public void setPosY(int y){
		this.posY = y;
	}
	
	public int getForce(){
		return this.force;
	}
	public int getAdresse(){
		return this.adresse;
	}
	public int getResistance(){
		return this.resistance;
	}
	public boolean contientUnObjet(Objets o){
		return this.inventaire.contains(o);
	}
	public List<Objets> getInventaire(){
		return this.inventaire;
	}
	public Vetement getUnV(int position, String type){
		type = this.equipement.getUnV(position).getType();
		return this.equipement.getUnV(position);
	}
	
	public MainDroite getMainDroite(String type){
		type = this.equipement.getMainD().getType();
		return this.equipement.getMainD();
	}
	
	public MainGauche getMainGauche(String type){
		type = this.equipement.getMainG().getType();
		return this.equipement.getMainG();
	}
	
	public Equipement getEquipement(){
		return this.equipement;
	}
	
	public String getSkin1(){
		return this.skin1;
	}
	
	public String getSkin2(){
		return this.skin2;
	}
	
	public int getPosX(){
		return this.posX;
	}
	
	public int getPosY(){
		return this.posY;
	}

	public String toString(){
		return super.toString() + "\n\nForce : " + this.force + "\n\nAdresse : " + this.adresse + "\n\nResistance : " + this.resistance;
	}
}
