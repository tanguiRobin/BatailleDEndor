package Vaisseau;

import java.awt.*;

public interface ICible {
    public static final int MISSED = -1;
    public static final int TOUCHED = 0;
    public static final int DESTROYED = 1;


    int defend(Point pPosition, short pPower);
}
