/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author Bartdroge
 */
//Public class student met private instances naam en studentnummer 
public class Student {
    private String naam;
    private int studentnummer;
    
    public Student(){
        naam = "onbekend";
        studentnummer = 0;
                
    }
    
    public Student(String naam, int studentnummer){
        this.naam = naam;
        this.studentnummer = studentnummer;
    }
    
     public Student(String naam){
        this.naam = naam;
       
    }
      public Student(int studentnummer){
        this.studentnummer = studentnummer;
    }
    
    public String getNaam(){
        return naam;
    }
    public void setNaam(String naam){
        this.naam = naam;
    }
    public int getStudentnummer(){
        return studentnummer;
    }
    public void setStudentnummer(int studentnummer){
        this.studentnummer = studentnummer;
    }
    public void printInfo(){
        System.out.println("Naam: " + getNaam()+ " Studentnummer: " + getStudentnummer());
    }
   
    
        
}
