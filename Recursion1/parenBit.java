public class parenBit {
  public String parenBit(String str) {
    if (str.startsWith("(")) {
      return str.substring(0, str.indexOf(")") + 1);
    }
    return parenBit(str.substring(1));
  }
}
