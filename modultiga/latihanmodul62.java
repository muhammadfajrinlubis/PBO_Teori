/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modultiga;

import javax.swing.JOptionPane;

/**
 *
 * @author HP14s FQ2002AU
 */
public class latihanmodul62 {
     public static void main(String[]args){
            String angka="";
            angka=JOptionPane.showInputDialog("Silahkan masukkan angka ");
            int z = Integer.valueOf(angka).intValue();

            String hasil ="";
            if (z>=1&&z<=10){
             hasil += "Valid number";
            }
            else{
             hasil += "Invalid Number";
            }
           JOptionPane.showMessageDialog(null, hasil);
           }
}
