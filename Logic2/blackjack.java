public class blackjack {
  public int blackjack(int a, int b) {
    if (a > 21 && b > 21) return 0;
    if (a <= 21 && b > 21) {
      return a;
    }
    if (a <= 21 && Math.abs(a - 21) < Math.abs(b - 21)) {
      return a;
    }
    return b;
  }
}
