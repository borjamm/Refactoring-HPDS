package es.ulpgc.hpds;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculateSalesTax_{

    @Test
    public void calculate_sales_tax_of_kentucky(){
        assertThat(new CalculateSales().CalculateSalesTax("KY",30)).isEqualTo(90.0);
    }

    @Test
    public void calculate_sales_tax_of_alabama(){
        assertThat(new CalculateSales().CalculateSalesTax("AL",50)).isEqualTo(50.0);
    }

    @Test
    public void calculate_sales_tax_of_georgia(){
        assertThat(new CalculateSales().CalculateSalesTax("GA",10)).isEqualTo(20.0);
    }

    @Test
    public void calculate_sales_tax_of_southCarolina(){
        assertThat(new CalculateSales().CalculateSalesTax("SC",25)).isEqualTo(100.0);
    }


    public static class CalculateSales {
        public double CalculateSalesTax(String state, double price) {
            StateBase activeState = Factory.CreateState(state);
            return activeState.CalculateSalesTax(price);
        }
    }

}
