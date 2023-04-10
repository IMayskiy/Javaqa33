public class CreditPaymentService {
    public double calculate(int sum, double pr, int month) {

        //ЕП = С × ПС × (1 + ПС)ⁿ / ((1 + ПС)ⁿ – 1), где
        //ЕП – размер ежемесячного платежа,
        //С – сумма займа,
        //ПС – месячная ставка по займу в долях от единицы, которая вычисляется по формуле: годовая ставка / 12 мес. / 100%,
        //n – срок кредита (в месяцах).

        double pm = pr / 100 / 12; //месячная ставка
        double kf = pm * (Math.pow(1 + pm, month)) / ((Math.pow(1 + pm, month) - 1)); //коэффициент
        double monthPayment = sum * kf; // расчет ежемесячного платежа

        return (int) monthPayment;
    }

}