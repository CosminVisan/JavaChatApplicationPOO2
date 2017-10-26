/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.upb.etti.poo.chat_application.structs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

 /*
 * @author student
 */
public class ServerConfig {
    
    public ServerConfig(String file)throws FileNotFoundException{
        
      Scanner scan = new Scanner(new File(file));
      while(scan.hasNextLine()){
          String line = scan.nextLine().trim();
          
          if(line.startsWith("#") || line.isEmpty()){

              
             
             continue; 
          
      }
          
        
          
    
              
          System.out.println(line);
          
          }
      
        
    }
    
    
    
    
}
