public class PythagorianTheoremTest {
    public static void main(String[] args) {
        PythagorianTheorem pythagorianTheorem = new PythagorianTheorem();
        double hypotenuse = pythagorianTheorem.calculateHypotenuse(2, 2.5);
        System.out.println("hypotenuse: " + hypotenuse);
    }
}
