package com.ab.design.principles;

/**
 * @author Arpit Bhardwaj
 *
 * The Liskov Substitution Principle (LSP) applies to inheritance hierarchies,
 * specifying that you should design your classes so that client dependencies can be substituted with subclasses without the client knowing about the change
 *
 *
 * All subclasses must, therefore, operate in the same manner as their base classes.
 * The specific functionality of the subclass may be different but must conform to the expected behaviour of the base class.
 * if a subtype of the supertype does something that the client of the supertype does not expect, then this is in violation of LSP.
 *
 */
public class LiskovSubstitution {

    static class Rectangle {
        private int length;
        private int breadth;
        public int getLength() {
            return length;
        }
        public void setLength(int length) {
            this.length = length;
        }
        public int getBreadth() {
            return breadth;
        }
        public void setBreadth(int breadth) {
            this.breadth = breadth;
        }
        public int getArea() {
            return this.length * this.breadth;
        }
    }

    static class Square extends Rectangle {
        @Override
        public void setBreadth(int breadth) {
            super.setBreadth(breadth);
            super.setLength(breadth);
        }
        @Override
        public void setLength(int length) {
            super.setLength(length);
            super.setBreadth(length);
        }
    }

    public static void main(String[] args) {
        LiskovSubstitution liskovSubstitution = new LiskovSubstitution();
        liskovSubstitution.calculateArea(new Rectangle());
        liskovSubstitution.calculateArea(new Square());
    }
    public void calculateArea(Rectangle r) {
        r.setBreadth(2);
        r.setLength(3);
        // Assert Area
        // From the code, the expected behavior is that
        // the area of the rectangle is equal to 6
        assert r.getArea() == 6 : printError("area", r);
        // Assert Length & Breadth
        // From the code, the expected behavior is that
        // the length should always be equal to 3 and
        // the breadth should always be equal to 2
        assert r.getLength() == 3 : printError("length", r);
        assert r.getBreadth() == 2 : printError("breadth", r);
    }

    private String printError(String errorIdentifer, Rectangle r) {
        return "Unexpected value of " + errorIdentifer + "  for instance of " + r.getClass().getName();
    }

}


