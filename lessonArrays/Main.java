package lessonArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task4();
    }

    public static void task1(){
        int[] arr1 = new int[]{1, 2, 3};
        float[] arr2 = {1.57f, 7.654f, 9.986f};
        int[] arr3 = new int[12];
    }

    public static void task2(){
        int[] arr1 = new int[]{1, 2, 3};
        float[] arr2 = {1.57f, 7.654f, 9.986f};
        int[] arr3 = new int[12];

        for (int i = 0; i < arr1.length; i++) {

            if (i == arr1.length - 1){
                System.out.print(arr1[i]);
                System.out.println();
            } else{
                System.out.print(arr1[i] + ", ");
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1){
                System.out.print(arr2[i]);
                System.out.println();
            } else{
                System.out.print(arr2[i] + ", ");
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1){
                System.out.print(arr3[i]);
            } else{
                System.out.print(arr3[i] + ", ");
            }
        }
    }

    public static void task3(){
        int[] arr1 = new int[]{1, 2, 3};
        float[] arr2 = {1.57f, 7.654f, 9.986f};
        int[] arr3 = new int[12];

        for (int i = arr1.length - 1; i >= 0; i--) {

            if (i == 0){
                System.out.print(arr1[i]);
                System.out.println();
            } else{
                System.out.print(arr1[i] + ", ");
            }
        }

        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.print(arr2[i]);
                System.out.println();
            } else{
                System.out.print(arr2[i] + ", ");
            }
        }

        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.print(arr3[i]);
            } else{
                System.out.print(arr3[i] + ", ");
            }
        }
    }

    public static void task4(){
        int[] arr1 = new int[]{1, 2, 3};

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0){
                arr1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }

}
