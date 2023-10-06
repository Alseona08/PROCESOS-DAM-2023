/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioinicialprocesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alex
 */
public class Hoja2 {
    public static void main(String[] args) {
        
        if(args.length!=1){
            System.out.println("Error, debe introducir un parámetro, el directorio de partida");
            System.exit(0);
        }
        
        String dirName;
        
        dirName=args[0];//Recogemos el parámetro recibido
        
        File dir=new File(dirName);
        
        if( !dir.exists() || !dir.isDirectory()){
            System.out.println("Error, el directorio no existe o no es válido");
            System.exit(1);
        }
        
        
         try{
            ProcessBuilder pb=new ProcessBuilder("ls");
            
        
            
            pb.directory();//especificamos el directorio desde donde se ejecutará el proceso comando            
            //pb.inheritIO();
        
            Process p=pb.start();//Creamos uns instancia de ese proceso
            
            InputStreamReader isr=new InputStreamReader(p.getInputStream());
            
            BufferedReader br=new BufferedReader(isr);
            
            String linea;
            
            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }
            
            System.out.println("Programa principal terminado");
        }catch (IOException ioe){
            System.out.println("Error E/S");
        }
        
        
    }
    }

