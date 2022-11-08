package Board.Figures;
public class Rook implements Piece{
    private int color;
    private int position[];
    public int getPositionX(){
        return position[0];
    };
    public int getPositionY(){
        return position[1];
    };
    public void setPosition(int x, int y){
        position[0] = x;
        position[1] = y;
    };
    public int getColor(int x){
        return color;
    };
    public void Move(int pos[]){

    };
}