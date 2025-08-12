public class makeChocolate {
  public int makeChocolate(int small, int big, int goal) {
    int maxBigUsed = Math.min(big, goal / 5);
    int remainder = goal - (maxBigUsed * 5);
    if (small >= remainder) {
      return remainder;
    }
    return -1;
  }
}
