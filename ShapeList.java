/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai02;

/**
 *
 * @author ACER
 */
import java.util.*;

public class ShapeList {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Shape arr[] = new Shape[n];

    public void input() {
        for (int i = 0; i < n; i++) {
            System.out.println("- Choose the shape type: retangle (1) or circle (2)");
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("+ Enter the valid value follow step: color filled width height");
                String Color = sc.next();
                boolean filled = sc.nextBoolean();
                double w = sc.nextDouble();
                double h = sc.nextDouble();
                arr[i] = new Retangle(Color, filled, w, h);

            } else if (choose == 2) {
                System.out.println("+ Enter the valid value follow step: color filled radius");
                String Color = sc.next();
                boolean filled = sc.nextBoolean();
                double r = sc.nextDouble();
                arr[i] = new Cricle(r, Color, filled);

            } else {

            }

        }
    }

    public double maxArea() {
        double max = arr[0].getArea();
        for (int i = 0; i < n; i++) {
            if (max <= arr[i].getArea()) {
                max = arr[i].getArea();
            }
        }
        return max;
    }
   public Shape[] swap(Shape arr[])
   {
       for(int i=0;i<n;i++)
       {
           for(int j =i+1;j<n;j++)
           {
               if(arr[i].getArea()>=arr[j].getArea())
               {
                   Shape ob = arr[i];
                   arr[i]=arr[j];
                   arr[j]=ob;
               }
           }
       }
       return arr;
   }
    public void output() {
        System.out.println("* Output  1 :");
        System.out.println("- List of shape you've enter:");
        for (int i = 0; i < n; i++) {
            if (arr[i] instanceof Retangle) {
                System.out.println(arr[i].toString());

            } else {
                System.out.println(arr[i].toString());
            }
        }
        System.out.println("* Output 2 :"
                + "\nThe greatest area is = " + maxArea());
        System.out.println("* Output 3 :");
        Shape brr[]=swap(arr);
        System.out.println("- List of shape after sort decending by area:");
        for (int i = n-1; i >=0; i--) {
            if (arr[i] instanceof Retangle) {
                System.out.println(brr[i].toString());

            } else {
                System.out.println(brr[i].toString());
            }
        }
        


    }
}
