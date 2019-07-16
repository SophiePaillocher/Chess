package main;

public interface ChessPiece {


    /*
    retourne la liste des cases sur lesquelles la pièce peut être déplacée
     */
    Square[] possibility();

    /*
    déplace la pièce à la position donnée en entrée
    retourne true si le déplacement est possible (il est alors réalisé), false sinon
     */
    boolean move(char file , int rank);

    /*
    indique si la pièce est menacée par une pièce de l'adversaire
     */
    boolean isThreatened();


}