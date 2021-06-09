/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class writeToFile 
{
    FileWriter fileWriter;
    BufferedWriter bufferedWriter;
    
    public void displayCustomersText(){
        try{
            fileWriter = new FileWriter("customerOutFile.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(String.format("%s \n","==============================Customers============================="));
            bufferedWriter.write(String.format("%-15s %-15s %-15s %-15s %-15s\n", "ID","Name","Surname","Date of Birth","Age"));
            bufferedWriter.write("====================================================================\n");
            for (int i = 0; i < Customer.size(); i++) {
                bufferedWriter.write(String.format("%-15s %-15s %-15s %-15s %-15s\n", Customer.get(i).getStHolderId(), Customer.get(i).getFirstName(), Customer.get(i).getSurName(), formatDob(customer.get(i).getDateOfBirth()),getAge(customer.get(i).getDateOfBirth())));
            }
            bufferedWriter.write(String.format("%s\n"," "));
            bufferedWriter.write(String.format("%s",rent()));
        }
        catch(IOException fnfe )
        {
            System.out.println(fnfe);
            System.exit(1);
        }
        try{
            bufferedWriter.close( );
        }
        catch (IOException ioe){
            System.out.println("error closing text file: " + ioe.getMessage());
            System.exit(1);
        }
    }
}
        
}
