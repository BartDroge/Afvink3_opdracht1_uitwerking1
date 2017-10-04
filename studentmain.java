/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.util.Scanner;



/**
 *
 * @author Bartdroge
 */
public class studentmain extends Student{
    

     public static void main(String[] args) { 
  
         
        Student s1 = new Student("Bart", 22);
        Student s2 = new Student("naam2", 20);
        Student s3 = new Student("naam3", 18);
        Student s4 = new Student();
       
        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        s4.printInfo();
     }
}
