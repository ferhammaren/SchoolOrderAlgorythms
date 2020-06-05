/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8algoritmos;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Ferhammaren
 */
public class ControlPerson {

    Random age = new Random();
    ArrayList<Persona> a;
    Ordenaciones o;

    public ControlPerson(ArrayList<Persona> a) {
        this.a = a;
        o = new Ordenaciones(a, a.size());
    }

//   public void fill(){
//           for (double i = 0; i < 8000; i++) {
//           a.add(new Persona(age.nextInt(122)));
//       }
//           }
    
    //por colonia
    
    /**QuickSort por colonia**/
    public double qsC(ArrayList<Persona> a) {
       
        return o.quicksort(a, 200);
    }
    
      /**ShellSort por colonia**/
    public double shellC(ArrayList<Persona> a){

        return o.Shell(a, 200);
    }
    
      /**Insercion por colonia**/
    public double inserC(ArrayList<Persona> a){
        return o.insercion(a, 200);
    }
    
      /**Seleccion por colonia**/
    public double seleC(ArrayList<Persona> a){
        return o.seleccion(a, 200);
    }
    //fin colonia
    
    
    //por ciudad
    
    /**Insercion por ciudad*/
   public double inserCd(ArrayList<Persona> a){
        return o.insercion(a, 500);
    }
   
   /*QuickSort por ciudad*/
   public double qsCd(ArrayList<Persona> a){
       return o.quicksort(a, 500);
   }
   
   /**Seleccion por ciudad**/
   public double selecCd(ArrayList<Persona> a){
       return o.seleccion(a,500);
   }
    
   /**ShellSort por ciudad**/
   public double shellCd(ArrayList<Persona> a){
       return o.Shell(a, 500);
   }
   //fin ciudad
   
   
     /**QuickSort por Municipio**/
    public double qsM(ArrayList<Persona> a){
       return o.quicksort(a, 1100);
   }
    
    /**ShellSort por municipio**/
     public double shellM(ArrayList<Persona> a){
       return o.Shell(a, 1100);
   }
     
     /**Seleccion por municipio**/
      public double selecM(ArrayList<Persona> a){
       return o.seleccion(a,1100);
   }
      
      /**Insercion por Municipio**/
      public double inserM(ArrayList<Persona> a){
        return o.insercion(a, 1100);
    }
      
          /**QuickSort por Estado**/
    public double qsE(ArrayList<Persona> a){
       return o.quicksort(a, 2500);
   }
    
    /**ShellSort por Estado**/
     public double shellE(ArrayList<Persona> a){
       return o.Shell(a, 2500);
   }
     
     /**Seleccion por estado**/
      public double selecE(ArrayList<Persona> a){
       return o.seleccion(a,2500);
   }
      
      /**Insercion por estado**/
      public double inserE(ArrayList<Persona> a){
        return o.insercion(a, 2500);
    }
      
      
         /**QuickSort por pais**/
    public double qsP(ArrayList<Persona> a){
       return o.quicksort(a, 8000);
   }
    
    /**ShellSort por pais**/
     public double shellP(ArrayList<Persona> a){
       return o.Shell(a, 8000);
   }
     
     /**Seleccion por pais**/ 
      public double selecP(ArrayList<Persona> a){
       return o.seleccion(a,8000);
   }
      
      /**Insercion por pais**/
      public double inserP(ArrayList<Persona> a){
        return o.insercion(a, 8000);
    }
      
}
