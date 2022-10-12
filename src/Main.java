public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                new Bill(12000.42,new IncomeTaxType(), taxService ) ,
                new Bill(150000.56 , new VATaxType() , taxService) ,
                new Bill(96000.65 , new ProgressiveTaxType() , taxService)

                // TODO создать платежи с различным типами налогообложения
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }

    }
}
