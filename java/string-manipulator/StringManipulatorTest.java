public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator manipulator  = new StringManipulator();

        String string = manipulator.trimAndConcat("     Hola    ", "      Mundo   ");
        System.out.println(string);

        int a = manipulator.getIndexOrNull("Coding", 'g');
        System.out.println(a);

        int b = manipulator.getIndexOrNull("Hola Mundo", "Mun");
        System.out.println(b);

        String word = manipulator.concatSubstring("Hola", 1, 3, "mundo");
        System.out.println(word);
    }
}
