package assignments.ex2;
// Add your documentation below:

public class CellEntry  implements assignments.ex2.Index2D {

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public int getX() {return Ex2Utils.ERR;}

    @Override
    public int getY() {return Ex2Utils.ERR;}
}