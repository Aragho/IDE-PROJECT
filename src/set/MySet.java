package set;

import java.util.NoSuchElementException;

public class MySet {
    private int countElement;
    private int [] elementContainer = {};
    public boolean isEmpty() {
        return countElement == 0;
    }

    public void add(int element) {
       if(countElement == 0){
           createOneMoreContainer();
           elementContainer[countElement - 1] = element;
       }
       else
       if(!contains(element)){
           createOneMoreContainer();
           elementContainer[countElement - 1] = element;
        }
    }

    private void createOneMoreContainer() {
        int[]temporary = new int[countElement +1];
        for (int element = 0; element < countElement; element++) {
            temporary[element] = elementContainer[element];
        }
        elementContainer = temporary;
        countElement++;
    }

    public int size() {
        return countElement;
    }

    public void addAll(int... elements) {
        for (int element : elements) {
            add(element);
        }
    }
    public boolean contains(int elementToCheck) {
        if(countElement == 0){
            throw new NoSuchElementException("Set is empty");
        }
        for(int index = 0; index < countElement; index++){
            if (elementContainer[index] == elementToCheck){
                return true;
            }
        }
        return false;
    }

    public void remove(int elementToRemove) {
        if(countElement == 0){
            throw new NoSuchElementException("Set is empty");
        }
        countElement--;
    }

    public void clear() {
        countElement = 0;
    }
//    @Override
//    public String toString() {
//        String concatenate = "";
//        for(int count = 0; count < countElement; count++){
//            if(count != countElement -1){
//                concatenate += integer.parseInt(String.valueOf(elementContainer[count])) + "," + "";
//            }
//        }

}
