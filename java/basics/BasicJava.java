import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    public static void printNumsFrom1To255() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    public static void printOddNumsFrom1To255() {
        for (int i = 1; i <= 255; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static void printSumOfNumsFrom1To255() {
        int sum = 0;
        for (int i = 1; i <= 255; i++) {
            sum += i;
            System.out.println("Nuevo numero " + i + " Suma: " + sum);
        }
    }

    public static void loopThroughArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void findMaxValue(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public static void calculateAvg(int[] array) {
        int sum = array[0];
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Promedio de " + sum / array.length);
    }

    public static void greaterThanY(int[] array, int y) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > y) {
                count += 1;
            }
        }
        System.out.println(count);
    }

    public static int[] squareArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        return array;
    }

    public static int[] deleteNegativeNums(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }            
        }
        return array;
    }

    public static ArrayList<Double> maxMinAvg(int[] array) {
        int min = array[0];
        int max = array[0];
        int sum = 0;

        ArrayList<Double> arrayList = new ArrayList<Double>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            } 
            sum += array[i];
        }

        arrayList.add((double) max);
        arrayList.add((double) min);
        arrayList.add((double) sum / array.length);

        return arrayList;
    }

    public static int[] changingValuesOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                array[i] = 0;
            } else {
                array[i] = array[i + 1];
            }
        }
        return array;
    } 

    public static void main(String[] args) {
        // printNumsFrom1To255();
        // printOddNumsFrom1To255();
        // printSumOfNumsFrom1To255();
        int[] array = { 1, 3, 5, 7, 9, -1 };
        // loopThroughArray(array);
        // findMaxValue(array);
        // calculateAvg(array);
        // greaterThanY(array, 5);
        // System.out.println(Arrays.toString(squareArray(array)));
        // System.out.println(Arrays.toString(deleteNegativeNums(array)));
        // System.out.println(maxMinAvg(array));
        System.out.println(Arrays.toString(changingValuesOfArray(array)));
    }
}