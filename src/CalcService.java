public class CalcService {

  public int calculate(int year, int creditAmount, double bet) {
    int month = year * 12;
    double monthlyBet = bet / month / 100;

    double annuitPay = monthlyBet * ((Math.pow((1 + monthlyBet), month) / ((Math.pow((1 + monthlyBet), month) - 1))));

    int monthlyPay = (int) (creditAmount  * annuitPay);
    return monthlyPay;
  }


}
