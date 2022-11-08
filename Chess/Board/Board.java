package Board;
public class Board {
    Square place[][] = new Square[8][8];
    Square sq[] = new Square[64];
    int piece;
    int turn;
    public Board(){
        int x=0;
        for (int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){
                place[i][j] = sq[x++];
            }
        }
    };
    public void initializePieces(){
        for (int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){
                if(i < 2){
                    place[i][j].color = "white";
                    place[i][j].x = i;
                    place[i][j].y = j;
                    if(i == 1){
                        place[i][j].piece = "Pawn";
                    }
                    if(i == 0){
                        if(j == 0 || j == 7){
                            place[i][j].piece = "rook";
                        }
                        if(j == 1 || j == 6){
                            place[i][j].piece = "knight";
                        }
                        if(j == 2 || j == 5){
                            place[i][j].piece = "bishop";
                        }
                        if(j == 3){
                            place[i][j].piece = "queen";
                        }
                        if(j == 4){
                            place[i][j].piece = "King";
                        }
                    }
                } else if ( i > 5){
                    place[i][j].color = "black";
                    sq[i].x = i;
                    sq[j].y = j;
                    if(i == 6){
                        place[i][j].piece = "pawn";
                    }
                    if(i == 7){
                        if(j == 0 || j == 7){
                            place[i][j].piece = "rook";
                        }
                        if(j == 1 || j == 6){
                            place[i][j].piece = "knight";
                        }
                        if(j == 2 || j == 5){
                            place[i][j].piece = "bishop";
                        }
                        if(j == 3){
                            place[i][j].piece = "queen";
                        }
                        if(j == 4){
                            place[i][j].piece = "King";
                        }
                    }
                } else {
                    sq[i].x = i;
                    sq[j].y = j;
                }
            }
        }
    };
    public void getSquareArray(){
        for (int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){
                System.out.println(place[i][j].getColor());
                System.out.println(place[i][j].getXNum());
                System.out.println(place[i][j].getYNum());
            }
        }
    };
    public int getTurn(){
        return turn;
    };
    public void setCurrPiece(int x){
        piece = x;
    };
    public int getCurrPiece(){
        return piece;
    };
    public static void main(){
        Board x = new Board();
        x.initializePieces();
        x.getSquareArray();
    }
}

