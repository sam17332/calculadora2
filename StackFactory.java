/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class StackFactory {
    public StackA Implementacion(String imp){
        if("1".equals(imp)){
            return new StackArrayList();
        }else if("2".equals(imp)){
            return new StackVector();
        }else
        return null;
    }
}
