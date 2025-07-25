public class startOz {
  public String startOz(String str) {
    String newStr = "";
    if (str.length() >= 1 && str.charAt(0) == 'o') newStr += "o";
    if (str.length() >= 2 && str.charAt(1) == 'z') newStr += "z";
    return newStr;
  }
}
