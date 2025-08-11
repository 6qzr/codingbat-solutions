public class makeBricks {
  int maxBigUsed = Math.min(big, goal / 5);
  int remainder = goal - (maxBigUsed * 5);
  return small >= remainder;
}
