/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class Node<E> {
    
    private E data;
    public Node<E> nextElement;
    
    public Node(E v, Node<E> next){
        data = v;
        nextElement = next;
    }
    
    public Node(E v){
        this(v,null);
    }
    
    public void setNext(Node<E> next){
        nextElement = next;
    }
    
    public E value(){
        return data;
    }
    
    public void setValue(E value){
        data = value;
    }
    
    public Node<E> next(){
        return nextElement;
    }
}
