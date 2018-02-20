/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public interface List<E> {
    
    public int size();
    public boolean isEmpty();
  //  public void clear();
    public void addFirst(E value);
    public void addLast(E value);
    public E getFirst();
    //public E getLast();
    public E removeFirst();
    public E removeLast();
    public boolean contains(E value);
}
