package com.dsalgo.ds.stack.standard;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.*;

class BalancedParenthesisTest {
    @Test void validate() {
        assertTrue(BalancedParenthesis.isValid("[()]{}{[()()]()}".toCharArray()));

        assertFalse(BalancedParenthesis.isValid("[(])".toCharArray()));
    }

    @Test void emptyString() {
        assertTrue(BalancedParenthesis.isValid("".toCharArray()));
    }
}