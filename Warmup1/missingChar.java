public class missingChar {
  public String missingChar(String str, int n) {
    String newStr = "";
    for (int i = 0; i < str.length(); i++) {
      if (i != n) {
        newStr += str.charAt(i);
      }
    }
    return newStr;
  }
}
