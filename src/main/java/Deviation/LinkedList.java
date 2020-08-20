/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deviation;

/**
 *
 * @author diego
 */
public class LinkedList {
    
    public Node first;
    public Node last;
    public int length;
    public Node actual;
    
    
    
    public LinkedList(){
        this.first = null;
        this.last = null;
        this.length = 0;
    }
    
    /*public LinkedList(double[] data){ 
        for(double num:data) {
            
            if (this.first==null){
                
            }
        }
    }*/
    
    public void addNode(double data){
        Node temp = new Node(data);
        if (this.first == null){
            this.first = this.last = this.actual = temp;
        }else{
            this.actual = this.last;
            this.last = temp;
            this.actual.next = temp;
        }
        this.actual=this.first;
        this.length+=1;
    }
    
    public void removeNode(int pos){
        Node temp = this.first;
        for (int i=0;i<pos;i++){
            temp=temp.next;
        }
        Node previus = temp.previus;
        Node next = temp.next;
        next.addPrevius(previus);
        previus.addNext(next);
        this.length-=1;
        this.actual=this.first;
    }
    
    public void toFirst(){
        this.actual=this.first;
    }
    
    public Node getNext(){
        actual = actual.next;
        return actual;
    }
    
    public Node getPrevius(){
        actual = actual.previus;
        return actual;
    }
    
    public Node getActual(){
        return actual;
    }
    
    public void print(){
        Node temp = this.first;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
