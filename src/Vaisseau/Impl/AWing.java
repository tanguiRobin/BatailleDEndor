package Vaisseau.Impl;

import Vaisseau.AVaisseau;

import java.awt.*;

public class AWing extends AVaisseau {
    private static final String AWINGMODEL = "A-Wing";
    private static final short AWINGPOWER = 2;
    private static final short AWINGDEFENSE = 2;

    public AWing() {
        this(new Point((int) (Math.random() * 10), (int) (Math.random() * 10)));
    }

    public AWing(Point pPosition){
        super(AWINGMODEL, pPosition, AWINGPOWER, AWINGDEFENSE);
    }
}
