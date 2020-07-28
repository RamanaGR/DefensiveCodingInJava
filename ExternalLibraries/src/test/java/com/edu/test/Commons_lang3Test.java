package com.edu.test;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.Fraction;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

//https://www.javacodeexamples.com/apache-commons-tutorial-with-examples/1588

public class Commons_lang3Test {
    @Test
    public void whenCalledtoString_thenCorrect() {
        String[] array = {"a", "b", "c"};
        Assertions.assertThat(ArrayUtils.toString(array))
                .isEqualTo("{a,b,c}");
    }

    @Test
    public void givenTwoFractionInstances_whenCalledadd_thenCorrect() {
        Fraction fraction1 = Fraction.getFraction(1, 4);
        System.out.println(fraction1);
        Fraction fraction2 = Fraction.getFraction(3, 4);
        Assertions.assertThat(fraction1.add(fraction2).toString()).isEqualTo("1/1");
    }
}
