/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8algoritmos;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Ferhammaren
 */
public class Ordenaciones {

    private ArrayList<Persona> arreglo;
    private int size;

    public Ordenaciones(ArrayList<Persona> arreglo, int size) {
        this.arreglo = arreglo;
        this.size = size;
    }

    public double insercion(ArrayList<Persona> arreglo, int size) {
        double start = System.currentTimeMillis();
        int k;
        Persona aux = arreglo.get(2);
        for (int i = 2; i < size; i++) {
            k = i - 1;
            while (k >= 1 && aux.getAge() < arreglo.get(k).getAge()) {
                Persona assign = arreglo.get(k);
                arreglo.add(k + 1, assign);

                k = k - 1;
            }
            aux = arreglo.remove(k + 1);
        }
        double end = System.currentTimeMillis();
        double time = end - start;
        return time;

    }

    public double seleccion(ArrayList<Persona> a, int size) {
        double start = System.currentTimeMillis();
        Persona menor = a.get(1);
        int k = 0;

        for (int i = 1; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a.get(j).getAge() < menor.getAge()) {
                    menor = a.get(j);
                    k = j;
                }
            }
            a.add(k, a.get(i));
            menor = a.get(i);
        }
        double end = System.currentTimeMillis();
        double time = end - start;
        return time;


    }

    public double Shell(ArrayList<Persona> s, int n) {
        Persona[] a = new Persona[s.size()];
        for (int i = 0; i < s.size(); i++) {
            a[i] = s.get(i);
        }
        double start = System.currentTimeMillis();

        int inter = n + 1;
        Persona aux;
        int band;
        int i;
        do {
            inter = inter / 2;
            band = 1;
            do {
                band = 0;
                i = 1;
                while ((i + inter) </*=*/ n) {
                    if (a[i].getAge() > a[i + inter].getAge()) {
                        aux = a[i];
                        a[i] = a[i + inter];
                        a[i + inter] = aux;
                        band = 1;
                    }
                    i++;
                }
            } while (band == 1);
        } while (inter > 1);
        double end = System.currentTimeMillis();
        double time = end - start;
        return time;
    }

    public double quicksort(ArrayList<Persona> a, int n) {
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a.get(i).getAge();
        }
        double start = System.currentTimeMillis();       
        recursivo(1, n, b);
        double end = System.currentTimeMillis();
        double time = end - start;
        return time;
    }

    public void recursivo(int ini, int fin, int[] a) {
        int izq;
        int der;
        int pos;
        boolean band;
        int aux;        
        izq=ini;
        der=fin-1;
        pos=ini;
        band=true;
        while(band==true){
            band=false;
            while(a[pos]<=a[der]&&pos!=der){
                //System.out.println(der);
                der--;
            }
            if (pos!=der) {
                aux=a[pos];
                a[pos]=a[der];
                a[der]=aux;
                pos=der;
                while(a[pos]>=a[izq]&&pos!=izq){
                izq++;
            }
                if (pos!=izq) {
                    band=true;
                    aux=a[pos];
                    a[pos]=a[izq];
                    a[izq]=aux;
                    pos=izq;
                }
            }
        }
        if (pos-1>ini) {
            recursivo(ini,pos-1,a);
        }
        if(fin>(pos+1)){
            recursivo(pos+1,fin,a);
        }
        
       
    }
}
