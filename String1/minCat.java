public class minCat {
  public String minCat(String a, String b) {
    String newStr = "";
    if (a.length() < b.length()) {
      newStr = a + b.substring(b.length() - a.length());
    } else if (a.length() > b.length()) {
      newStr = a.substring(a.length() - b.length()) + b;
    } else {
      return a.concat(b);
    }
    return newStr;
  }
}
