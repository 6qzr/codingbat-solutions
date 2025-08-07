public class nestParen {
  public boolean nestParen(String str) {
    if (str.isEmpty()) return true;
    if (str.startsWith("(") && str.endsWith(")")) {
      return nestParen(str.substring(1, str.length() - 1));
    }
    return false;
  }
}
