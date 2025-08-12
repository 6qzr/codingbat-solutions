public class evenlySpaced {
  public boolean evenlySpaced(int a, int b, int c) {
    if ((a == b) && b == c) return true;
    int large = Math.max(Math.max(a, b), c);
    int small = Math.min(Math.min(a, b), c);
    int mid = 0;
    if (a != large && a != small) mid = a;
    if (b != large && b != small) mid = b;
    if (c != large && c != small) mid = c;
    return large - mid == mid - small; 
  }
}
