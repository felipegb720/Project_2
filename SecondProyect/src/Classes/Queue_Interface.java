/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Felipe
 */
public interface Queue_Interface <E> {
    
    /**
	 * Returns queue elements count
	 * @return number of elements in stack
	 */
	int size();
	
	/**
	 * Checks if queue is empty
	 * @return true if queue is empty, false otherwise
	 */
	boolean isEmpty();
	
	/**
	 * Inserts an element in the queue
	 * @param e element to be inserted
	 */
	void enqueue(E e);
	
	/**
	 * Retrieves the first element of the queue without remotion
	 * @return First queue element (null if empty)
	 */
	E first();
	
	/**
	 * Retrieves the first element of the queue removing it
	 * @return First stack element (null if empty)
	 */
	E dequeue();
}
