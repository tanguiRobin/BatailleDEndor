package Belligerant;

import Vaisseau.AVaisseau;
import Vaisseau.ICombattant;

import java.util.ArrayList;
import java.util.List;

public abstract class ABelligerant implements IForteresse, IAssaillant {
    private String mCamp;
    private List<AVaisseau> mFlotte = new ArrayList<>();

    protected ABelligerant(String pNomCamp) {
        mCamp = pNomCamp;
    }

    public String campDeRalliement() {
        return this.getCamp();
    }

    public String etatFlotte() {
        int lNbAlive = 0;
        for (AVaisseau lVaisseau :
                this.getFlotte()) {
            if (lVaisseau.isAlive())
                lNbAlive++;
        }
        return Integer.toString(lNbAlive);
    }

    @Override
    public void leadAssault(IForteresse pForteresse) {
        pForteresse.endureAssault(this.getFlotte());
    }

    @Override
    public int endureAssault(List<? extends ICombattant> pFlotte) {
        int nbAlive = 0;
        for (ICombattant lCombattant : pFlotte) {
            for (AVaisseau lCible : this.getFlotte()) {
                lCombattant.assault(lCible);
                if (lCible.isAlive()) {
                    nbAlive++;
                }
            }
        }
        return nbAlive;
    }

    public String getCamp() {
        return mCamp;
    }

    public void setCamp(String pCamp) {
        mCamp = pCamp;
    }

    public List<AVaisseau> getFlotte() {
        return mFlotte;
    }

    @Override
    public String toString() {
        StringBuilder lSb = new StringBuilder();

        lSb.append("Détail du belligérant '" + this.getCamp() + "' ");
        lSb.append("(" + this.etatFlotte() + " vaisseau(x) opérationnel(s)\n");
        for (AVaisseau lVaisseau : this.getFlotte()) {
            lSb.append("    " + lVaisseau + "\n");
        }
        lSb.append("Fin du détail");

        return lSb.toString();
    }
}
