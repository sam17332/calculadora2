
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class StackVector<E> extends StackA<E> {
    private Vector<E> data;
    
    public StackVector(){
        data = new Vector<>();
    }
    public void push(E item){
       data.addElement(item);
   }
 
   public E pop(){
       return data.remove(size()-1);
   }
   
   public E peek(){
       return data.get(size()-1);
   }
   
   public boolean empty(){
       return data.size() == 0;
   }
   
   public int size(){
       return data.size();
   }
}
