package com.bridgelabz.algorithms;

import java.util.Scanner;

public class PrimeInRange {
    static  boolean checkPrime(int n){
        int count =0;
        for (int i=2;i<n;i++){
            if (n%i==0){
                count=1;
                break;
            }
        }
        return count==0? true:false;

    }
    static void primeInRange(int startValue,int endValue) {
        int count = 0;
        for (int i = startValue; i <= endValue; i++) {
            if (i == 1 || i == 0) {
                System.out.println(i + " is neither prime nor non-prime number. ");
            } else {
                boolean res = checkPrime(i);
                if (res) {
                    System.out.println(i+" is a prime number");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Number 1 : ");
        int a = s.nextInt();
        System.out.print("Number 2 : ");
        int b = s.nextInt();
        primeInRange(a,b);
    }
}
