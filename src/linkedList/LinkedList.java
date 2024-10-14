package linkedList;

import com.google.common.base.MoreObjects;

public class LinkedList {
    private int [] itemContainer;
    private int itemSize;
    public LinkedList(int size) {
        itemContainer = new int[size];
        itemSize = 0;

    }
    public void add (int item) {
        if(itemSize < itemContainer.length) {
            itemContainer[itemSize++] = item;
        }
        else{
            System.out.println("The list is full");
        }

    }

    public int get(int index) {
        if (index < 0 || index >= itemSize) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return itemContainer[index];
    }
    public boolean offer(int value) {
        if (itemSize < itemContainer.length) {
            itemContainer[itemSize++] = value;
            return true;
        } else {
            return false;
        }

    }

    public int size() {
        return itemSize;
    }


}