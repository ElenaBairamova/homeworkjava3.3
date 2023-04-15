public class CreditPaymentService {

    public int calculate(int amount, double percent, int year) {
        double percentMont = (percent/1200);
        double payment;
        payment = (double) ((percentMont*(Math.pow((1+percentMont),year*12)))/((Math.pow((1+percentMont), year*12))-1))*amount;
        return (int) payment;
    }

}
