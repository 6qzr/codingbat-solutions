public class wordLen {
  public Map<String, Integer> wordLen(String[] strings) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (String element : strings) {
      map.put(element, element.length());
    }
    return map;
  }
}
