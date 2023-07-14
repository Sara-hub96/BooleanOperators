public class Main {
    public static void main(String[] args) {

        Boolean a = 2 <= 2 && !true; // false && false = false

        Boolean b = !false && 3 > 2; // true && true = true

        Boolean t = false; Boolean f = true;
        Boolean c = !(!t || f); //  not true = false

        Boolean d = 6 > 6 ^ !(true && true); // false ^ false = false

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}