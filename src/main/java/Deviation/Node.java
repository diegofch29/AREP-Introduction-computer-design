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
public class Node {
    public Node previus;
    public Node next;
    public double data;
    
    /**
     *
     * @param data
     */
    public Node(double data){
        this.previus = null;
        this.next = null;
        this.data = data;
    }
    
    /**
     *
     * @param next_
     */
    public void addNext(Node next_){
        this.next = next_;
    }
    
    /**
     *
     * @param previus_
     */
    public void addPrevius(Node previus_){
        this.previus=previus_;
    }
}
