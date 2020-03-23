package Vaisseau.Impl;

import Vaisseau.AVaisseau;

import java.awt.*;

public class MFalcon extends AVaisseau {
    private static final String MFALCONMODEL = "Millenium Falcon";
    private static final short MFALCONPOWER = 8;
    private static final short MFALCONDEFENSE = 10;

    public MFalcon() {
        this(new Point((int) (Math.random() * 10), (int) (Math.random() * 10)));
    }

    public MFalcon(Point pPosition) {
        super(MFALCONMODEL, pPosition, MFALCONPOWER, MFALCONDEFENSE);
    }
}
