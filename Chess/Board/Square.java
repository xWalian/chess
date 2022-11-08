package Board;

public class Square {
    int x;
    int y;
    String color;
    String piece;
    Square(){
        x = 0;
        y = 0;
        color = "";
        piece = "";
    };
    public String getColor(){
        return color;
    };
    // public int getOccupyingPiece(){

    // };
    // public boolean isOccupied(){

    // };
    public int getXNum(){
        return x;
    };
    public int getYNum(){
        return y;
    };
    public void put(){

    };
    public void removePiece(){

    };
    public void capture(){

    };
    public void paintComponent(){

    };
    
}
