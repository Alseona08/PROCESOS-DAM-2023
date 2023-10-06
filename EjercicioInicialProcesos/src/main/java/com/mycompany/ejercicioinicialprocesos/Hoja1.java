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
public class Hoja1 {
    public static void main(String[] args) {
         try{
            ProcessBuilder pb=new ProcessBuilder("ls");
            
            File dir=new File("/home/alex");
            
            pb.directory();//especificamos el directorio desde donde se ejecutará el proceso comando            
            pb.inheritIO();
        
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

