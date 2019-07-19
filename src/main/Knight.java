package main;

public class Knight implements ChessPiece {
    int color;
    char file;
    int rank;

    public Knight(int color)
    {
        this.color = color;
    }
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
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
}
