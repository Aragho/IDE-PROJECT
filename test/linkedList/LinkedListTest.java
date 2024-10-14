package linkedList;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest {
    private LinkedList list;
    @BeforeEach
    public void setUp() {
        list = new LinkedList(10);
    }

    @Test
    public void testAdd() {
        list.add(10);
        assertEquals(10,list.get(0));
    }
    @Test
    public void testToGetIndex() {
        list.add(10);
        list.add(20);
        assertEquals(10,list.get(0));
        assertEquals(20,list.get(1));
    }

    @Test
    public void testToAddTheLastElement() {

        assertTrue(list.offer(10));
        assertTrue(list.offer(20));
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(2, list.size());

    }
    @Test
    public void testRemove() {
        list.add(10);
        list.add(20);
        assertEquals(10, list.get(0));
    }
//    @Test
//    public void testTheSize(){
//        list.add(10);
//        list.add(20);
//        assertEquals(10, list.size());
//
//    }
    @Test
    public void testTheListIsCleared() {

    }
}
