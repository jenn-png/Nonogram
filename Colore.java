package it.itisarezzo.javafx;

public class Colore {
    private double rosso, verde, blu;

    public Colore(double rosso, double verde, double blu) throws IllegalArgumentException {
        if (rosso < 0 || rosso > 1)
            throw new IllegalArgumentException(String.format("Il colore rosso (%.2f) deve essere compreso tra 0.0-1.0", rosso));
        if (verde < 0 || verde > 1)
            throw new IllegalArgumentException(String.format("Il colore verde (%.2f) deve essere compreso tra 0.0-1.0", verde));
        if (blu < 0 || blu > 1)
            throw new IllegalArgumentException(String.format("Il colore blu (%.2f) deve essere compreso tra 0.0-1.0", blu));

        this.rosso = rosso;
        this.verde = verde;
        this.blu = blu;
    }

    public static Colore rgb(int rosso, int verde, int blu) throws IllegalArgumentException {
        controlloRGB(rosso, verde, blu);

        return new Colore(
                rosso / 255.0,
                verde / 255.0,
                blu / 255.0/*,
                opacity*/);
    }

    public static void controlloRGB(int rosso, int verde, int blu) throws IllegalArgumentException {
        if (rosso < 0 || rosso > 255)
            throw new IllegalArgumentException(String.format
                    ("Il parametro rosso del Colore.rgb (%d) si aspetta dei valori compresi fra 0-255", rosso));
        if (verde < 0 || verde > 255)
            throw new IllegalArgumentException(String.format
                    ("Il parametro verde del Colore.rgb (%d) si aspetta dei valori compresi fra 0-255", verde));
        if (blu < 0 || blu > 255)
            throw new IllegalArgumentException(String.format
                    ("Il parametro blu del Colore.rgb (%d) si aspetta dei valori compresi fra 0-255", blu));
    }

    public double getRosso() { return rosso; }
    public double getVerde() { return verde; }
    public double getBlu() { return blu; }

    public int getRossoRGB() { return (int) Math.round(rosso * 255); }
    public int getVerdeRGB() { return (int) Math.round(verde * 255); }
    public int getBluRGB() { return (int) Math.round(blu * 255); }
}

