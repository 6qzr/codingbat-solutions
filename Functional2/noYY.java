public class noYY {
  public List<String> noYY(List<String> strings) {
    strings.replaceAll(s -> s + "y");
    strings = strings.stream()
      .filter(s -> !s.contains("yy"))
      .collect(Collectors.toList());
    return strings;
  }
}
