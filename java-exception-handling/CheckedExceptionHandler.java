/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


 import java.io.*;
 import java.sql.*;
 
 // Class to handle checked exceptions
 public class CheckedExceptionHandler {
 
     // Simulates IOException
     public void handleIOException() {
         try {
             FileReader reader = new FileReader("nonexistentfile.txt");
             reader.read();
         } catch (IOException e) {
             System.out.println("IOException caught: " + e.getMessage());
         }
     }
 
     // Simulates FileNotFoundException
     public void handleFileNotFoundException() {
         try {
             FileReader reader = new FileReader("anothermissingfile.txt");
         } catch (FileNotFoundException e) {
             System.out.println("FileNotFoundException caught: " + e.getMessage());
         }
     }
 
     // Simulates EOFException
     public void handleEOFException() {
         try (DataInputStream dis = new DataInputStream(new FileInputStream("testfile.txt"))) {
             while (true) {
                 dis.readByte(); // Keep reading until the end of the file
             }
         } catch (EOFException e) {
             System.out.println("EOFException caught: Reached the end of the file.");
         } catch (IOException e) {
             System.out.println("IOException caught: " + e.getMessage());
         }
     }
 
     // Simulates SQLException
     public void handleSQLException() {
         try {
             Connection connection = DriverManager.getConnection("jdbc:invalid:url", "user", "pass");
         } catch (SQLException e) {
             System.out.println("SQLException caught: " + e.getMessage());
         }
     }
 
     // Simulates ClassNotFoundException
     public void handleClassNotFoundException() {
         try {
             Class.forName("non.existent.ClassName");
         } catch (ClassNotFoundException e) {
             System.out.println("ClassNotFoundException caught: " + e.getMessage());
         }
     }
 }
 