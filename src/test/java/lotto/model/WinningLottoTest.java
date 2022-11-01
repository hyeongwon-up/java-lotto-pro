package lotto.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class WinningLottoTest {

  @DisplayName("올바르지 않은 지난 당첨 번호 입력시 예외 발생 확인")
  @ParameterizedTest(name = "지난 당첨 번호 : {0} 일 떄, 예외 발생하는지 확인")
  @ValueSource(strings = {"1, 2, 3,test, 5, 6", "1, 2, 3, 4. 5, 6"})
  void valid_generate_winning_lotto(String winningLottoNumber) {
    //given
    String bonusNumber = "7";
    // when, then
    assertThatThrownBy(() -> new WinningLotto(winningLottoNumber, bonusNumber))
        .isInstanceOf(IllegalArgumentException.class).hasMessage("올바른 형식의 지난 당청 번호를 입력해주세요.");
  }

  @DisplayName("올바르지 않은 보너스 볼 입력시 예외 발생 확인")
  @ParameterizedTest(name = "보너스 볼 : {0} 일 떄, 예외 발생하는지 확인")
  @ValueSource(strings = {"7, 8", "test"})
  void valid_generate_bonus_number(String bonusNumber) {
    //given
    String winningLottoNumber = "1, 2, 3, 4, 5, 6";
    // when, then
    assertThatThrownBy(() -> new WinningLotto(winningLottoNumber, bonusNumber))
        .isInstanceOf(IllegalArgumentException.class).hasMessage("올바른 형식의 보너스 볼을 입력해주세요.");
  }

  @Test
  @DisplayName("입력받은 지난준 당청 번호와 보너스 볼 입력을 통해 올바르게 WinningLotto 가 생성되는지 확인")
  void generate_winning_lotto() {
    //given
    String winningLottoNumber = "1, 2, 3, 4, 5, 6";
    String bonusNumber = "7";
    //when
    WinningLotto winningLotto = new WinningLotto(winningLottoNumber, bonusNumber);
    //then
    assertAll(
        () -> assertThat(winningLotto.getLotto().getNumbers()).isEqualTo(
            Arrays.asList(1, 2, 3, 4, 5, 6)),
        () -> assertThat(winningLotto.getBonusNumber()).isEqualTo(7)
    );
  }

}