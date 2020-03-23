package Vaisseau;

import java.awt.*;
import java.util.Random;

public abstract class AVaisseau implements ICible, ICombattant {
    private String mModele;
    private Point mPosition;
    private short mPower;
    private short mDefense;

    private Point mCibleL10n;

    protected AVaisseau(String pModele, Point pPosition, short pPower, short pDefense) {
        mModele = pModele;
        mPosition = pPosition;
        mPower = pPower;
        mDefense = pDefense;
    }

    public Point getCibleL10n() {
        return mCibleL10n;
    }

    public void setCibleL10n(Point pCibleL10n) {
        mCibleL10n = pCibleL10n;
    }

    public void prendreOrdreAttaque(int pX, int pY){
        mCibleL10n = new Point(pX,pY);
    }

    @Override
    public int defend(Point pPosition, short pPower) {
        int lRes = MISSED;
        if(this.getPosition().equals(pPosition)){
            this.setDefense((short) (this.getDefense() - pPower));
            lRes = (this.getDefense() <= 0 ? DESTROYED : TOUCHED);
        }
        return lRes;
    }

    @Override
    public void assault(ICible pCible) {
        if(this.isAlive()) {
            final int lEtatCible = pCible.defend(this.getCibleL10n, this.getPower());
        }
    }

    public String getModele() {
        return mModele;
    }

    public void setModele(String pModele) {
        mModele = pModele;
    }

    public Point getPosition() {
        return mPosition;
    }

    public void setPosition(Point pPosition) {
        mPosition = pPosition;
    }

    public short getPower() {
        return mPower;
    }

    public void setPower(short pPower) {
        mPower = pPower;
    }

    public short getDefense() {
        return mDefense;
    }

    public void setDefense(short pDefense) {
        mDefense = pDefense;
    }

    public boolean isAlive(){
        return mDefense > 0;
    }

    @Override
    public String toString() {
        return "Vaisseau{ " +
                "modele: '"+ getModele() +"', " +
                "force: "+ getPower() +", " +
                "defense: "+ getDefense() +", " +
                "position: ["+ getPosition().getX() +","+ getPosition().getY() +"] } " +
                (isAlive() ? "Est operationnel":"N'est pas operationnel");
    }
}
