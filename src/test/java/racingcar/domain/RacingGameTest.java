package racingcar.domain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class RacingGameTest {

    private List<String> names;

    @BeforeEach
    void beforeEach() {
        names = Arrays.asList("pobi", "woni", "jun");
    }

    @Nested
    @DisplayName("현재 round가 종료되었는지 확인할 수 있다.")
    class RoundIsFinishedTest {

        @Test
        void isFinishedTest() {
            // given
            Cars cars = Cars.createRandomCars(names);
            Round round = Round.createByStringRound("1");
            RacingGame racingGame = new RacingGame(cars, round);
            racingGame.race();

            // when
            boolean result = racingGame.isFinished();

            // then
            assertTrue(result);
        }

        @Test
        void isNotFinishedTest() {
            // given
            Cars cars = Cars.createRandomCars(names);
            Round round = Round.createByStringRound("1");
            RacingGame racingGame = new RacingGame(cars, round);

            // when
            boolean result = racingGame.isFinished();

            // then
            assertFalse(result);
        }
    }
}