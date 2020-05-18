/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Batman
 */
public class EjemploList {
    
    public EjemploList(){
        Principal();
    }
    
    private void Principal(){
        List<Dats> lista = new ArrayList<>();
        Dats da = new Dats();
        
        da.setNombre("victor");
        da.setEdad(40);
        lista.add(da);
        
        da = new Dats();
        
        da.setNombre("Fernando");
        da.setEdad(25);
        
        lista.add(da);
        
        da = new Dats ();
        da.setNombre("Javier");
        da.setEdad(30);
        lista.add(da);
        
        lista.forEach(elemento -> {
            System.out.println("Nombre :" + elemento.getNombre());
            System.out.println("Edad :" + elemento.getEdad());
            
        });
        
        System.out.println("\n\n Otra forma de recorrer los datos");
        
        for(Dats contenido : lista){
            System.out.println("Nombre :" + contenido.getNombre());
            System.out.println("Edad :" + contenido.getEdad());
        }
        
        da = new Dats();
        da.setNombre("Gustavo");
        da.setEdad(19);
        lista.add(da);
        System.out.println("\n\n Tercer forma de recorrer los datos");
        lista.stream().forEach((valores ->{
            System.out.println("Nombre " + valores.getNombre());
            System.out.println("Edad " + valores.getEdad());
            
            if(valores.getNombre().equals("Fernando")){
                System.out.println("Se encontro el dato...");
            }
        }));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new EjemploList();
    }
    
}
