public class wordCount {
  public Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (String element : strings) {
      if (map.containsKey(element)) {
        map.put(element, map.get(element)+1);
      }
      else{
        map.put(element, 1);
      }
    }
    return map;
  }
}
