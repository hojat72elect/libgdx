package org.jbox2d.pooling;

/**
 * Same functionality of a regular java.util stack. Object return order does not matter.
 *
 * @param <E>
 * @author Daniel
 */
public interface IDynamicStack<E> {

    /**
     * Pops an item off the stack
     *
     * @return
     */
    public E pop();

    /**
     * Pushes an item back on the stack
     *
     * @param argObject
     */
    public void push(E argObject);

}
