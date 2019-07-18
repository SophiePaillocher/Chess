package main;

public class Pawn implements ChessPiece {
    int color;
    char file;
    int rank;

    public Pawn(int color, char file, int rank)
    {
        this.color = color;
        this.file = file;
        this.rank = rank;
    }
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public char getFile() {
        return file;
    }

    public void setFile(char file) {
        this.file = file;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
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
