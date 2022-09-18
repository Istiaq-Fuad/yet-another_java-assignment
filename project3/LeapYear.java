public class LeapYear {

  int inputYear;
  boolean isLeapYear = false;

  public LeapYear(int inputYear) {
    this.inputYear = inputYear;

    if ((inputYear % 4 == 0 && inputYear % 100 > 0) || (inputYear % 400 == 0)) {
      isLeapYear = true;
    }
  }

  public boolean isLeapYear(){
    return isLeapYear;
  }
}
