import java.math.BigDecimal;


public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal bigDecimal) {

        if (bigDecimal.compareTo(new BigDecimal("100000"))<0) {
           return bigDecimal.multiply(new BigDecimal("0.10"));
        } else {
            return bigDecimal.multiply(new BigDecimal("0.15")) ;
        }
    }
}
