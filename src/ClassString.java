package com;

import java.util.Scanner;

public class ClassString {

    public static void main (String[] args) {

        try{
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            if(a>65){
                throw new Exception("Senior");
            }
        }
    catch (Exception ex1){
            System.out.println("The end");
    }

