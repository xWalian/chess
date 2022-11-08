package Board.Figures;
public class Pawn implements Piece{
    private int color;
    private int position[];
    private int moves[];
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
    public int[] getLegalMoves(){
        
        
        return moves;
    };
    public boolean getLinearOccupations(){

    };
    public boolean getDiagonalOccupations(){

    };
    public void Move(){

    }
}