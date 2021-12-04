## 📄자동차 경주 게임 TODO List

### Car

- [ERROR] 자동차의 이름은 1자 이상 5자 이하가 아닐 경우 `IllegalArgumentException`이 발생해야 한다.
- [ERROR] 자동차의 이름은 공백이 존재할 경우 `IllegalArgumentException`이 발생해야 한다.
- [ERROR] 자동차 이름은 null이 들어올 경우 `IllegalArgumentException`이 발생해야 한다.
- 자동차는 무작위로 주어진 수가 일정 기준 이상일 경우 전진할 수 있다.
- 자동차는 무작위로 주어진 수가 일정 기준 미만일 경우 멈추어있다.
- [ERROR] 자동차는 무작위로 주어진 수가 원하는 범위의 값이 아닐 경우 `IllegalArgumentException`이 발생해야 한다.

### Game

- [ERROR] 게임의 시도할 횟수가 0 미만이거나 숫자가 아닌 경우 `IllegalArgumentException`이 발생해야 한다.
- 자동차 경주가 완주된 후 게임 결과에서 우승자를 확인할 수 있다.
- 게임 우승자가 여러명일 경우 쉼표(,)를 구분자로 반환해야 한다.

### 추가 요구사항

- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.

###  ⌨️ 입력

- 경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)

```
pobi,woni,jun
```

- 시도할 회수

```
5
```

### 🖥 출력

- 각 차수별 실행 결과

```
pobi : --
woni : ----
jun : ---
```

- 단독 우승자 안내 문구

```
최종 우승자 : pobi
```

- 공동 우승자 안내 문구

```
최종 우승자 : pobi, jun
```

- 예외 상황 시 에러 문구를 출력해야 한다. 단, 에러 문구는 [ERROR] 로 시작해야 한다.

```
[ERROR] 시도 횟수는 숫자여야 한다.
```