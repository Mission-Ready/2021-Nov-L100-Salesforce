class TypeCasting {
  public static void main(String[] args) {

    // byte < short < int < long < float < double

    int x = 7;
    long y = x; // Type widening (smaller to larger type). int => long
    System.out.println(x);
    System.out.println(y);

    double temperature = 32.645;
    int tempWithoutFraction = (int) temperature; // Narrow Type casting. prints 32
    System.out.println(temperature);
    System.out.println(tempWithoutFraction);

  }
}
