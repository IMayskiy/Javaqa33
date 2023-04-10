public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum;
        double pr;
        int month;

        System.out.println();
        System.out.println("Eжемесячный платеж составит: ");
        System.out.println(service.calculate(sum = 1_000_000, pr = 9.99, month = 12));
        System.out.println("на срок " + month + " месяцев");

        System.out.println();
        System.out.println("Eжемесячный платеж составит: ");
        System.out.println(service.calculate(sum = 1_000_000, pr = 9.99, month = 24));
        System.out.println("на срок " + month + " месяцев");

        System.out.println();
        System.out.println("Eжемесячный платеж составит: ");
        System.out.println(service.calculate(sum = 1_000_000, pr = 9.99, month = 36));
        System.out.println("на срок " + month + " месяцев");

    }
}