package es.ulpgc.hpds;

public class Alabama extends StateBase{
    private double ALTAX = 1.0;

    @Override
    public double CalculateSalesTax(double price) {
        return price*ALTAX;
    }
}
