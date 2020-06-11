package com.dsalgo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test void testBoolean() {
        App app = new App();
        assertThat(app.getBoolean()).isEqualTo(true);
    }
}