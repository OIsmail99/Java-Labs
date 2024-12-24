package LabFour;

public class Complex<O extends Number> {
    private O real;
    private O imaginary;

    public Complex(O real, O imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public O getReal() {
        return real;
    }

    public O getImaginary() {
        return imaginary;
    }

    public void setReal(O real) {
        this.real = real;
    }

    public void setImaginary(O imaginary) {
        this.imaginary = imaginary;
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public Complex<Double> add(Complex<O> other) {
        // Complex comp = new Complex<R>();
        double real = (this.real.doubleValue() + other.real.doubleValue());
        double imaginary = (this.imaginary.doubleValue() + other.imaginary.doubleValue());
        return new Complex<Double>(real, imaginary);
    }

    public Complex<Double> subtract(Complex<O> other) {
        double newReal = (this.real.doubleValue() - other.real.doubleValue());
        double newImaginary = (this.imaginary.doubleValue() - other.imaginary.doubleValue());
        return new Complex<Double>(newReal, newImaginary);
    }

    public Complex<Double> multiply(Complex<O> other) {
        double newReal = (this.real.doubleValue() * other.real.doubleValue()
                - this.imaginary.doubleValue() * other.imaginary.doubleValue());
        double newImaginary = (this.real.doubleValue() * other.imaginary.doubleValue()
                + this.imaginary.doubleValue() * other.real.doubleValue());
        return new Complex<Double>(newReal, newImaginary);
    }
}
