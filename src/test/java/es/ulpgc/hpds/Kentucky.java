package es.ulpgc.hpds;

public class Kentucky extends StateBase {
    private double KYTAX = 3.0;

    @Override
    public double CalculateSalesTax(double price) {
        return price * KYTAX;
    }
}
