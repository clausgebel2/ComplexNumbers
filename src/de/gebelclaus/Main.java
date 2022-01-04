package de.gebelclaus;

public class Main {

    public static void main(String[] args) {
	    Complex c1 = new Complex(2, 1);
	    c1.add(1, 3);
	    c1.showReal();
	    c1.showImaginary();
	    c1.showRealAndImaginary();
	    c1.showAlgebraform();
	    c1.showAbsolute();
        c1.showArgumentInDeg();
        c1.showArgumentInRad();
        c1.showPolarformInDeg();
        System.out.println();

        Complex c2 = new Complex();
        c2.setComplexInPolarFormWithDeg(0.8, 50);
        c2.dividePolarformWithDeg(1.3, 80);
        c2.showAbsoluteAndArgumentInDeg();
        c2.showPolarformInDeg();
    }
}
