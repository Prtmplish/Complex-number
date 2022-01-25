import java.util.Scanner;
class Complex {
    int real, img;
    Complex()
    {
    }
    Complex(int real, int img)
    {
        this.real = real;
        this.img = img;
    }
    Complex addComplex(Complex C1, Complex C2)
    {
        Complex n = new Complex();
        n.real = C1.real + C2.real;
        n.img = C1.img + C2.img;
        return n;
    }
    Complex subComplex(Complex C1, Complex C2)
    {
        Complex n = new Complex();
        n.real = C1.real - C2.real;
        n.img = C1.img - C2.img;
        return n;
    }
    void display()
    {
        System.out.println("The complex number is : "+ real +"+"+ img + "i");
    }
}
public class Complexaddsub{
    public static void main(String args[])
    {
  			Scanner sc = new Scanner(System.in);
        Complex C1 = new Complex(sc.nextInt(), sc.nextInt());
        C1.display();
        Complex C2 = new Complex(sc.nextInt(), sc.nextInt());
        C2.display();
        Complex C3 = new Complex();
        C3 = C3.addComplex(C1, C2);
        System.out.print("Sum of ");
        C3.display();
        C3 = C3.subComplex(C1, C2);
        System.out.print("Difference of ");
        C3.display();
    }
}