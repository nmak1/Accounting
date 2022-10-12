import java.math.BigDecimal;

public class IncomeTaxType extends TaxType{

    @Override
    public BigDecimal calculateTaxFor(BigDecimal bigDecimal) {
        return bigDecimal.multiply(new BigDecimal("0.13")) ;
    }

}
