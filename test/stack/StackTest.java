package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stack.exception.StackOverflowException;
import stack.exception.StackUnderFlowException;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack(10);
    }

    @Test
    void testThatItemCanBePushedOntoAStack() {
        stack.push(15);
        assertEquals(15, stack.peek());
    }

    @Test
    void testThatExceptionIsThrownWhenStackIsFull(){
        Stack stack1 = new Stack(1);
        stack1.push(15);
        assertThrows(StackOverflowException.class, ()->stack1.push(15));
    }

    @Test
    void testThatItemCanBePoppedOnAStack() {
        stack.push(15);
        assertEquals(15, stack.pop());
    }
    @Test
    void popWhenStackIsEmpty_ExceptionIsThrownTest() {
        assertThrows(StackUnderFlowException.class,()-> stack.pop());

    }

    @Test
    void testThatItemCanBePeekedOnAStack() {
        stack.push(15);
        assertEquals(15, stack.peek());
    }

    @Test
    void testThatTheStackIsEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    void testTheSizeOfTheStack() {
        assertEquals(10, stack.size());
    }

    @Test
    void searchForItemInTheStack_ItemIsFoundTest() {
        stack.push(15);
        stack.push(10);
        stack.push(20);
        assertEquals(3,stack.search(20) );
    }
}