package Vaisseau.Impl;

import Vaisseau.AVaisseau;

import java.awt.*;
import java.util.Random;

public class TFighter extends AVaisseau {
    private static final String TFIGHTERMODEL = "T-Fighter";
    private static final short TFIGHTERPOWER = 2;
    private static final short TFIGHTERDEFENSE = 4;

    public TFighter() {
        this(new Point((int) (Math.random() * 10), (int) (Math.random() * 10)));
    }

    public TFighter(Point pPosition){
        super(TFIGHTERMODEL, pPosition, TFIGHTERPOWER, TFIGHTERDEFENSE);
    }
}
