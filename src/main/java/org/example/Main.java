package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("4/y input y");
        int y= in.nextInt();
        try {
            divide(4, y);
        } catch (DivideZeroException e) {
            System.out.println("На ноль делить нельзя");
        }




    }
    private static double divide(int x,int y) {
        if (y == 0) {
            throw new DivideZeroException();
        }
        return x/y;
    }

    private static class DivideZeroException extends RuntimeException {
        public DivideZeroException() {
        }

        public DivideZeroException(String message) {
            super(message);
        }
    }
}