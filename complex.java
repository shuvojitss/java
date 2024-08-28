import java.util.*;

class Cmplx {
    int r, i;
    
    Cmplx(int r, int i) {
        this.r = r;
        this.i = i;
    }

    void show() {
        System.out.println(r + (i >= 0 ? "+" : "") + i + "i");
    }

    static Cmplx add(Cmplx c1, Cmplx c2) {
        return new Cmplx(c1.r + c2.r, c1.i + c2.i);
    }

    static Cmplx sub(Cmplx c1, Cmplx c2) {
        return new Cmplx(c1.r - c2.r, c1.i - c2.i);
    }

    static Cmplx mul(Cmplx c1, Cmplx c2) {
        return new Cmplx(c1.r * c2.r - c1.i * c2.i, c1.r * c2.i + c1.i * c2.r);
    }

    static double mod(Cmplx c) {
        return Math.sqrt(c.r * c.r + c.i * c.i);
    }

    static Cmplx conj(Cmplx c) {
        return new Cmplx(c.r, -c.i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary parts of C1: ");
        Cmplx c1 = new Cmplx(sc.nextInt(), sc.nextInt());

        System.out.print("Enter real and imaginary parts of C2: ");
        Cmplx c2 = new Cmplx(sc.nextInt(), sc.nextInt());

        System.out.print("\nC1: ");
        c1.show();
        System.out.print("C2: ");
        c2.show();

        Cmplx sum = add(c1, c2);
        Cmplx diff = sub(c1, c2);
        Cmplx prod = mul(c1, c2);
        
        double mod1 = mod(c1);
        double mod2 = mod(c2);

        Cmplx conj1 = conj(c1);
        Cmplx conj2 = conj(c2);

        System.out.print("\nSum: ");
        sum.show();
        System.out.print("Diff: ");
        diff.show();
        System.out.print("Prod: ");
        prod.show();
        System.out.println("Modulus of C1: " + mod1);
        System.out.println("Modulus of C2: " + mod2);
        System.out.print("Conjugate of C1: ");
        conj1.show();
        System.out.print("Conjugate of C2: ");
        conj2.show();
    }
}