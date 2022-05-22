package lotto.view;

public class InputView {
    private static final String LOTTO_PURCHASE_GUIDE = "구입금액을 입력해 주세요.";
    private static final String WINNING_LOTTO_INPUT_GUIDE = "지난 주 당첨 번호를 입력해 주세요.";
    public static final String BONUS_LOTTO_NUMBER_INPUT_GUIDE = "보너스 볼을 입력해 주세요.";
    public static final String MANUAL_PURCHASE_LOTTO_COUNT_GUIDE = "수동으로 구매할 로또 수를 입력해 주세요.";
    public static final String MANUAL_PURCHASE_LOTTO_NUMBER_INPUT_GUIDE = "수동으로 구매할 번호를 입력해 주세요.";

    public static void printPurchaseGuide() {
        System.out.println(LOTTO_PURCHASE_GUIDE);
    }

    public static void printWinningLottoInputGuide() {
        System.out.println(WINNING_LOTTO_INPUT_GUIDE);
    }

    public static void printBonusLottoNumberInputGuide() {
        System.out.println(BONUS_LOTTO_NUMBER_INPUT_GUIDE);
    }

    public static void printManualPurchaseLottoCountGuide() {
        System.out.println(MANUAL_PURCHASE_LOTTO_COUNT_GUIDE);
    }

    public static void printManualPurchaseLottoNumberGuide() {
        System.out.println(MANUAL_PURCHASE_LOTTO_NUMBER_INPUT_GUIDE);
    }
}

