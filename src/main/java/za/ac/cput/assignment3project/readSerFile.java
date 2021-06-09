/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3project;

/**
 *
 * @author user
 */
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class readSerFile 
{
    ObjectInputStream reader;
    FileWriter Wrt;
    BufferedWriter Bfw;
    OutputStreamWriter output;
    Customer customer;
    Supplier supplier;
    
    ArrayList<Customer> customr = new ArrayList<Customer>();
    ArrayList<Supplier> su = new ArrayList<Supplier>();
   
    public void OpenFile() throws FileNotFoundException
    {
      try
      {
          reader = new ObjectInputStream (new FileInputStream("stakeholder.ser") );
          
      } catch (IOException ex) {
          System.out.println("There was an error, file did not open"+ ex.getMessage());
           // Logger.getLogger(readSerFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void CloseFile()
    {
       try
       {
           reader.close();
       } catch (IOException ex) 
       {
           System.out.println("There was an error, filr did not close"+ ex.getMessage());         
        }
    }
   
    public void readFromStakeHolder()
    {
        
        try
        {
            if (reader.readObject() instanceof Customer )
            {
                customr.add((Customer) reader.readObject());
            }else if(reader.readObject() instanceof Supplier )
            { 
                su.add((Supplier) reader.readObject());
            }
        
           
        } catch (IOException ex) {
            Logger.getLogger(readSerFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(readSerFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void sortCustomerArrayList(){
        String[]sortStHolderID = new String[customer.size()];
        ArrayList<Customer> customer = new ArrayList<Customer>();
        for (int i = 0; i<Customer.size();i++)
        {
            
        }
    }
    
     public static void main(String args[])  
    {
        
    }
    
    
}
