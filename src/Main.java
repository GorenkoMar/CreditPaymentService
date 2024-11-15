//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    CalcService service = new CalcService();
    int creditAmount = 1_000_000;
    int year = 1;
    double bet = 9.99;
    int monthlyPay = service.calculate(year, creditAmount, bet);

    System.out.println("Ежемесячный платеж = " + monthlyPay);
  }

}