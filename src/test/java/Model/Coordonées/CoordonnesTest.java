package Model.Coordonées;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordonnesTest {

    @Test
    void getAbscisse() {
        Coordonnes coordonnes = new Coordonnes(4,5);
        assertEquals(4,coordonnes.getAbscisse());
    }

    @Test
    void getOrdonnee() {
        Coordonnes coordonnes = new Coordonnes(4,5);
        assertEquals(5,coordonnes.getOrdonnee());
    }

    @Test
    void testEquals() {
        Coordonnes coordonnes = new Coordonnes(4,5);
        Coordonnes coordonnes2 = new Coordonnes(4,5);
        assertEquals(true, coordonnes.equals(coordonnes2));
    }
}
