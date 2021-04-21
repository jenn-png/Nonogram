package it.itisarezzo.javafx;

public class Segmento extends Forma {
    private int x1, y1;

    public Segmento(int x0, int y0, int x1, int y1) throws IllegalArgumentException {
        this(x0, y0, x1, y1, 1, Colore.rgb(150, 102, 123));
    }

    public Segmento(int x0, int y0, int x1, int y1, int lunghezzaLinea, Colore tratto) throws IllegalArgumentException {
        super(x0, y0, lunghezzaLinea, tratto);

        this.x1 = x1;
        this.y1 = y1;
    }


    public void setX1(int x1) { this.x1 = x1; }

    public void setY1(int y1) { this.y1 = y1; }

    public int getX1() { return x1; }

    public int getY1() { return y1; }
}
