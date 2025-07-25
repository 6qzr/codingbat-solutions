public class startHi {
  public boolean startHi(String str) {
    if (str.length() <= 1) return false;
    return "hi".equals(str.substring(0, 2));
  }
}
