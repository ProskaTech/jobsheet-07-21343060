/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.prakk7;

/**
 *
 * @Created By Nadya Annisa Juventina 21343060
 */
public class Tugas3_NestedLoop {
    public static void main(String[] args){
        int baris,kolom;
        int maks=5;
        
        for(baris =1 ; baris <=maks ; baris++){
            for (kolom =1;kolom<=baris;kolom++){
                System.out.print(baris);
            }
            System.out.println("");
        }
    }
}
