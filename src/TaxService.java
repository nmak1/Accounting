import java.math.BigDecimal;

public class TaxService {
    public void payOut(BigDecimal bigDecimal) {
        System.out.format("Уплачен налог в размере %.2f%n", bigDecimal);
    }
}
