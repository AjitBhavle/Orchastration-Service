import java.util.ArrayList;
import java.util.List;

public class NumericIdentifier {
  private boolean isNumeric(String val) {
    try {
      Integer.parseInt(val);
    } catch (NumberFormatException nfe) {
      return false;
    }
    return true;
  }

  private int getNumericCount(List<String> list) {
    int numericCount = 0;
    for(String value: list) {
      if(isNumeric(value)) {
        numericCount++;
      }
    }
    return numericCount;
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    for (String data: args) {
      list.add(data);
    }
    NumericIdentifier numericIdentifier = new NumericIdentifier();
    int numericCount = numericIdentifier.getNumericCount(list);
    System.out.println("Number of numerics: " + numericCount);
    System.out.println("Number of non numerics: " + (list.size() - numericCount));
  }
}