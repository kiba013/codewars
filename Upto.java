package codewars;


public class Upto {
    public static void main(String[] args) {
        System.out.println(seriesSum(9));
    }

    public static String seriesSum(int n) {
        double result = 1;
        double range = 1;
        for(int i = 1; i < n; i++) {
            range +=3;
            result = result + (1/range);
        }
        return String.format("%.2f", result);
    }
}
