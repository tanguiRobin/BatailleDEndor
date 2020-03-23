import Vaisseau.AVaisseau;
import Vaisseau.ICible;
import Vaisseau.ICombattant;
import Vaisseau.Impl.MFalcon;
import Vaisseau.Impl.TFighter;

import java.awt.*;

public class TestCombattantCible {
    public static void testConfrontation(ICombattant combattant, ICible cible) {
        System.out.println(" a) - AVANT confrontation ->");
        System.out.println(" Combattant : " + combattant);
        System.out.println(" Cible : " + cible);
        combattant.assault(cible);
        System.out.println(" b) - APRES confrontation ->");
        System.out.println(" Combattant : " + combattant);
        System.out.println(" Cible : " + cible);
    }

    public static void afficherRapportCombattant(AVaisseau v) {
        System.out.println(" c) - RAPPORT d'attaque - " + v);
        System.out.println(" Point attaque : " + v.donnerPointAttaque());
        System.out.println(" Resultat attaque : " + v.donnerResultatAttaque());
        System.out.println(" ( -1 = INDEMNE, 0 = TOUCHE, 1 = DETRUIT) ");
    }

    public static void main(String[] args) {
        System.out.println(" -=- TEST COMBATTANT CIBLE -=- ");
        AVaisseau vaisseauEmpire = new TFighter(new Point(0, 0));
        AVaisseau vaisseauRebelle = new MFalcon(new Point(1, 1));
        System.out.println("1- Le vaisseau de l'Empire attaque :");
        vaisseauEmpire.prendreOrdreAttaque(1, 1);
        testConfrontation(vaisseauEmpire, vaisseauRebelle);
        afficherRapportCombattant(vaisseauEmpire);
        System.out.println("2- Le Rebelle attaque :");
        vaisseauRebelle.prendreOrdreAttaque(1, 1);
        testConfrontation(vaisseauRebelle, vaisseauEmpire);
        afficherRapportCombattant(vaisseauRebelle);
        System.out.println("3- Le vaisseau de l'Empire attaque :");
        vaisseauEmpire.prendreOrdreAttaque(0, 0);
        testConfrontation(vaisseauEmpire, vaisseauRebelle);
        afficherRapportCombattant(vaisseauEmpire);
        System.out.println("4- Le Rebelle attaque :");
        vaisseauRebelle.prendreOrdreAttaque(0, 0);
        testConfrontation(vaisseauRebelle, vaisseauEmpire);
        afficherRapportCombattant(vaisseauRebelle);
    }
}