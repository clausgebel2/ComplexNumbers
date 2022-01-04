package de.gebelclaus;

public class Complex {
    private double re, im;

    public Complex() {
    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public void setReal(double real) {
        re = real;
    }

    public void setImaginary(double imaginary) {
        im = imaginary;
    }

    public void setRealInPolarFormWithRad(double absoluteValue, double argument) {
        re = absoluteValue * Math.cos(argument);
    }

    public void setRealInPolarFormWithDeg(double absoluteValue, double argument) {
        re = absoluteValue * Math.cos(argument * Math.PI / 180);
    }

    public void setImaginaryInPolarFormWithRad(double absoluteValue, double argument) {
        im = absoluteValue * Math.sin(argument);
    }

    public void setImaginaryInPolarFormWithDeg(double absoluteValue, double argument) {
        im = absoluteValue * Math.sin(argument * Math.PI / 180);
    }

    public void setComplexInPolarFormWithRad(double absoluteValue, double argument) {
        re = absoluteValue * Math.cos(argument);
        im = absoluteValue * Math.sin(argument);
    }

    public void setComplexInPolarFormWithDeg(double absoluteValue, double argument) {
        re = absoluteValue * Math.cos(argument * Math.PI / 180);
        im = absoluteValue * Math.sin(argument * Math.PI / 180);
    }

    public void add(Complex complex) {
        re = re + complex.re;
        im = im + complex.im;
    }

    public void add(double real, double imaginary) {
        re = re + real;
        im = im + imaginary;
    }

    public void addInPolarformWithRad(double absoluteValue, double argument) {
        double real = absoluteValue * Math.cos(argument);
        double imaginary = absoluteValue * Math.sin(argument);
        re = re + real;
        im = im + imaginary;
    }

    public void addInPolarformWithDeg(double absoluteValue, double argument) {
        double real = absoluteValue * Math.cos(argument * Math.PI / 180);
        double imaginary = absoluteValue * Math.sin(argument * Math.PI / 180);
        re = re + real;
        im = im + imaginary;
    }

    public void addReal(double real) {
        re = re + real;
    }

    public void addImaginary(double imaginary) {
        im = im + imaginary;
    }

    public void subtract(Complex complex) {
        re = re - complex.re;
        im = im - complex.im;
    }

    public void subtract(double real, double imaginary) {
        re = re - real;
        im = im - imaginary;
    }

    public void subtractInPolarformWithRad(double absoluteValue, double argument) {
        double real = absoluteValue * Math.cos(argument);
        double imaginary = absoluteValue * Math.sin(argument);
        re = re - real;
        im = im - imaginary;
    }

    public void subtractInPolarformWithDeg(double absolute, double argument) {
        double real = absolute * Math.cos(argument * Math.PI / 180);
        double imaginary = absolute * Math.sin(argument * Math.PI / 180);
        re = re - real;
        im = im - imaginary;
    }

    public void subtractReal(double real) {
        re = re - real;
    }

    public void subtractImaginary(double imaginary) {
        im = im - imaginary;
    }

    public void multiply(Complex complex) {
        double re0 = re;
        double im0 = im;
        re = re0 * complex.re - im0 * complex.im;
        im = re0 * complex.im + im0 * complex.re;
    }

    public void multiply(double real, double imaginary) {
        double re0 = re;
        double im0 = im;
        re = re0 * real - im0 * imaginary;
        im = re0 * imaginary + im0 * real;
    }

    public void multiplyPolarformWithRad(double absolute, double argument) {
        double real = absolute * Math.cos(argument);
        double imaginary = absolute * Math.sin(argument);
        double re0 = re;
        double im0 = im;
        re = re0 * real - im0 * imaginary;
        im = re0 * imaginary + im0 * real;
    }

    public void multiplyPolarformInDeg(double absolute, double argument) {
        double real = absolute * Math.cos(argument * Math.PI / 180);
        double imaginary = absolute * Math.sin(argument * Math.PI / 180);
        double re0 = re;
        double im0 = im;
        re = re0 * real - im0 * imaginary;
        im = re0 * imaginary + im0 * real;
    }

    public void divide(Complex complex) {
        double re0 = re;
        double im0 = im;
        re = (re0 * complex.re + im0 * complex.im) / (complex.re * complex.re + complex.im * complex.im);
        im = (im0 * complex.re - re0 * complex.im) / (complex.re * complex.re + complex.im * complex.im);
    }

    public void divide(double real, double imaginary) {
        double re0 = re;
        double im0 = im;
        re = (re0 * real + im0 * imaginary) / (real * real + imaginary * imaginary);
        im = (im0 * real - re0 * imaginary) / (real * real + imaginary * imaginary);
    }

    public void dividePolarformWithRad(double absolute, double argument) {
        double real = absolute * Math.cos(argument);
        double imaginary = absolute * Math.sin(argument);
        double re0 = re;
        double im0 = im;
        re = (re0 * real + im0 * imaginary) / (real * real + imaginary * imaginary);
        im = (im0 * real - re0 * imaginary) / (real * real + imaginary * imaginary);
    }

    public void dividePolarformWithDeg(double absolute, double argument) {
        double real = absolute * Math.cos(argument * Math.PI / 180);
        double imaginary = absolute * Math.sin(argument * Math.PI / 180);
        double re0 = re;
        double im0 = im;
        re = (re0 * real + im0 * imaginary) / (real * real + imaginary * imaginary);
        im = (im0 * real - re0 * imaginary) / (real * real + imaginary * imaginary);
    }

    public double getAbsolute() {
        return Math.sqrt(re * re + im * im);
    }

    public void showAbsolute() {
        System.out.println(String.format("r = |z| = %.2f", getAbsolute()).replaceAll("[,.]0+", ""));
    }

    public double getArgumentInRad() { // Angle
        return Math.atan2(im, re);
    }

    public void showArgumentInRad() {
        System.out.println(String.format("φ = %.3f", getArgumentInRad()).replaceAll("[,.]0+", ""));
    }

    public double getArgumentInDeg() { // Angle
        return Math.atan2(im, re) * 180 / Math.PI;
    }

    public void showArgumentInDeg() {
        System.out.println(String.format("φ = %.2f°", getArgumentInDeg()).replaceAll("[,.]0+", ""));
    }

    public void showPolarformInRad() {
        System.out.println(String.format("z = %.3f * e^(i * %.3f)", getAbsolute(), getArgumentInRad()).replaceAll("[,.]0+", ""));
    }

    public void showPolarformInDeg() {
        System.out.println(String.format("z = %.2f * e^(i * %.2f°)", getAbsolute(), getArgumentInDeg()).replaceAll("[,.]0+", ""));
    }

    public double getReal() {
        return re;
    }

    public void showReal() {
        System.out.println(String.format("Re(z) = %.2f", re).replaceAll("[,.]0+", ""));
    }

    public void showImaginary() {
        System.out.println(String.format("Im(z) = %.2f", im).replaceAll("[,.]0+", ""));
    }

    public void showRealAndImaginary() {
        System.out.println(String.format("Re(z) = %.2f; Im(z) = %.2f", re, im).replaceAll("[,.]0+", ""));
    }

    public void showAbsoluteAndArgumentInRad() {
        System.out.println(String.format("r = %.2f; φ = %.2f", getAbsolute(), getArgumentInRad()).replaceAll("[,.]0+", ""));
    }

    public void showAbsoluteAndArgumentInDeg() {
        System.out.println(String.format("r = %.2f; φ = %.2f", getAbsolute(), getArgumentInDeg()).replaceAll("[,.]0+", ""));
    }

    public double getImaginary() {
        return im;
    }

    public void showAlgebraform() {
        System.out.println(String.format("z = %.2f + %.2fi", re, im).replaceAll("[,.]0+", ""));
    }

    public String toString() {
        return re + " + " + im + "i";
    }
}
