package AssesmentsPractice.A0108;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.PriorityQueue;
import java.util.Stack;

public class CustomQueue<E> extends Stack<E>{
    private Stack<E> s1;
    private Stack<E> s2;


    @Override
    public synchronized E pop() {
       E       obj;
        int     len = size();
        obj = peek();
        removeElementAt(0);
        return obj;
    }
    @Override
    public E push(E item) {
        s1 = new Stack<>();
        s2 = new Stack<>();
        s1.push(item);
        addElement(s2.push(s1.pop()));
        return item;
    }
    @Override
    public synchronized E peek() {
        int     len = size();

        if (len == 0)
            throw new EmptyStackException();
        return elementAt(0);
    }




}
