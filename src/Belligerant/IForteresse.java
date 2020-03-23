package Belligerant;

import Vaisseau.ICombattant;

import java.util.List;

public interface IForteresse {
    int endureAssault(List<? extends ICombattant> pFlotte);
}
