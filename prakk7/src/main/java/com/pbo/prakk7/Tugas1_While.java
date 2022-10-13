/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.prakk7;
import java.util.Scanner;
/**
 *
 * @Created By Nadya Annisa Juventina 21343060
 */
public class Tugas1_While {
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i=0;

        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();

        while (i<=10){
            System.out.println(nama);
            i++;
        }
    }   
}

