/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class SingleLinkList<E> extends ListA<E> {
     private int count;
     private Node<E> head;
    public void SingleLinkList(){
        head = null;
        count = 0;
    }
    
    public int size()
  {
    return count;
  }
  
  public void addFirst(E value)
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<E>(value, head);
     count++;
  }
  
  public E removeFirst()
 {
     Node<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
  }
  
  public E removeLast(){
      if (head != null)
     {
         // pointer to possible tail
         Node<E> finger = head;
         Node<E> temp = finger;
         while (finger != null)  
         {
                temp = finger;
                finger = finger.next();
         } 
         temp.nextElement = null;
         count --;
         return finger.value();
      }else return head.value();
  }
  
  public E getFirst()
  {
      return head.value();
  }
  
  public void addLast(E value)
  // post: adds value to end of list
  {
      // location for new value
      Node<E> temp = new Node<E>(value,null);
      if (head != null)
     {
         // pointer to possible tail
         Node<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }
		 
         finger.setNext(temp);
      } else head = temp;
	  
	  count++;
	  
   } 
  
    public boolean contains(E value){
        Node<E> finger = head;
	  
      while (finger != null &&
             !finger.value().equals(value))
     {
          finger = finger.next();
      }
      return finger != null;
    }
}
