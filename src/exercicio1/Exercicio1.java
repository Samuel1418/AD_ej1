/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String Folder = "/home/oracle/NetBeansProjects/arquivos/";
        // Esto formaria parte del apartado 1 del ejercicio
        File newFolder = new File(Folder + "/arquivosDir");
        boolean created = newFolder.mkdir();
        if(created)
            System.out.println("Directorio creado");
        else
            System.out.println("No se pudo crear la carpeta");
        
        // Esto formaria parte del apartado 2 del ejercicio
        File nuevoDoc = new File(newFolder.getPath() + "/Products.txt");
        boolean crearDoc = nuevoDoc.createNewFile();
        if(crearDoc)
            System.out.println("archivo creado");
        else
            System.out.println("No se pudo crear el archivo");
        
        // Esto formaria parte del apartado 3 del ejercicio
        if(newFolder.getPath() == null ? (Folder + "arquivosDir") == null : newFolder.getPath().equals(Folder + "arquivosDir"))
            System.out.println("Se ha creado en la ruta correcta");
        else
            System.out.println("No se ha creado en la ruta correcta");
        if(nuevoDoc.exists())
            System.out.println("El archivo existe");
        else
            System.out.println("El archivo no existe");
        
        System.out.println(" \n>>>>>>>>>>>>>>>\n");
        
        // Esto formaria parte del apartado 4 del ejercicio
        File newFolder2 = new File(newFolder.getPath()+ "/subdir");
        boolean created2 = newFolder2.mkdir();
        if(created2)
            System.out.println("Directorio creado");
        else
            System.out.println("No se pudo crear la carpeta");
        
        File nuevoDoc2 = new File(newFolder2.getPath() + "/Products2.txt");
        boolean crearDoc2 = nuevoDoc2.createNewFile();
        if(crearDoc2)
            System.out.println("archivo creado");
        else
            System.out.println("No se pudo crear el archivo");
        //corregir la ruta del directorio, funcciona mal
        if(newFolder2.getPath() == null ? (newFolder.getPath() + "subdir") == null : newFolder2.getPath().equals(newFolder.getPath() + "subdir"))
            System.out.println("Se ha creado en la ruta correcta");
        else
            System.out.println("No se ha creado en la ruta correcta");
        if(nuevoDoc2.exists())
            System.out.println("El archivo existe");
        else
            System.out.println("El archivo no existe");
      
        System.out.println(" \n>>>>>>>>>>>>>>>\n");
        
        // Esto formaria parte del apartado 5 del ejercicio
        File dirCont = new File(newFolder.getName());
        File[] contDir = dirCont.listFiles();
        for (File object: contDir) {
            if(object.isFile())
                System.out.println("Nombre del archivo: " + object.getName());
            else if(object.isDirectory())
                System.out.println("Nombre del directorio: " + object.getName());
        }
           System.out.println(" \n>>>>>>>>>>>>>>>\n");
           
        // Esto formaria parte del apartado 6 del ejercicio
           // Preguntar a ricardo si arquivosDir tiene que estar en la ruta
            System.out.println("Ruta de arquivosDir: " + newFolder.getPath()); 
        
        System.out.println(" \n>>>>>>>>>>>>>>>\n");    
            
        // Esto formaria parte del apartado 7 del ejercicio    
           File dirCont2 = new File(newFolder.getName());
           File [] cont = dirCont2.listFiles();
           for (File object2: cont){
               if("Products.txt".equals(object2.getName())){
                   System.out.println("El nombre del archivo es: " + object2.getName());
                   System.out.println("La ruta del archivo es: " + object2.getPath());
                   System.out.println("Se puede leer?: " + object2.canRead());
                   System.out.println("Se puede escribir?: " + object2.canWrite());
                   System.out.println("Tamaño del archivo: " + object2.length());
                   // Esto formaria parte del apartado 8 del ejercicio
                   object2.setReadOnly();
                   // Esto formaria parte del apartado 9 del ejercicio
                   object2.setWritable(true);
                   object2.delete();
               }
           }
           File dirCont3 = new File(Folder);
           File [] cont2 = dirCont3.listFiles();
           for (File object : cont2){
               if(object.getName() == "arquivosDir"){
                   File dirArq = new File(newFolder.getName());
                   File [] contArq = dirArq.listFiles();
                   for (File objArq : contArq){
                        if(objArq.isDirectory()){
                           File dirSub = new File(newFolder2.getName());
                           File [] contSub = dirSub.listFiles();
                           for (File objSub : contSub){
                               objSub.delete();
                           }
                        }
                        objArq.delete();
                   }
               }
               object.delete();
           }
    }
}