package com.company;

public class Main {

    public static void main(String[] args) {
        Vector3 test = new Vector3(1,2,3);
        test.printSelf();
        test.multiplyByNumber(5);
        test.printSelf();
        test.add(new Vector3(1,1,1));
        test.printSelf();
        Vector3.vectorMultiply(test, new Vector3(3,4,6)).printSelf();
        System.out.println(Vector3.scalarMultiply(test, new Vector3(3,4,6)));
        System.out.println(test.module());
    }
}


class Vector3 {
    public double x;
    public double y;
    public double z;

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void multiplyByNumber(double number) {
        x *= number;
        y *= number;
        z *= number;
    }

    public void add(Vector3 other) {
        x += other.x;
        y += other.y;
        z += other.z;
    }

    public static double scalarMultiply(Vector3 first, Vector3 second) {
        return first.x * second.x + first.y * second.y + first.z * second.z;
    }

    public static Vector3 vectorMultiply(Vector3 first, Vector3 second) {
        return new Vector3(first.x * second.x, first.y * second.y, first.z * second.z);
    }

    public double module()
    {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public void printSelf()
    {
        System.out.println(x + " " + y + " " + z);
    }
}