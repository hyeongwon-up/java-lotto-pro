package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Split {

  private static final String NULL_INPUT_VALUE = "0";
  private static final String DEFAULT_SPLIT_SEPARATORS= ",|:";
  private static final Pattern CUSTOM_SPLIT_SEPARATOR_PATTERN = Pattern.compile("//(.)\n(.*)");

  private String[] value;

  public Split(String input) {
    this.value = validateInput(input);
  }

  public String[] validateInput(String input) {

    if(input == null || input.isEmpty()) {
      return new String[] {NULL_INPUT_VALUE};
    }

    return parseInput(input);
  }

  private String[] parseInput(String input) {

    Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(input);

    if (matcher.find()) {
      String customToken = matcher.group(1);
      return matcher.group(2).split(customToken);
    }

    return input.split(DEFAULT_SPLIT_SEPARATORS);
  }

  public String[] getValue() {
    return value;
  }

}
