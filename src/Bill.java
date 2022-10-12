import java.math.BigDecimal;

class Bill {
    private BigDecimal bigDecimal;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(BigDecimal bigDecimal, TaxType taxType, TaxService taxService) {
        this.bigDecimal = bigDecimal;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        // TODO вместо 0.0 посчитать размер налога исходя из TaxType
        BigDecimal taxAmount = taxType.calculateTaxFor(bigDecimal);

        taxService.payOut(taxAmount);
    }
}