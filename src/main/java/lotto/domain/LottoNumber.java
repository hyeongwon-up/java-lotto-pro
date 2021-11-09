package lotto.domain;

import lotto.exception.ExceedNumberBoundException;
import lotto.ui.LottoMessage;

import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoNumber implements Comparable<LottoNumber> {
    public static final int MIN_BOUND = 1;
    public static final int MAX_BOUND = 45;
    private static final Map<Integer, LottoNumber> lottoNumbers =
            IntStream.rangeClosed(MIN_BOUND, MAX_BOUND)
                    .mapToObj(LottoNumber::new)
                    .collect(Collectors.toMap(lottoNumber -> lottoNumber.number, Function.identity()));

    private final int number;

    public LottoNumber(int number) {
        this.number = number;
    }

    public static LottoNumber of(String lottoNumber) {
        return of(validateNumeric(lottoNumber));
    }

    public static LottoNumber of(int lottoNumber) {
        if (!lottoNumbers.containsKey(lottoNumber)) {
            validateNumberBound(lottoNumber);
        }

        return lottoNumbers.get(lottoNumber);
    }

    private static int validateNumeric(String lottoNumber) {
        try {
            return Integer.parseInt(lottoNumber);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(LottoMessage.WRONG_NUMBER_FORMAT_MESSAGE);
        }
    }

    private static void validateNumberBound(int integerNumber) {
        if (integerNumber < MIN_BOUND || integerNumber > MAX_BOUND) {
            throw new ExceedNumberBoundException(LottoMessage.WRONG_NUMBER_BOUND_MESSAGE);
        }
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumber otherLottoNumber = (LottoNumber) o;
        return number == otherLottoNumber.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public int compareTo(LottoNumber otherLottoNumber) {
        return number - otherLottoNumber.number;
    }
}