package lotto.view;

import java.util.Scanner;

public class InputView {

  private static final Scanner SCANNER = new Scanner(System.in);

  public static String inputMoneyPurchaseLotto() {
    System.out.println("구입금액을 입력해 주세요.");
    String inputMoney = SCANNER.nextLine();
    return inputMoney;
  }

  public static String inputWinningLottoNumber() {
    System.out.println();
    System.out.println("지난 주 당첨 번호를 입력해 주세요.");
    String winningNumber = SCANNER.nextLine();
    return winningNumber;
  }

  public static String inputBonusLottoNumber() {
    System.out.println();
    System.out.println("보너스 볼을 입력해 주세요.");
    return SCANNER.nextLine();
  }
}
