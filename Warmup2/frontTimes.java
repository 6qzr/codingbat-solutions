public class frontTimes {
  public String frontTimes(String str, int n) {
    String newStr = "";
    for (int i = 0; i < n; i++) {
      if (str.length() >= 3) {
        newStr += str.substring(0, 3);
      }
      else {
        newStr += str.substring(0, str.length());
      }
    }
    return newStr;
  }
}
