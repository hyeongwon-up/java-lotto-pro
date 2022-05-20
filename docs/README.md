# 로또 - TDD

## 1단계 - 학습 테스트 실습
### String Class 테스트 요구사항
1. "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
2. "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
3. "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.
4. "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
5. String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
6. JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.
### Set Collection 테스트 요구사항
1. Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현한다.
2. Set의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는 학습테스트를 구현하려한다.
3. 구현하고 보니 다음과 같이 중복 코드가 계속해서 발생한다.
4. JUnit의 ParameterizedTest를 활용해 중복 코드를 제거해 본다.
5. 요구사항 2는 contains 메소드 결과 값이 true인 경우만 테스트 가능하다. 입력 값에 따라 결과 값이 다른 경우에 대한 테스트도 가능하도록 구현한다.
6. 예를 들어 1, 2, 3 값은 contains 메소드 실행결과 true, 4, 5 값을 넣으면 false 가 반환되는 테스트를 하나의 Test Case로 구현한다.

## 2단계 - 문자열 덧셈 계산기
### 기능 요구사항
1. 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
2. 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
3. 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.
### 프로그래밍 요구사항
1. indent(들여쓰기) depth를 2단계에서 1단계로 줄여라.
2. depth의 경우 if문을 사용하는 경우 1단계의 depth가 증가한다. if문 안에 while문을 사용한다면 depth가 2단계가 된다.
3. 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
4. method가 한 가지 일만 하도록 최대한 작게 만들어라.
5. else를 사용하지 마라.

## 3단계 - 로또(자동)
### 구현 필요기능
- [x] 로또번호 validation 구현
- [x] 로또번호 equals, hashCode 구현
- [x] 로또번호 Set 랜덤 생성 기능 구현
- [x] 로또 구매금액 입력받는 기능 구현
- [x] 로또 구매금액내 로또 Set 생성 기능 구현
- [x] 구입된 로또 Set 출력기능 구현
- [x] 지난 주 당첨번호 입력받는 기능 구현 
- [x] 당첨여부 확인 기능 구현
- [x] 로또 목록 전체 결과 확인 기능 구현
- [x] 수익률 계산 기능 구현
- [x] 당첨현황 및 수익률 출력 기능 구현