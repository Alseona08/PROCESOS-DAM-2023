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
public class Hoja4a {
    public static void main(String[] args) {
        
        if(args.length!=1){
            System.out.println("Error, debe introducir el nombre del usuario");
            System.exit(0);
        }
        
        String usu;
        
        usu=args[0];//Recogemos el nombre del usuario
        
                
        File dir=new File(com);
        
        if( !dir.exists()){  //si no existe ese nombre de archivo dentro de la carpeta de los ejecutablñes del sistema
            System.out.println("Error, el comando introducido no es válido");
            System.exit(1);
        }
        
        
         try{
            ProcessBuilder pb=new ProcessBuilder(com);//Ejecutamos el comando que hemos recibido como parámetro
            
        
            
            //pb.directory();//especificamos el directorio desde donde se ejecutará el proceso comando            
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

