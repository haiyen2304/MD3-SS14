public class QuadraticEquationSolver {
    private double a;
    private double b;
    private double c;

    public QuadraticEquationSolver(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void solve() {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt:");
            System.out.println("Nghiệm 1: " + root1);
            System.out.println("Nghiệm 2: " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép:");
            System.out.println("Nghiệm: " + root);
        } else {
            System.out.println("Phương trình vô nghiệm thực.");
        }
    }
}
