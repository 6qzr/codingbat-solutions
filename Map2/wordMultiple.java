public class wordMultiple {
  public Map<String, Boolean> wordMultiple(String[] strings) {
    Map<String, Boolean> map = new HashMap<String, Boolean>();
    for (String element : strings) {
      if (map.containsKey(element)) {
        map.put(element, true);
      } else {
        map.put(element, false);
      }
    }
    return map;
  }
}
