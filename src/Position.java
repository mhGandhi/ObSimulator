public class Position {
    public int x;
    public int y;
    public int z;

    public Position(){
        this(0,0,0);
    }

    public Position(int pX,int pY, int pZ) {
        this.x = pX;
        this.y = pY;
        this.z = pZ;
    }

    public static Position none() {
        return new Position();
    }

    public Position added(Position pPos) {
        return new Position(this.x+pPos.x,this.y+pPos.y,this.z+pPos.z);
    }

    @Override
    public String toString() {
        return "["+x+"|"+y+"|"+z+"]";
    }
}
