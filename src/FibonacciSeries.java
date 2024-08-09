public class FibonacciSeries {
    public static void main(String[] args) {
        int secondlastTerm = 0;
        int lastTerm = 1;
        System.out.print(secondlastTerm + ", " + lastTerm + ", ");
        int nthTerm = 50;
        for (int i = 0; i < nthTerm - 2; i++) {
            int nextTerm = lastTerm + secondlastTerm;
            System.out.print(nextTerm + ",");
            secondlastTerm = lastTerm;
            lastTerm = nextTerm;
        }
    }
}
