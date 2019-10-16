public class DistinctValues {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a != b && b != c && a != c)
            System.out.println("Num diferentes: 3");
        else if (a == b && b == c)
            System.out.println("Num diferentes: 0");

        if (a != b && a != c && b == c || b != a && b != c && a == c || c != a && c != b && a == b)
            System.out.println("Num diferentes: 1");


    }
}