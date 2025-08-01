public class countX {
  public int countX(String str) {
    if (str.length() == 0) return 0;
    if (str.substring(0, 1).equals("x")) {
      return 1 + countX(str.substring(1, str.length()));
    }
    return countX(str.substring(1, str.length()));
  }
}
