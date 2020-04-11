package com.ab.design.principles;

/**
 * @author Arpit Bhardwaj
 *
 * The Dependency Inversion Principle (DIP) states that high-level modules should not depend upon low-level modules
 * instead they should depend on abstractions.
 *
 */
public class DependencyInversion {
    //Reader and Writer interfaces that are abstractions
    interface Reader { char getChar(); }
    interface Writer { void putChar(char c);}

    //Keyboard and Printer are details that depend on those abstractions by implementing those interfaces.
    class Keyboard implements Reader {
        @Override
        public char getChar() {
            return 0;
        }
    }

    class Printer implements Writer {
        @Override
        public void putChar(char c) {

        }
    }
    //CharCopier is not concerned to the low-level details of Reader and Writer implementations
    class CharCopier {
        void copy(Reader reader, Writer writer) {
            char c;
            while ((c = reader.getChar()) != c) {
                writer.putChar(c);
            }
        }
    }
}


