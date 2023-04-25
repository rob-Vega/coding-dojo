import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Puzzle {

    public static ArrayList<Integer> printSumAndReturnGreaterThan10(int[] array) {
        ArrayList<Integer> newArray = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > 10) {
                newArray.add(array[i]);
            }
        }
        System.out.println(sum);
        return newArray;
    }

    public static ArrayList<String> sortPrintAndReturnLongerThan5(ArrayList<String> arrayList) {
        ArrayList<String> newArrayList = new ArrayList<>();

        Collections.sort(arrayList);
        System.out.println(arrayList);

        for (String element : arrayList) {
            if (element.length() > 5) {
                newArrayList.add(element);
            }
        }
        return newArrayList;
    }

    public static ArrayList<Character> sortAlphabet() {
        ArrayList<Character> arrayList = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            arrayList.add(i);  
        }

        Collections.shuffle(arrayList);

        System.out.println(arrayList.get(arrayList.size() - 1));

        if("aeiou".indexOf(arrayList.get(0)) != -1) {
            System.out.println("Vocal");
        } else {
            System.out.println(arrayList.get(0));
        }

        return arrayList;
    }

    public static ArrayList<Integer> randomNumbers() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            arrayList.add(random.nextInt(100 - 55) + 55); 
        }

        return arrayList;
    }

    public static ArrayList<Integer> randomOrderedNumbers() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            arrayList.add(random.nextInt(100 - 55) + 55); 
        }

        Collections.sort(arrayList);
        return arrayList;
    }

    public static String randomString() {
        String string = "";
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            string += (char) random.nextInt('a', 'z') ;
        }
        return string;
    }

    public static ArrayList<String> arrayOfRandomString() {
        ArrayList<String> stringsArray = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            String string = "";

            for (int j = 0; j < 5; j++) {
                string += (char) random.nextInt('a', 'z') ;
            }

            stringsArray.add(string);
        }
        return stringsArray;
    }

    public static void main(String[] args) {
        int[] numbersArray = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        ArrayList<String> namesArray = new ArrayList<>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));

        System.out.println(printSumAndReturnGreaterThan10(numbersArray));
        System.out.println(sortPrintAndReturnLongerThan5(namesArray));
        System.out.println(sortAlphabet());
        System.out.println(randomNumbers());
        System.out.println(randomOrderedNumbers());
        System.out.println(randomString());
        System.out.println(arrayOfRandomString());
    }
}
