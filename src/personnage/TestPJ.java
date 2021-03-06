package personnage;

import objets.MainDroite;
import objets.Vetement;

public class TestPJ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			PJ p = new PJ();
			Niveaux n = new Niveaux(1, 1);
			p.setNom("Gerry");
			p.setForce(10);
			p.setAdresse(10);
			p.setResistance(10);
			p.calcCapacites();
			System.out.println(p.toString());
			Vetement v = new Vetement("Haume de Gueurre","Casque",n,n);
			v.utiliser(p);
			MainDroite a = new MainDroite("Épée du divin","Épée",n,n);
			a.utiliser(p);
			System.out.println(p.toString());
			p.getEquipement().afficheEquipement();
			v.utiliser(p);
			a.utiliser(p);
			p.getEquipement().afficheEquipement();
			p.afficheInventaire();
			System.out.println(p.toString());
	}

}

