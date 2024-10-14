package stack;

import stack.exception.StackOverflowException;
import stack.exception.StackUnderFlowException;

import java.util.EmptyStackException;

public class Stack {

    private int[] itemContainer;
    private int itemSize;


    public Stack(int size){
        itemContainer = new int[size];
        itemSize = 0;
    }

    public void push(int item){
        if(itemSize == itemContainer.length){
            throw new StackOverflowException("Stack is full");
        }
        itemContainer[itemSize] = item;
        itemSize++;
    }

    public int pop(){
        if(isEmpty()){
            throw new StackUnderFlowException("Stack is empty");
        }
        int item = itemContainer[itemSize -1];
        itemContainer[itemSize -1] = 0;
        return item;
    }

    public int peek(){
        return itemContainer[itemSize-1];
    }

    public boolean isEmpty(){
        return itemSize == 0;
    }

    public int size(){
        return itemContainer.length;
    }

    public int search(int item){
        for(int index = 0; index < itemContainer.length; index++){
            if(item == itemContainer[index]){
                return index + 1;
            }
        }
        return -1;
    }
}

