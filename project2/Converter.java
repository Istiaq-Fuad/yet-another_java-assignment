public class Converter {
  final double FLUID_OUNCE_TO_LITER = 0.029586;
  final double GALLON_TO_LITER = 3.758;
  final double OUNCE_TO_GRAM = 28.3495;
  final double POUND_TO_GRAM = 453.6;
  final double INCH_TO_METER = 0.00254;
  final double FOOT_TO_METER = 0.305;
  final double MILE_TO_METER = 1609.0;

  double c_factor = 0.0;
  double value;
  String convert_to;
  String convert_from;
  double convertedValue;

  public void setConvert_from(String convert_from) {
    this.convert_from = convert_from;
  }

  public void setConvert_to(String convert_to) {
    this.convert_to = convert_to;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public double getConvertedValue() {
    return convertedValue;
  }

  public double getValue() {
    return value;
  }

  public String getConvert_from() {
    return convert_from;
  }

  public String getConvert_to() {
    return convert_to;
  }

  public void convert() {
    if (convert_from.equals("fl.oz")) {
      if (convert_to.equals("ml")) {
        c_factor = FLUID_OUNCE_TO_LITER * 1000;
      } else if (convert_to.equals("l")) {
        c_factor = FLUID_OUNCE_TO_LITER;
      }
    } else if (convert_from.equals("gal")) {
      if (convert_to.equals("ml")) {
        c_factor = GALLON_TO_LITER * 1000;
      } else if (convert_to.equals("l")) {
        c_factor = GALLON_TO_LITER;
      }
    } else if (convert_from.equals("oz")) {
      if (convert_to.equals("g")) {
        c_factor = OUNCE_TO_GRAM;
      } else if (convert_to.equals("kg")) {
        c_factor = OUNCE_TO_GRAM / 1000;
      }
    } else if (convert_from.equals("lb")) {
      if (convert_to.equals("g")) {
        c_factor = POUND_TO_GRAM;
      } else if (convert_to.equals("kg")) {
        c_factor = POUND_TO_GRAM / 1000;
      }
    } else if (convert_from.equals("in")) {
      if (convert_to.equals("mm")) {
        c_factor = INCH_TO_METER * 1000;
      } else if (convert_to.equals("cm")) {
        c_factor = INCH_TO_METER * 100;
      } else if (convert_to.equals("m")) {
        c_factor = INCH_TO_METER;
      } else if (convert_to.equals("km")) {
        c_factor = INCH_TO_METER / 1000;
      }
    } else if (convert_from.equals("ft")) {
      if (convert_to.equals("mm")) {
        c_factor = FOOT_TO_METER * 1000;
      } else if (convert_to.equals("cm")) {
        c_factor = FOOT_TO_METER * 100;
      } else if (convert_to.equals("m")) {
        c_factor = FOOT_TO_METER;
      } else if (convert_to.equals("km")) {
        c_factor = FOOT_TO_METER / 1000;
      }
    } else if (convert_from.equals("ml")) {
      if (convert_to.equals("mm")) {
        c_factor = MILE_TO_METER * 1000;
      } else if (convert_to.equals("cm")) {
        c_factor = MILE_TO_METER * 100;
      } else if (convert_to.equals("m")) {
        c_factor = MILE_TO_METER;
      } else if (convert_to.equals("km")) {
        c_factor = MILE_TO_METER / 1000;
      }
    }

    if (c_factor == 0.0) {
      convertedValue = -1;
    } else {
      convertedValue = value * c_factor;
    }
  }
}