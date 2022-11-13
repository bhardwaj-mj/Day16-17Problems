package com.bridgelabz.algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {12,45,34,51,2,9};
        for (int i=0;i< array.length;i++){
            for (int j=0;j< array.length-1;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
