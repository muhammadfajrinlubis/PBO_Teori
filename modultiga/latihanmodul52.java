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
public class latihanmodul52 {
     public static void main (String[] args)
	{
		//input OptionPane1
	String name = "";
	name = JOptionPane.showInputDialog("Please enter your words 1");
	
		//input OptionPane2
	String nama = "";
	nama = JOptionPane.showInputDialog("Please enter your words 2");
	
		//input OptionPane3
	String namawa = "";
	namawa = JOptionPane.showInputDialog("Please enter your words 3 ");
	
	String msg = name +" "+ nama +" "+ namawa ;
	JOptionPane.showMessageDialog(null, msg);
		}	
}
