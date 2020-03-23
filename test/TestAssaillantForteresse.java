import Belligerant.ABelligerant;
import Belligerant.IAssaillant;
import Belligerant.IForteresse;
import Belligerant.Impl.CAllianceRebelle;
import Belligerant.Impl.CEmpireGalactique;
import Vaisseau.Impl.MFalcon;
import Vaisseau.Impl.XWing;

public class TestAssaillantForteresse {
    public static void main(String[] args) {
        IForteresse f = new CEmpireGalactique();
        IAssaillant a = new CAllianceRebelle();
        int nbAssauts = 0;
        ((CEmpireGalactique) f).getFlotte().add(new XWing());
        ((CAllianceRebelle) a).getFlotte().add(new MFalcon());
        ((CAllianceRebelle) a).getFlotte().add(new MFalcon());
        ((CAllianceRebelle) a).getFlotte().add(new MFalcon());
        int nbCibles;

        do {
            System.out.println("-------DEBUT ASSAUT---------");
            System.out.println("Assaillant avant assaut : " + a);
            System.out.println("Forteresse avant assaut : " + f);
            a.leadAssault(f);
            System.out.println("Assaillant après assaut : " + a);
            System.out.println("Forteresse après assaut : " + f);
            System.out.println("----- -- FIN ASSAUT---------");
            nbCibles = Integer.parseInt(((ABelligerant) f).etatFlotte());
            nbAssauts++;
        } while (nbCibles > 0);
        System.out.println("NB ASSAUTS = " + nbAssauts);
    }
}