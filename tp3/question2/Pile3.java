package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Vector;

/**
 * Décrivez votre classe PileVector ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile3 implements PileI {

    private Vector<Object> v;

    public Pile3() {
        this(0);
    }

    public Pile3(int taille) {
        if (taille <= 0) {
            taille = PileI.CAPACITE_PAR_DEFAUT;
        }
        v = new Vector<>(taille);
    }

    public void empiler(Object o) throws PilePleineException {
                if (estPleine()) {
            throw new PilePleineException();
        }
        v.add(o);
    }

    public Object depiler() throws PileVideException {
        if (estVide()) {
            throw new PileVideException();
        }
        int lastIndex = v.size() - 1;
        Object element = v.elementAt(lastIndex);
        v.removeElementAt(lastIndex);
        return element;
    }

    public Object sommet() throws PileVideException {
        if (estVide()) {
            throw new PileVideException();
        }
        return v.elementAt(v.size() - 1);
    }

    public int taille() {
        return v.size();
    }

    public int capacite() {
        // à compléter
         return v.capacity();
    }

    public boolean estVide() {
          return v.isEmpty();
    }

    public boolean estPleine() {
        return v.size() == v.capacity();
    }

 public String toString() {
        StringBuilder s = new StringBuilder("[");
        for (int i = v.size() - 1; i >= 0; i--) {
            s.append(v.elementAt(i));
            if (i > 0)
                s.append(", ");
        }
        s.append("]");
        return s.toString();
    }


	public boolean equals(Object o) {
	if(! (o instanceof PileI) ) return false;
        PileI op = (PileI)o;
        if(op.taille() != this.taille()) return false;
        if(op.capacite() != this.capacite()) return false;
        
        return op.toString().equals(this.toString());
        
	}

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

}
