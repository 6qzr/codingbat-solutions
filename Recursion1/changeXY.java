public class changeXY {
  public String changeXY(String str) {
    if (str.length() == 0) return "";
    if (str.substring(0, 1).equals("x")) {
      return "y" + changeXY(str.substring(1, str.length()));
    }
    return str.substring(0, 1) + changeXY(str.substring(1, str.length()));
  }
}
