package parking_lot.helpers;

public class CoordinateHelper {
   private final double row;
   private final double col;
   public CoordinateHelper(double row, double col){
       this.row=row;
       this.col=col;
   }

    public double getRow() {
        return row;
    }

    public double getCol() {
        return col;
    }
}
