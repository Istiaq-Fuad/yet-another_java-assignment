public class Tax {
  boolean isMarried;
  double taxableIncome;
  double taxAmount;

  public Tax(boolean isMarried, double taxableIncome) {
    this.isMarried = isMarried;
    this.taxableIncome = taxableIncome;

    if (isMarried) {
      if (taxableIncome <= 16000)
        taxAmount = taxableIncome * (10 / 100.0);
      else if (taxableIncome > 16000 && taxableIncome <= 64000)
        taxAmount = 1600 + ((taxableIncome - 16000) * (15 / 100.0));
      else if (taxableIncome > 64000)
        taxAmount = 8800 + ((taxableIncome - 64000) * (25 / 100.0));
    } else {
      if (taxableIncome <= 8000)
        taxAmount = taxableIncome * (10 / 100.0);
      else if (taxableIncome > 8000 && taxableIncome <= 32000)
        taxAmount = 800 + ((taxableIncome - 800) * (15 / 100.0));
      else if (taxableIncome > 32000)
        taxAmount = 4400 + ((taxableIncome - 32000) * (25 / 100.0));
    }
  }

  public double getTaxAmount() {
    return taxAmount;
  }
}