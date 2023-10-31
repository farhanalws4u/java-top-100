public class Automorphic {

    static boolean checkAutomorphic(int n) {

        if (Math.pow(n, 2) % 10 == n)
            return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkAutomorphic(7));
    }
}
