public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int pay = service.calculate(1_000_000, 9.99, 3);
        System.out.println("Ежемесячный платеж " + pay);
    }
}
