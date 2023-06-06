package com.asif.javapractice.lambdaExpression;

@FunctionalInterface
interface Cab{ // when an interface have exactly 1 abstract method we can use it as a functional interface
    void bookCab(String source, String destination); // by default public abstract void bookCab();
}

/*class UberX implements Cab{
    public void bookCab(String source, String destination){
        System.out.println("UberX booked from "+source+" to "+destination+"!! arriving soon!");
    }
}*/
public class LambdaExmple {
    public static void main(String[] args) {
        /**
         * 1.
         */
        /*Cab cab = new UberX();
        cab.bookCab("dhaka", "sylhet");*/

        /**
         * 2. anonymous class
         */
        /*Cab cab = new Cab() {
            @Override
            public void bookCab(String source, String destination) {
                System.out.println("UberX booked from "+source+" to "+destination+"!! arriving soon!");
            }
        };
        cab.bookCab("dhaka", "sylhet");*/

        /**
         * 3. lambda
         */
        Cab cab = (source, destination) -> System.out.println("UberX booked from "+source+" to "+destination+"!! arriving soon!");
        cab.bookCab("dhaka", "sylhet");
    }
}
