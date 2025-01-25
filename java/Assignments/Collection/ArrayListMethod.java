package Assignments.Collection;

import java.util.InputMismatchException;

public class ArrayListMethod {
    private int capacity = 3;
    private String[] array = new String[capacity];
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(String firstExample) {
        if(isFull()) increaseCapacity();
        this.array[size++] = firstExample;
    }

    private void increaseCapacity() {
        String[] newArray = new String[capacity*2];
        for(int i = 0; i < capacity; i++) newArray[i] = array[i];

        array = newArray;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void add(int index, String secondExample) {
        if(isFull()) increaseCapacity();
        size++;
        for(int i = size - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        this.array[index] = secondExample;
    }

    public void remove(String thirdElement){
        int expectedIndex = -1;

        for(int index = 0; index < size ; index++) {
            if (thirdElement.equals(array[index])) expectedIndex = index;
        }

        if(expectedIndex == -1){
            throw new InputMismatchException("Element not found!");
        }

        for(int index = expectedIndex ; index < size - 1 ; index++){
            array[index] = array[index + 1];
        }

        size--;
    }

    public String get(int index) {
        return array[index];
    }

    public void set(int index, String setExample) {
        array[index] = setExample;
    }

    public boolean contains(String secondExample) {
        for(int i = 0; i < size; i++) {
            if(secondExample.equals(array[i])) return true;
        }
        return false;
    }


    public void clear() {
        size = 0;
    }
}

