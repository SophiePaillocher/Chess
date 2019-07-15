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

}
