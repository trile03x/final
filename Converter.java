/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai01;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Converter {

    /**
     * @param args the command line arguments
     */
    int ip;

    Converter() {

    }

    Converter(int ip) {
        this.ip = ip;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input value :");
        ip = sc.nextInt();
        if (ip < 0) {
            System.out.println(" Try again!");
            System.out.println("Enter input value :");
            ip = sc.nextInt();
        }
    }

    public double CtoF() {
        return ip * 1.8 + 32;
    }

    public double KgtoPound() {
        return ip / 0.45359237;
    }

}
 class MainCoverter {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Converter v = new Converter();
        System.out.println("Choose:\n"
                + "1: Convert from C degree to F degree\n"
                + "2: Convert from Kg to Pound\n"
                + "3: Exit converter program");
        System.out.print("Your choice :");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                v.input();
                System.out.println("C to F = " + v.CtoF());
                break;
            case 2:
                v.input();
                System.out.println("Kg to Pound = " + v.KgtoPound());
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Try again !");
        }

    }

}
