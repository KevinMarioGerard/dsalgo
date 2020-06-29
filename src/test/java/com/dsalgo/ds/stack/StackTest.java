package com.dsalgo.ds.stack;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;

public class StackTest {
    @Test void initStack() {
        Stack<Integer> stack = new Stack<>(Integer.class);
        
        stack.push(1);
        stack.push(2);
        
        assertThat(stack.peek()).isEqualTo(2);
        
        stack.pop();

        assertThat(stack.peek()).isEqualTo(1);
        assertThat(stack.isEmpty()).isEqualTo(false);

        stack.pop();

        assertThat(stack.isEmpty()).isEqualTo(true);
    }
}