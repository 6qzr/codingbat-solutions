public class roundSum {
  public int roundSum(int a, int b, int c) {
    return round10(a) + round10(b) + round10(c);
  }

  public int round10(int num) {
    int reminder = num % 10;
    if (reminder >= 5) {
      return num - reminder + 10;
    }
    return num - reminder;
  }
}
