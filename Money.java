package codewars;

public class Money {
    public static void main(String[] args) {
        System.out.println(calculateYears(1000.0, 0.01625, 0.18, 1200.0));
    }
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int count = 0;
        while (principal < desired) {
            principal = ((principal * interest) - (principal * interest * tax)) + principal;
            count++;
        }
        System.out.println(principal);
        return count;
    }
}
