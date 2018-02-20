/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public abstract class ListA<E> implements List<E> {
    
    public ListA(){
        
    }
    
    public boolean isEmpty(){
        return size() == 0;
    }
    
    public boolean contains(E value){
    return false;
}
}
