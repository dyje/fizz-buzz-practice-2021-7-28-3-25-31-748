package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void should_return_order_number_when_count_of_given_normal_case() {
        // given
        int givenNumber = 2;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.countOf(givenNumber);

        // then
        assertThat(result).isEqualTo("2");
    }
}
