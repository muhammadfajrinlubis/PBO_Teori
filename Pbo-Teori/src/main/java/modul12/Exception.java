/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul12;

/**
 *
 * @author HP14s FQ2002AU
 */
public class Exception {
     public static void main(String[] args) {
        try {
            for (int i = 0; true; i++) {
                System.out.println("args[" + i + "]=" + args[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught:");
            System.out.println(e);
        } finally {
            System.out.println("Quitting...");
        }
    }
}
