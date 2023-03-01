package collections;

import java.util.ArrayList;


public class TesteArrayList {


    public static void main(String[] args) {


        ArrayList<String> lista = new ArrayList<String>();
       
        lista.add("A");
        lista.add("C");
        lista.add("B");
       
        lista.remove(1);
       
        System.out.println(lista.get(1)); //B
       
        for(String a: lista) {
            System.out.println(a);
        }
    }
}
