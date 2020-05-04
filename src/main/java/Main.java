import Model.Ship;

public class Main {

    public static void main(String[] args) {
        Ship ship = new Ship(4,2,4,"Droite");
        System.out.println(ship.getDirection());
        System.out.println(ship.getModel());
        System.out.println(ship.getPositionStart());
        System.out.println(ship.isOnCoordinate());
    }
}
