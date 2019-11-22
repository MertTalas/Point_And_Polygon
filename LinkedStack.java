/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje1;

/**
 *
 * @author DELL
 */
public class LinkedStack<T> {

    private Point<T> top;

    public LinkedStack() {
        top=null;
    }

    public boolean isEmpty() {
        if(top==null){
            return true;
        }else{
            return false;
        }
    }

    public void push(Point<T> point) {
        point.next=top;
        top=point;
    }

    public Point<T> pop() {
        Point<T> x=top;
        if(!isEmpty()){
            top=top.next;
        }
        return x;
        
    }

}
