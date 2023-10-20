package examenFA2223ETU;

public enum Carte {
    AS("As"), JOKER("Joker"), ROI("Roi"), DAME("Dame");

    private final String asString;

    private Carte(String s) {
	asString = s;
    }

    public String toString() {
	return asString;
    }
}