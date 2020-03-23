package Vaisseau.Impl;

import Vaisseau.AVaisseau;

import java.awt.*;

public class DVTFighter extends AVaisseau {
    private static final String DVTFIGHTERMODEL = "Dark Vador T-Fighter";
    private static final short DVTFIGHTERPOWER = 8;
    private static final short DVTFIGHTERDEFENSE = 10;

    public DVTFighter() {
        this(new Point((int) (Math.random() * 10), (int) (Math.random() * 10)));
    }

    public DVTFighter(Point pPosition) {
        super(DVTFIGHTERMODEL, pPosition, DVTFIGHTERPOWER, DVTFIGHTERDEFENSE);
    }
}
