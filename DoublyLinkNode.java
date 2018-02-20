/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class DoublyLinkNode<E>  {
    private E data;
    private DoublyLinkNode<E> nextElement;
    private DoublyLinkNode<E> previousElement;
    
    public DoublyLinkNode(E v, DoublyLinkNode<E> next, DoublyLinkNode<E> previous){
        data = v;
        nextElement = next;
        if(nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if(previousElement!= null)
            previousElement.nextElement = this;
    }
    
    public DoublyLinkNode(E v){
        this(v,null,null);
    }
    
    public void setNext(DoublyLinkNode<E> next){
        nextElement = next;
    }
    
    public void setPrevious(DoublyLinkNode<E> previous){
        previousElement = previous;
    }
    
    public E value(){
        return data;
    }
    
    public DoublyLinkNode<E>  previous(){
        return previousElement;
    }
    
    public DoublyLinkNode<E> next(){
        return nextElement;
    }
}
