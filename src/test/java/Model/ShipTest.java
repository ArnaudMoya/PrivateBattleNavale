package Model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    @Test
    void getDirection() {
        Ship ship = new Ship(4,2,4,"Droite");
        assertEquals("Droite",ship.getDirection());
    }

    @Test
    void setDirection() {
        Ship ship = new Ship(4,2,4,"Droite");
        ship.setDirection("Gauche");
        assertEquals("Gauche",ship.getDirection());
    }

    @Test
    void getModel() {
        Ship ship = new Ship(4,2,4,"Droite");
        assertEquals(4,ship.getModel());
    }

    @Test
    void setModel() {
        Ship ship = new Ship(4,2,4,"Droite");
        ship.setModel(2);
        assertEquals(2,ship.getModel());
    }

    /*@Test
    void setPositionStart() {
        Ship ship = new Ship(4,2,4,"Droite");
        assertEquals(int[],ship.getDirection());
    }

    @Test
    void getPositionStart() {
        Ship ship = new Ship(4,2,4,"Droite");
        assertEquals("Droite",ship.getDirection());
    }

     */

    @Test
    void isOnCoordinate() {
        Ship ship = new Ship(4,2,4,"Droite");
        assertEquals(true,ship.isOnCoordinate());
    }
}
