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
public class DeviationApp {
    LinkedList List ;
    public  DeviationApp( String args){
        String[] valores = args.replace(", "," ").replace("  "," ").split(" ");
        List = new LinkedList();
        for (String i:valores){
            List.addNode(Double.parseDouble(i));
        }
    }

    public DeviationApp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public  double mean(){
        double sum=0;
        List.toFirst();
        while(List.actual!=null){
            sum+=List.actual.data;
            List.getNext();
        }
        List.toFirst();
        return (sum/List.length);
    }
    
    public  double deviation(){
        double sum=0;
        double mean = mean();
        while(List.actual!=null){
            sum+=(Math.pow(List.actual.data-mean,2));
            List.getNext();
        }
        List.toFirst();
        return Math.sqrt(sum/(List.length-1));
    }
    
}

