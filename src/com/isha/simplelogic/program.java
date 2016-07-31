/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isha.simplelogic;

/**
 *
 * @author isha
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x=10;
        double y=60;
        double total=0;
        double ch=4;//1 add 2 sub 3 div 4 mul
                if (ch==1){
        total = x+y;
                }
                
        else if(ch==2){
          total=x-y;
              }
        else if(ch==3){
            total=x/y;
        }
            else {
                total=x*y;
            
                    
                    
                
        
        }
                            
                
        System.out.println(total);
    }
    
}
