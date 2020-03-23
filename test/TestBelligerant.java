import Belligerant.ABelligerant;
import Belligerant.Impl.CAllianceRebelle;
import Belligerant.Impl.CEmpireGalactique;
import Vaisseau.AVaisseau;
import Vaisseau.Impl.MFalcon;
import Vaisseau.Impl.TFighter;
import Vaisseau.Impl.XWing;

import java.awt.*;

public class TestBelligerant {
    public static void tester(ABelligerant b) {
        System.out.println(" - Belligerant - ");
        System.out.println("Camp de ralliement : "+b.campDeRalliement());
        System.out.println("Vaisseaux opérationnels : "+b.etatFlotte());
        System.out.println(b);
    }
    public static void main(String[] args) {
        System.out.println(" -=- TEST BELLIGERANT -=- ");
        CEmpireGalactique empire = new CEmpireGalactique();
        CAllianceRebelle alliance = new CAllianceRebelle();
        AVaisseau[] lVaisseaux = new AVaisseau[6];
        alliance.getFlotte().add(new XWing());
        alliance.getFlotte().add(new TFighter());
        alliance.getFlotte().add(new MFalcon());
        alliance.getFlotte().add(new XWing(new Point(1, 2)));
        alliance.getFlotte().add(new TFighter(new Point(3, 4)));
        alliance.getFlotte().add(new MFalcon(new Point(5, 6)));
        tester(empire);
        tester(alliance);
    }
}