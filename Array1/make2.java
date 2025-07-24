public class make2 {
  public int[] make2(int[] a, int[] b) {
    int[] newList = new int[2];
    if (a.length > 1) {
      newList[0] = a[0];
      newList[1] = a[1];
      return newList;
    }
    else if (a.length == 1) {
      newList[0] = a[0];
      newList[1] = b[0];
      return newList;
    }
    newList[0] = b[0];
    newList[1] = b[1];
    return newList;
  }
}
