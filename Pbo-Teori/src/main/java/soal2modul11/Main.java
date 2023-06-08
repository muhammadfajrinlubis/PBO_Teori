/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2modul11;

/**
 *
 * @author HP14s FQ2002AU
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Area of " + circle.getName() + ": " + circle.getArea());

        Square square = new Square(5);
        System.out.println("Area of " + square.getName() + ": " + square.getArea());
    }
}
