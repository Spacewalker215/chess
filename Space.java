public class Space {
    private final char FILE; // column number
    private final byte RANK; //row number
    private final String COLOR;
    private Piece piece = null;

    //Making a constructor class so final has a value
    public Space(char file, byte rank, String color){
        FILE = file;
        RANK = rank;
        COLOR = color;
    }
}
