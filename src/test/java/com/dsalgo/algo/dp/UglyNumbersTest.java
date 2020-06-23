package com.dsalgo.algo.dp;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class UglyNumbersTest {
    @Test void getNthNumber() {
        assertThat(UglyNumbers.getNthUgly(150)).isEqualTo(5832);

        assertThat(UglyNumbers.getNthUgly(1)).isEqualTo(1);

        assertThat(UglyNumbers.getNthUgly(11)).isEqualTo(15);
    } 
}