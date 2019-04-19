package File1;

import java.util.ArrayList;

public class Target {
    public ArrayList<Cell> cells;

    public Target() {
        cells=new  ArrayList<Cell>();
    }
    public void addCell(int x,int y){
        Cell cell=new Cell(x,y);
        cells.add(cell);
    }
    
}
