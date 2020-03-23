package Vaisseau.Impl;

import Vaisseau.AVaisseau;

import java.awt.*;

public class BWing extends AVaisseau {
    private static final String BWINGMODEL = "B-Wing";
    private static final short BWINGPOWER = 6;
    private static final short BWINGDEFENSE = 8;

    public BWing() {
        this(new Point((int) (Math.random() * 10), (int) (Math.random() * 10)));
    }

    public BWing(Point pPosition){
        super(BWINGMODEL, pPosition, BWINGPOWER, BWINGDEFENSE);
    }
}
