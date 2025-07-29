public class noLong {
  public List<String> noLong(List<String> strings) {
    strings = strings.stream()
      .filter(s -> s.length() < 4)
      .collect(Collectors.toList());
    return strings;
  }
}
