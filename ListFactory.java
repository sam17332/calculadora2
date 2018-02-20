/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class ListFactory {
    public ListA Implementacion(String imp){
        if("3".equals(imp)){
            return new SingleLinkList();
        }else if("4".equals(imp)){
            return new DoublyLinkList();
        }else
        return null;
    }
}
