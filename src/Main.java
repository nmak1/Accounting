import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                new Bill(new BigDecimal("12000.56"),new IncomeTaxType(), taxService ) ,
                new Bill(new BigDecimal("150000.56") , new VATaxType() , taxService) ,
                new Bill( new BigDecimal("196000.65") , new ProgressiveTaxType() , taxService)

                // TODO создать платежи с различным типами налогообложения
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }

    }
}
