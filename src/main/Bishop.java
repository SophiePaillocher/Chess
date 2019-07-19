package main;

public class Bishop implements ChessPiece {
    private int color;

    public Bishop(int color)
    {
        this.color = color;
    }

    @Override
    public Square[] possibility() {
        return new Square[0];
    }

    @Override
    public boolean move(char file, int rank) {
        return false;
    }

    @Override
    public boolean isThreatened() {
        return false;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }


}
