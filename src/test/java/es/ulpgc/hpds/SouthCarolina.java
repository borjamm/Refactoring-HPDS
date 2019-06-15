package es.ulpgc.hpds;

public class SouthCarolina extends StateBase {
    private double SCTAX = 4;

    @Override
    public double CalculateSalesTax(double price) {
        return price * SCTAX;
    }
}
