/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai02;

/**
 *
 * @author ACER
 */
public class Retangle extends Shape
{
    double width;
    double height;
    Retangle(){};

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Retangle(String color, boolean filled,double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "This retangle have area = "+getArea()+ " and "+width+" x "+height+";"+super.toString();
    }
    
    @Override
    double getArea() {
        return width*height;
    }

    @Override
    double Perimeter() {
        return (width+height)*2;
    } 
}