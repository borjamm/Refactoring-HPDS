package es.ulpgc.hpds;

public class Georgia extends StateBase {
    private double GATAX = 2;

    @Override
    public double CalculateSalesTax(double price) {
        return price * GATAX;
    }
}
