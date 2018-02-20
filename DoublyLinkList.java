/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class DoublyLinkList<E> extends ListA<E> {
    
    private int count;
    private DoublyLinkNode<E> head;
    private DoublyLinkNode<E> tail;
    
    public DoublyLinkList()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}


public void addFirst(E value)
{
   // construct a new element, making it head
   head = new DoublyLinkNode<E>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}

 public int size()
  {
    return count;
  }

public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
{
   // construct new element
   tail = new DoublyLinkNode<E>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}


public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
{
   DoublyLinkNode<E> temp = tail;
   tail = tail.previous();
   if (tail == null) {
       head = null;
   } else {
       tail.setNext(null);
   }
   count--;
   return temp.value();
}

public E removeFirst()
// pre: list is not empty
// post: removes value from tail of list
{
   DoublyLinkNode<E> temp = head;
   if(count>0)
   head = head.next();
   if (head == null) {
       tail = null;
   } else {
       head.setPrevious(null);
   }
   count--;
   return temp.value();
}

public E getFirst(){
    return head.value();
}

public boolean contains(E value){
    return false;
}
}
