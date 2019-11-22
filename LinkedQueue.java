/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje1;

import java.util.NoSuchElementException;

/**
 *
 * @author DELL
 */
public class LinkedQueue<T> {
    private Point<T> first;
    private Point<T> last;

    public LinkedQueue() {
        first=null;
        last=null;
    }
    public boolean isEmpty(){
        if(first==null){
            return true;
        }else{
            return false;
        }
    }
    
    public void enqueue(Point<T> point){
        if(!isEmpty()){
            last.next=point;
        }
        else{
            first=point;
            last=point;
        }
        
    }
    public Point<T> dequeue() {
        Point<T> result;
        result=first;                          
        if (isEmpty()) throw new NoSuchElementException("Queue empty");
        else{
            first=first.next;
        }
        return result;
    }
}

