package com.asif.javapractice.lambdaExpression;

@FunctionalInterface
interface Calculator{
    void add(int num1, int num2);
}

@FunctionalInterface
interface Messenger{
    Message getMsg(String msg);
}

class Message{
    Message(String msg){
        System.out.println(">> message is: "+msg);
    }
}

class Calc{
    public static void addSomething(int num1, int num2) {
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }

    public void addSomething1(int num1, int num2) {
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }
}
public class MethodRefExmple {
    public static void main(String[] args) {
        /**
         * static method ref
         */
        /*Calculator calculator = new Calculator() {
            @Override
            public void add(int num1, int num2) {
                Calc.addSomething(num1, num2);
            }
        };*/
        /*Calculator calculator = (n1, n2) -> Calc.addSomething(n1, n2);*/
        Calculator calculator = Calc::addSomething;
        calculator.add(1, 2);

        /**
         * instance method ref
         */
        Calc calc = new Calc();
        /*Calculator calculator1 = new Calculator() {
            @Override
            public void add(int num1, int num2) {
                calc.addSomething1(num1, num2);
            }
        };*/
        /*Calculator calculator1 = (num1, num2) -> calc.addSomething1(num1, num2);*/
        Calculator calculator1 = calc::addSomething1;
        calculator1.add(5, 6);

        /**
         * constructor method ref
         */
        /*Messenger messenger = new Messenger() {
            @Override
            public Message getMsg(String msg) {
                return new Message(msg);
            }
        };*/
        /*Messenger messenger = msg -> new Message(msg);*/
        Messenger messenger = Message::new;
        messenger.getMsg("hello world");
    }
}
/**
 * output:
 * 1 + 2 = 3
 * 5 + 6 = 11
 * >> message is: hello world
 */