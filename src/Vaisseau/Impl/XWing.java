package Vaisseau.Impl;

import Vaisseau.AVaisseau;

import java.awt.*;

public class XWing extends AVaisseau {
    private static final String XWINGMODEL = "X-Wing";
    private static final short XWINGPOWER = 4;
    private static final short XWINGDEFENSE = 2;

    public XWing() {
        this(new Point((int) (Math.random() * 10), (int) (Math.random() * 10)));
    }

    public XWing(Point pPosition){
        super(XWINGMODEL, pPosition, XWINGPOWER, XWINGDEFENSE);
    }
}
