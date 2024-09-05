package Lecture3;
    //rare edge cases
    // Ikke pensum
public class Wat {
    public static void main(String[] args) {
        // Dette er ikke pensum, men nyttig å være klar over, og det er litt morsomt.

        // addition of integers and strings
        System.out.print("\"4\" + 4 = ");
        System.out.println("4" + 4 );

        // math with char hint: ascii
        System.out.print("'1' + '1' = ");
        System.out.println('1' + '1');

        // comparing strings hint: .equals
        String foo = "foo";
        System.out.println(foo == "foo");
        System.out.println(foo + "bar" == "foo" + "bar");

        //going too far with int
        System.out.print("2147483647 * 2 = ");
        System.out.println(2147483647 * 2);

        //hint: https://www.youtube.com/watch?v=PZRI1IfStY0
        //floating point cant represent some numbers
        System.out.println(0.1+0.2);

        //too big and too precise floating point number problem
        System.out.println(1000000 + 0.0000000001);
        System.out.println(1000000 + 0.0000000002);
        System.out.println(1000000 + 0.0000000003);
        System.out.println(1000000 + 0.0000000004);
        System.out.println(1000000 + 0.0000000005);


        System.out.println("wat!");

    }

}
