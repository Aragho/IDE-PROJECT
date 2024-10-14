package set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {
    private MySet mySet;

    @BeforeEach
    public void setUp() {
        mySet = new MySet();
    }

    @Test
    public void testThatSetIsEmpty() {
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void testThatAddOneElementToSet() {
        mySet.add(20);
        assertFalse(mySet.isEmpty());
    }

    @Test
    public void testThatSetCanAddMoreElements() {
        mySet.addAll(20, 10, 30, 40, 50);
        assertEquals(5, mySet.size());
    }

    @Test
    public void testThatSetCanRemoveElement() {
        mySet.addAll(20, 10, 30, 40, 50);
        mySet.remove(20);
        assertEquals(4, mySet.size());

    }

    @Test
    public void testThatAllElementInSetCanBeCleared(){
        mySet.addAll(20, 10, 30, 40, 50);
        mySet.clear();
        assertTrue(mySet.isEmpty());
    }
    @Test
    public void checkForElementThatSetIsEmpty_throwsException() {
        assertTrue(mySet.isEmpty());
        assertThrows(NoSuchElementException.class, () ->mySet.contains(100));
    }
    @Test
    public void removeElementWhenSetIsEmpty_throwsException() {
        assertTrue(mySet.isEmpty());
        assertThrows(NoSuchElementException.class, () ->mySet.remove(120));

    }
    @Test
    public void saveDuplicateElement_elementSizeRemainUnchanged(){
        mySet.addAll(20, 10, 30, 40, 50);
        mySet.add(10);
        assertEquals(5, mySet.size());
    }
//    @Test
//    public void testThatSetCanPrintToString() {
//        mySet.addAll(20, 10, 30, 40, 50);
//        assertEquals("(20,10,30,40,50)",mySet.toString());
//
//    }
}
