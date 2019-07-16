package main;

/*
Les cases del'échiquier
 */
public class Square {

    /*
    couleur de la case : 0 si blanc et 1 sinon ------> à modifier
     */
    private int color ;

    /*
    numéro de ligne de la case : compris entre 1 et 8
     */
    private int rank;

    /*
    numéro de colonne dela case : compris entre a et h
     */
    private char file;

    /*
    occupation de la case : nom de la pièce si occupée, empty sinon
     */
    ChessPiece occupation;

    /*
    Constructeur : crée une case en fonction de ses coordonnées
     */
    public Square(char file, int rank){
        this.rank = rank;
        this.file = file;
    }

    public boolean isOnTheBoard(){
        return (rank > 0 & 9 > rank & file >= 'a' & file<='h');
    }

}
