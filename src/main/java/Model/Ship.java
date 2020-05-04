package Model;

public class Ship  implements CommandShip {
    private int[] PositionStart = new int[2];
    private int model;
    private String direction;

    public Ship (int x, int y, int model, String direction){
        setDirection(direction);
        setModel(model);
        setPositionStart(x, y);
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setPositionStart(int x, int y) {
        this.PositionStart[0] = x;
        this.PositionStart[0] = y;

    }

    public int[] getPositionStart() {
        return PositionStart;
    }

    public boolean isOnCoordinate(){
        if(this.PositionStart.length > 0){
            return true;
        }
        return false;
    }

}
