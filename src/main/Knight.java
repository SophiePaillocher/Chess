package main;

public class Knight implements ChessPiece {
    int color;
    char file;
    int rank;

    public Knight(int color, char file, int rank)
    {
        this.color = color;
        this.file = file;
        this.rank = rank;
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