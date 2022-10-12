import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal bigDecimal) {
        BigDecimal bigDecimal1 = new BigDecimal("100000");
        if (bigDecimal.compareTo(bigDecimal1)<0) {
            return valueOf(0.1).multiply(bigDecimal);
        } else {
            return valueOf(0.15).multiply(bigDecimal);
        }
    }
}
