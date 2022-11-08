package Board.Figures;
public interface Piece{
    public int getPositionX();
    public int getPositionY();
    public void setPosition(int x, int y);
    public int getColor(int x);
    public int[] getLegalMoves();
    public boolean getLinearOccupations();
    public boolean getDiagonalOccupations();
}