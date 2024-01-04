package main.java;

public class Classroom {
    public static void main(String...args) {

        Wilder jeanClaude = new Wilder("Jean-Claude");
        Wilder henri = new Wilder("Henri");

        jeanClaude.setAware(true);
        henri.setAware(false);

        System.out.println(jeanClaude.whoAmI());
        System.out.println(henri.whoAmI());
    }
}
