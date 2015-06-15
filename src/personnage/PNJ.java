package personnage;

public class PNJ extends Personnage{
	
	String skin = "ressources/sprite/monsters/bat.png";
	int pnjPosX;
	int pnjPosY;
	
	public PNJ(){
		super();
	}
	
	public PNJ(String nom, int PV, int PX, Niveaux initiative, Niveaux attaque, Niveaux esquive, Niveaux defense, Niveaux degats){
		super(nom, PV, PX, initiative, attaque, esquive, defense, degats);
	}
	
	public void setSkin(String s){
		this.skin = s;
	}
	public void setPnjPosX(int x){
		this.pnjPosX=x;
	}
	public void setPjPosY(int y){
		this.pnjPosY = y;
	}
	
	
	public String getSkin(){
		return this.skin;
	}
	public int getPnjPosX(){
		return this.pnjPosX;
	}
	public int getPnjPosY(){
		return this.pnjPosY;
	}
}
