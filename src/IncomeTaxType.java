import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_FLOOR;
import static java.math.BigDecimal.valueOf;

public class IncomeTaxType extends TaxType{
    @Override
    public BigDecimal calculateTaxFor(BigDecimal bigDecimal) {
        return bigDecimal.multiply(valueOf(0.13)) ;
    }
}
