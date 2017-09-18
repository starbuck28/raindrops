class RaindropConverter {
  private String raindropPhrase = "";

  private boolean isDivisibleByThree(int number) {
    return number % 3 == 0;
  }

  private boolean isDivisibleByFive(int number) {
    return number % 5 == 0;
  }

  private boolean isDivisibleBySeven(int number) {
    return number % 7 == 0;
  }

   String convert(int number) {
    if (!isDivisibleByThree(number) && !isDivisibleByFive(number) && !isDivisibleBySeven(number)) {
      raindropPhrase += Integer.toString(number);
    }
    if (isDivisibleByThree(number)) {
      raindropPhrase += "Pling";
    }
    if (isDivisibleByFive(number)) {
      raindropPhrase += "Plang";
    }
    if (isDivisibleBySeven(number)) {
      raindropPhrase += "Plong";
    }
      return raindropPhrase;
  }
}
