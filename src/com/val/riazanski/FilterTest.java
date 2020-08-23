package com.val.riazanski;

import java.util.ArrayList;

class FilterTest {
    @FunctionalInterface
    interface Predicate {
        boolean test(Triangle abc, Triangle pqr);
    }

    public static void main(String[] args) {
    Triangle filterTriangle = new Triangle(1, 2, 1);
    final int n = 10;
    ArrayList<Triangle> triangleList = new ArrayList<Triangle>();
    int a;
    int b;
    int c;
    for (int i = 0; i < n; i++) {
        a = (int) (Math.random() * 1) + 1;
        b = (int) (Math.random() * 2) + 1;
        c = (int) (Math.random() * 1) + 1;
        triangleList.add(new Triangle(a, b, c));
    }
    System.out.println(triangleList.toString());
    System.out.println("filter" + filterTriangle.toString());
    Predicate predicate = (Triangle abc, Triangle pqr) -> abc.equals(pqr);
    triangleList.removeIf(triangle ->  ! predicate.test(filterTriangle,triangle));
    System.out.print(triangleList.toString());
    }
}
