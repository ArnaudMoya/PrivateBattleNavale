package Model.Bateau;
import Model.Bateau.Ship;


import java.util.ArrayList;
import java.util.List;

public class Flotte {
    private List<Ship> flotte = new ArrayList<>();

    public boolean addFlotteBoat(Ship ship){
        if(flotte.size() > 0 && flotte.size() <=5){
            flotte.add(ship);
        }
        return true;
    }
}
