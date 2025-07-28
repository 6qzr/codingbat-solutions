public class conCat {
  public String conCat(String a, String b) {
    String newStr = a.concat(b);
    if (!a.isEmpty() && !b.isEmpty() &&
        newStr.charAt(a.length()-1) == newStr.charAt(a.length())) {
      newStr = newStr.substring(0, a.length()) + newStr.substring(a.length()+1);
    }
    return newStr;
  }
}
