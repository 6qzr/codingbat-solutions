public class count8 {
  public int count8(int n) {
    if (n == 0) return 0;
    if (n % 10 == 8) {
      int newN = n / 10;
      if (newN % 10 == 8) {
        return 2 + count8(n / 10);
      }
      return 1 + count8(n / 10);
    }
    return count8(n / 10);
  }
}
