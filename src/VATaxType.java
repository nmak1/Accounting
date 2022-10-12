import java.math.BigDecimal;

public class VATaxType extends TaxType{
    @Override
    public BigDecimal calculateTaxFor(BigDecimal bigDecimal) {
        return BigDecimal.valueOf(0.18).multiply(bigDecimal);
    }
}
