package com.trial1.example1.part1;
import java.util.*;
 public class demo1 {
     public static void main(String[] args) {
         Scanner sc= new Scanner (System.in);
         System.out.println("ENTER TWO NUMBERS:");
         int a= sc.nextInt();
         int b= sc.nextInt();
         System.out.println("ADDITION :"+ add(a,b));
     }
     public static int add (int a, int b){
         return (a+b);
     }
}