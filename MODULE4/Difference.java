package MODULE4;

// Demonstration of String vs StringBuilder vs StringBuffer

public class Difference {
    public static void main(String[] args) {

        // 1️ String
        String s = "Hello";
        s.concat(" World");
        System.out.println("String after concat: " + s);

        s = s.concat(" World");
        System.out.println("String after reassignment: " + s);


        // 2️ StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder after append: " + sb);


        // 3️ StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer after append: " + sbf);
    }
}