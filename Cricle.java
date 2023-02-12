/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai02;

/**
 *
 * @author ACER
 */
public class Cricle extends Shape{
    double radius;
    Cricle(){}

    public Cricle(double radius) {
        this.radius = radius;
    }

    public Cricle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

  
   
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString()
    {
        return "This circle area is: "+getArea()+";"+super.toString();
    }
    @Override
    double getArea() {
        return Math.pow(radius, 2)*Math.PI;
    }

    @Override
    double Perimeter() {
        return radius*2*Math.PI;
    } 
}

