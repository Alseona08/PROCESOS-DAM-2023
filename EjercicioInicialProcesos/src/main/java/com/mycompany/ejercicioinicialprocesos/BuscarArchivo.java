/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioinicialprocesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author alex
 */
public class BuscarArchivo {
    public static void main(String[] args) {
        
        if(args.length!=1){//Necesito solo un argumento de entrada, el nombre del archivo a buscar
            System.out.println("ERROR, debe introducir el archivo a buscar");
            System.exit(1);
        }
        
        String archivo;
        
        archivo=args[0];
        try{
            ProcessBuilder pb=new ProcessBuilder("ls","-ln");
            
            //pb.inheritIO(); esto puede causar que la entrada y salida se mezclen
            
            File f=new File("/home/alex/Documentos/PROCESOS-DAM-2023/EjercicioInicialProcesos/");
            pb.directory(f);
        
            Process p=pb.start();//Creamos uns instancia de ese proceso
            
            InputStreamReader isr=new InputStreamReader(p.getInputStream());
            
            BufferedReader br=new BufferedReader(isr);
            
            String linea;
            
            boolean encontrado=false;
            
            while(((linea=br.readLine())!=null) && (!encontrado)){
                if(linea.contains(archivo)){
                    System.out.println(linea);
                    encontrado=true;
                }
            }
            
            if(!encontrado){
                System.out.println("El archivo "+archivo+" no está en ese directorio");
            }else{
                System.out.println("El archivo "+archivo+" si está en ese directorio");
            }
            
            System.out.println("Programa principal terminado");
        }catch (IOException ioe){
            System.out.println("Error E/S");
        }
        
        
    }
}
