public class stringSplosion {
  public String stringSplosion(String str) {
    String newStr = "";
    for (int i = 0; i < str.length(); i++) {
      newStr += str.substring(0, i);
    }
    return newStr + str;
  }
}
