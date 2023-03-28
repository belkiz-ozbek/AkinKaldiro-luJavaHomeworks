package AkınHocaHomeworks;

import java.util.Arrays;

/**
 *
 * @author belkizozbek
 */
public class Stack {

    public static final int MAX_STACK_SIZE = 5;
    boolean full = false;
    boolean empty = true;

    String[] array = new String[MAX_STACK_SIZE];
    int pointer = 0;    //points to first empty cell

    public boolean push(String newElement) {
        if (!full) {
            array[pointer] = newElement;
            pointer++;
            empty = false;
            if (pointer == MAX_STACK_SIZE) {
                full = true;
            }
            return true;
        } else {
            return false;
        }
    }

    public String pop() {
        String lastItem = null;
        if (!empty) {
            lastItem = array[pointer - 1];
            pointer--;
            if (pointer != MAX_STACK_SIZE) {
                full = false;
            }
            if (pointer == 0) {
                empty = true;
            }
        }
        return lastItem;
    }

    //Remove all elements from the stack
    public void clear() {
        Arrays.fill(array, null);
        pointer = 0;
        empty = true;
        full = false;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isFull() {
        return full;
    }

    public int size() {
        return pointer;
    }

    public int getCapacity() {
        return MAX_STACK_SIZE;
    }

    public void showElements() {
        System.out.println("\nArrayin elemanları: ");
        for(String str: array){
            System.out.print(str + " ");
        }
        System.out.println();
    }

}
