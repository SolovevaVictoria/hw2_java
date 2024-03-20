package org.example;

public class Main {
    public static void main(String[] args) {
        int [] array = {1, 2, 88, 15, 12, 22, 0, 0};
        System.out.println(countEvens(array));
        System.out.println(diffMaxMin(array));
        System.out.println(zerosNeighbours(array));
    }
    static int countEvens(int[] array){
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) k ++;
        }
        return k;
    }

    static int diffMaxMin(int[] array){
        int maxel = array[0];
        int minel = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxel) maxel = array[i];
            else if (array[i] < minel) minel = array[i];
        }
        return maxel - minel;
    }

    static boolean zerosNeighbours(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == 0 && array[(i + 1)] == 0) return true;
        }
        return false;
    }


}