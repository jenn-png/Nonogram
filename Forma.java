package it.itisarezzo.javafx;

import javax.management.InvalidAttributeValueException;

public abstract class Forma {
    private int x0, y0, lunghezzaLinea;
    private Colore tratto;

    public Forma(int x0, int y0, int lunghezzaLinea, Colore tratto) {
        this.x0 = x0;
        this.y0 = y0;
        this.lunghezzaLinea = lunghezzaLinea;
        this.tratto = tratto;
    }

    public void setX0(int x0) { this.x0 = x0; }
    public void setY0(int y0) { this.y0 = y0; }
    public void setTratto(Colore tratto) { this.tratto = tratto; }


    public int getX0() { return x0; }
    public int getY0() { return y0; }
    public int getLunghezzaLinea() { return lunghezzaLinea; }
    public Colore getTratto() { return tratto; }

    public void setLunghezzaLinea(int lunghezzaLinea) throws InvalidAttributeValueException {
        if (lunghezzaLinea <= 0){
            throw new InvalidAttributeValueException();
        }

        this.lunghezzaLinea = lunghezzaLinea;
    }

}
