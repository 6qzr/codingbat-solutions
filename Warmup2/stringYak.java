public class stringYak {
  public String stringYak(String str) {
    String[] split = str.split("yak");
    String newStr = str.join("", split);
    return newStr;
  }
}
