package File1;

import java.util.ArrayList;

public class Targets {
    public ArrayList<Cell> cells;

    public Targets() {
        cells=new  ArrayList<Cell>();
    }
    public void addCell(int x,int y){
        Cell cell=new Cell(x,y);
        cells.add(cell);
    }

}
