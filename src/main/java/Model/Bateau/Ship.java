package Model.Bateau;

import Model.Coordonées.Coordonnes;
import Model.Coordonées.Direction;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Coordonnes> coordonnes;
    private int taille;
    private Direction direction;

    public Ship(Coordonnes Position, int taille, Direction direction){
        this.coordonnes = new ArrayList<Coordonnes>();
        this.coordonnes.add(startPosition);
        this.taille = taille;
        setAllCoodinate(direction);
    }

    private void setAllCoodinate(Direction direction){
        int Abscisse = this.coordonnes.get(0).getAbscisse();
        int Ordonnee = this.coordonnes.get(0).getOrdonnee();

        for (int i=1; i<this.taille; i++){
            switch (direction){
                case HAUT : this.coordonnes.add(new Coordonnes(Abscisse , Ordonnee - i));
                    break;
                case BAS:  this.coordonnes.add(new Coordonnes(Abscisse , Ordonnee + i));
                    break;
                case GAUCHE:  this.coordonnes.add(new Coordonnes(Abscisse - i , Ordonnee));
                    break;
                case DROITE:  this.coordonnes.add(new Coordonnes(Abscisse + i , Ordonnee));
                    break;
            }
        }

    }

    public boolean isOnCoordinate(Coordonnes coordonnee) {
        return this.coordonnes.contains(coordonnee);
    }

}
