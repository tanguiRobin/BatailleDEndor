import Vaisseau.AVaisseau;
import Vaisseau.Impl.MFalcon;
import Vaisseau.Impl.TFighter;
import Vaisseau.Impl.XWing;

import java.awt.*;

public class TestVaisseau {
    private AVaisseau[] Vaisseaux;

    public TestVaisseau() {
        Vaisseaux = new AVaisseau[6];
        Vaisseaux[0] = new XWing();
        Vaisseaux[1] = new TFighter();
        Vaisseaux[2] = new MFalcon();
        Vaisseaux[3] = new XWing(new Point(1, 2));
        Vaisseaux[4] = new TFighter(new Point(3, 4));
        Vaisseaux[5] = new MFalcon(new Point(5, 6));
    }

    public static void main(String[] args) {
        System.out.println(" -=- TEST AVaisseau -=-");
        TestVaisseau test = new TestVaisseau();
        test.testVaisseaux();
    }

    public void testVaisseaux() {
        for (int i = 0; i < Vaisseaux.length; i++) {
            AVaisseau AVaisseau = Vaisseaux[i];
            System.out.println(AVaisseau);/*System.out.print(AVaisseau.toString())*/
        }
    }
}